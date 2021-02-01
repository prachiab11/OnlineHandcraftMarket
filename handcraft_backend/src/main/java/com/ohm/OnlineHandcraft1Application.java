package com.ohm;

import java.io.IOException;
import java.security.GeneralSecurityException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ohm.pojos.AESAlgorithm;

@SpringBootApplication
public class OnlineHandcraft1Application {

	public static void main(String[] args) throws GeneralSecurityException, IOException {
		SpringApplication.run(OnlineHandcraft1Application.class, args);
		//System.out.println("password"+AESAlgorithm.dt("qWb5r6ojS28k4RQ09OIFxQ=="));
	}

}
