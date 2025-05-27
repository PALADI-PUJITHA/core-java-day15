package co.publisher;

public class Publisher {
	private String publisherName;
	private String publisherLocation; 
	private String licenseCode;
	
	private Publisher(String publisherName,String publisherLocation,String licenseCode) {
		this.publisherName=publisherName;
		this.publisherLocation=publisherLocation;
		this.licenseCode=licenseCode;
	}
	
	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getPublisherLocation() {
		return publisherLocation;
	}

	public void setPublisherLocation(String publisherLocation) {
		this.publisherLocation = publisherLocation;
	}

	public String getLicenseCode() {
		return licenseCode;
	}

	public void setLicenseCode(String licenseCode) {
		this.licenseCode = licenseCode;
	}

	public String toString() {
		return "PublisherName is "+publisherName+"\nPublisherLocation is "+publisherLocation+"\nLicenseCode is "+licenseCode;
	}
	
	public static Publisher getPublisherObject(String publisherName,String publisherLocation,String licenseCode) {
		if(licenseCode.startsWith("PUB") && licenseCode.length()==8) {
			return new Publisher(publisherName,publisherLocation,licenseCode);
		}
		else {
			return null;
		}
	}
}