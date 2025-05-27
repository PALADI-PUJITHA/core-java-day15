package com.product;
import com.manufacturer.Manufacturer;
public class Product {
	private String productName;
	private String caterory;
	private Manufacturer manufacturer;
	private double price;
	
	private Product(String productName,String caterory,Manufacturer manufacturer,double price) {
		this.productName=productName;
		this.caterory=caterory;
		this.manufacturer=manufacturer;
		this.price=price;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getCaterory() {
		return caterory;
	}
	
	public void setCaterory(String caterory) {
		this.caterory = caterory;
	}
	
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "Product: "+productName+"\nCategory : "+caterory+"\nManufacturer Details :"+manufacturer+"\nPrice  :"+price;
	}
	
	public static Product getProductObject(String productName,String caterory,Manufacturer manufacturer,double price) {
		if(price<=0 && manufacturer==null) {
			return null;
		}else {
			return new Product(productName,caterory,manufacturer,price);
		}
		
	}
}