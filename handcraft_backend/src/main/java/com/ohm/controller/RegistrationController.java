package com.ohm.controller;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ohm.pojos.AESAlgorithm;
import com.ohm.pojos.ROLENAME;
import com.ohm.pojos.User;
import com.ohm.repository.IUserRepository;
import com.ohm.service.RegistrationService;

@RestController
@CrossOrigin(origins = "*")
public class RegistrationController {

	@Autowired
	private RegistrationService service;
	
	
	Map<String, String> errors;
	
	@PostMapping("/registeruser")
	public ResponseEntity<Object> registerUser(@RequestBody @Valid User user, BindingResult bindingResult) throws GeneralSecurityException, IOException{
		
		if(bindingResult.hasErrors()) {
			errors= new HashMap<>();
			for(FieldError error:bindingResult.getFieldErrors()) {
				errors.put(error.getField(),  error.getDefaultMessage());
			}
			return new ResponseEntity<>(errors, HttpStatus.NOT_ACCEPTABLE);
		}
		
		User u= service.fetchUserByEmail(user.getEmail());
		if(u!=null) {
			//if user already exists
			return new ResponseEntity<>(errors, HttpStatus.CONFLICT);

		}
		
		
		return new ResponseEntity<>(service.saveUser(user), HttpStatus.OK);

	
	}
	
		
	/*@PostMapping("/registeruser")
	public User registerUser(@RequestBody User user) throws Exception {
		
		String tempEmailId= user.getEmail();
		if(tempEmailId != " " && tempEmailId!=null) {
			User userObj=service.fetchUserByEmail(tempEmailId);
			if(userObj != null) {
				throw new Exception("User with Email "+tempEmailId+" is already present");
			}
		} 
		User userObj=null;
		
		
		
		userObj=service.saveUser(user);

		return userObj;
		
	}*/
	
	@PostMapping("/login")
	public User login(@RequestBody User user) throws Exception {
		String tempEmailId= user.getEmail();
		String tempPassword= user.getPassword();

		User userObj=null;
		if(tempEmailId!=null && tempPassword !=null) {
			userObj=service.fetchUserByEmailAndPassword(tempEmailId, tempPassword);
		}
		/*
		 //service
		 * public User fetchUserByEmailAndPassword(String email,String password) throws GeneralSecurityException, IOException {
		return repo.findByEmailAndPassword(email, AESAlgorithm.en(password));
			
	//repository
	 * 
	 * public interface IUserRepository extends JpaRepository<User, Long> {

		public User findByEmail(String email);
		public User findByEmailAndPassword(String email, String password);
		public List<User> findAllByRole(ROLENAME roleName);
}

		
	}
	*/
		
		if(userObj==null) {
			throw new Exception("bad Credentials");
		}
	
		return userObj;
	}
	
	
	
	
}
