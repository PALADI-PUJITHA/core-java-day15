package com.manufacturer.main;

import com.manufacturer.Manufacturer;
import com.product.Product;

public class Main{
	
	public static void main(String[] args) {
		Manufacturer manufacturerObject=Manufacturer.getManufacturerObject("Tata", "Hyd", "8910723423");
		Product productObject=Product.getProductObject("Jaguar", "Luxurious", manufacturerObject, 720000);
		
		if(manufacturerObject==null && productObject==null) {
			System.out.println("Invalid Product/Manufacturer");
		}
		
		else {
			System.out.println(manufacturerObject);
			System.out.println(productObject);
		}
	}

}