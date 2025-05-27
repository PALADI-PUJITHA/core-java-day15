package co.student;
import co.school.School;
public class Student {
	String studentName;
	String grade;
	School school;
	double averageMarks;
	private Student(String studentName,String grade,School school,double averageMarks){
		this.studentName=studentName;
		this.grade=grade;
		this.school=school;
		this.averageMarks=averageMarks;
	}
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	public void setGrade(String grade) {
		this.grade=grade;
	}
	public void setSchool(School school) {
		this.school=school;
	}
	public void setAverageMarks(double averageMarks) {
		this.averageMarks=averageMarks;
	}
	public String getStudentName() {
		return studentName;
	}
	public String getGrade() {
		return grade;
	}
	public School getSchool() {
		return school;
	}
	public double getAverageMarks() {
		return averageMarks;
	}
	public String toString() {
		return "Student Name: "+"["+studentName+"], Grade: ["+grade+"], School Object: ["+school+"], Student Average Marks: ["+averageMarks+"}";
	}
	public static Student getStudentObject(String studentName,String grade,School school,double averageMarks) {
		if(averageMarks<0||averageMarks>100||school==null)
			return null;
		else
			return new Student(studentName,grade,school,averageMarks);
	}
}
