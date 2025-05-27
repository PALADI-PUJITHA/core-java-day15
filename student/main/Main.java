package co.student.main;
import co.school.School;
import co.student.Student;
public class Main {
	public static void main(String[] args) {
	
			School schoolObject=School.getSchoolObject("Chaithaya High School","Nandyal","Provide best education to the students");
			if(schoolObject==null)
				System.out.println("Invalid school name");
			else
				System.out.println(schoolObject);
			Student studentObject=Student.getStudentObject("pujitha", "A", schoolObject,65);
			if(studentObject==null)
				System.out.println("invalid student");
			else
				System.out.println(studentObject);
		
	}
}
