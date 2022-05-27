package exampleprograms;

class triangle{
	
}
public class StudentDetails {
	public String studentName() {
		String studentName="SAMUEL";
		System.out.println("The name of the student:"+studentName);
		return null;
	}
	public void studentDepartment() {
		String studentDepartment="EEE";
		System.out.println("The department of the student:"+studentDepartment);
	}
public static void main(String[] args) {
	StudentDetails studentDetails=new StudentDetails();
	studentDetails.studentName();
	studentDetails.studentDepartment();
	}
}
