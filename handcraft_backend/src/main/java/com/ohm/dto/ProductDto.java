package com.ohm.dto;



public class ProductDto {

	    private String productName;
	    private String description;
	    private Integer quantity;
	    private Double price;
	    private String imageUrl;
	    private String category;
	    private String productState;
	    
	    
		public ProductDto(String productName, String description, Integer quantity, Double price, String imageUrl,
				String category, String productState) {
			super();
			this.productName = productName;
			this.description = description;
			this.quantity = quantity;
			this.price = price;
			this.imageUrl = imageUrl;
			this.category = category;
			this.productState = productState;
		}


		public String getProductName() {
			return productName;
		}


		public void setProductName(String productName) {
			this.productName = productName;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}


		public Integer getQuantity() {
			return quantity;
		}


		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}


		public Double getPrice() {
			return price;
		}


		public void setPrice(Double price) {
			this.price = price;
		}


		public String getImageUrl() {
			return imageUrl;
		}


		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}


		public String getCategory() {
			return category;
		}


		public void setCategory(String category) {
			this.category = category;
		}


		public String getProductState() {
			return productState;
		}


		public void setProductState(String productState) {
			this.productState = productState;
		}
	    
	    

}
