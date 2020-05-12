
public class Student {
	private String name,ssn;
	private int studentId;
	private double gpa;
	
	public Student(int x, String n, String s, double g) {
		// TODO Auto-generated constructor stub

		studentId = x;
		name = n;
		ssn = s;
		gpa = g;
	}
	public Student() {
		
	}
		public int getStudentId() {
			return studentId;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSSN() {
			return ssn;
		}
		public void setSSN(String ssn) {
			this.ssn = ssn;
		}
		public double getGPA() {
			return gpa;
		}
		public void setGPA(double gpa) {
			this.gpa = gpa;
		}
		
		public String toString() {
			String s1 = "";
			s1 = "Student Id : "+getStudentId()+
					" Student Name : "+getName()+
					" Student SSN : "+getSSN()+
					" Student GPA : "+getGPA();
			return s1;
		}

}
