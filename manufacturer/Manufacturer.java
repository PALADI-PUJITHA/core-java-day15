package com.manufacturer;

public class Manufacturer {
	private String manufacturerName;
	private String manufacturerAddress;
	private String registrartionNumber;
	private Manufacturer(String manufacturerName,String manufacturerAddress,String registrartionNumber) {
		this.manufacturerName=manufacturerName;
		this.manufacturerAddress=manufacturerAddress;
		this.registrartionNumber=registrartionNumber;
	}
	public String getManufacturerName() {
		return manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	public String getManufacturerAddress() {
		return manufacturerAddress;
	}
	public void setManufacturerAddress(String manufacturerAddress) {
		this.manufacturerAddress = manufacturerAddress;
	}
	public String getRegistrartionNumber() {
		return registrartionNumber;
	}
	public void setRegistrartionNumber(String registrartionNumber) {
		this.registrartionNumber = registrartionNumber;
	}
	public String toString() {
		return "Manufacturer : "+manufacturerName+" Registration : "+registrartionNumber+" Address : "+registrartionNumber;
	}
	public static Manufacturer getManufacturerObject(String manufacturerName,String manufacturerAddress,String registrartionNumber) {
		if(registrartionNumber.length()!=10) {
			return null;
		}
		else {
			return new Manufacturer(manufacturerName,manufacturerAddress,registrartionNumber);
		}
	}
}