package com.ohm.dto;

public class OrderDto {

	private String customerName;
    private String customerAddress;
    private String customerEmail;
    private String customerPhone;
	    private String paymentType;
	    private String paymentDate;
	    private Long amount;
	    
	    
		public OrderDto(String customerName, String customerAddress, String customerEmail, String customerPhone,
				String paymentType, String paymentDate, Long amount) {
			super();
			this.customerName = customerName;
			this.customerAddress = customerAddress;
			this.customerEmail = customerEmail;
			this.customerPhone = customerPhone;
			this.paymentType = paymentType;
			this.paymentDate = paymentDate;
			this.amount = amount;
		}


		public String getCustomerName() {
			return customerName;
		}


		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}


		public String getCustomerAddress() {
			return customerAddress;
		}


		public void setCustomerAddress(String customerAddress) {
			this.customerAddress = customerAddress;
		}


		public String getCustomerEmail() {
			return customerEmail;
		}


		public void setCustomerEmail(String customerEmail) {
			this.customerEmail = customerEmail;
		}


		public String getCustomerPhone() {
			return customerPhone;
		}


		public void setCustomerPhone(String customerPhone) {
			this.customerPhone = customerPhone;
		}


		public String getPaymentType() {
			return paymentType;
		}


		public void setPaymentType(String paymentType) {
			this.paymentType = paymentType;
		}


		public String getPaymentDate() {
			return paymentDate;
		}


		public void setPaymentDate(String paymentDate) {
			this.paymentDate = paymentDate;
		}


		public Long getAmount() {
			return amount;
		}


		public void setAmount(Long amount) {
			this.amount = amount;
		}
	    
		
	    
	    
	    
	    
	 
	    

}
