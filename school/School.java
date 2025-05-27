package co.school;

public class School {
	String schoolName;
	String schoolAddress;
	String schoolMotto;
	private School(String schoolName,String schoolAddress,String schoolMotto) {
		this.schoolName=schoolName;
		this.schoolAddress=schoolAddress;
		this.schoolMotto=schoolMotto;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName=schoolName;
	}
	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress=schoolAddress;
	}
	public void setSchoolMotto(String schoolMotto) {
		this.schoolMotto=schoolMotto;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public String getSchoolAddress() {
		return schoolMotto;
	}
	public String toString() {
		return "School Name: "+"["+schoolName+"], Address: ["+schoolAddress+"], Motto: ["+schoolMotto+"]";
	}
	public static School getSchoolObject(String schoolName,String schoolAddress,String schoolMotto) {
		if (schoolName==null||schoolAddress==null||schoolMotto==null)
			return null;
 
		return new School(schoolName,schoolAddress,schoolMotto);
	}
}