package com.ohm.dto;


public class OrderDetailsDto {
	 private Long quantity;
	    private Long totalAmount;
		public OrderDetailsDto(Long quantity, Long totalAmount) {
			super();
			this.quantity = quantity;
			this.totalAmount = totalAmount;
		}
		public Long getQuantity() {
			return quantity;
		}
		public void setQuantity(Long quantity) {
			this.quantity = quantity;
		}
		public Long getTotalAmount() {
			return totalAmount;
		}
		public void setTotalAmount(Long totalAmount) {
			this.totalAmount = totalAmount;
		}
	 
	    
}
