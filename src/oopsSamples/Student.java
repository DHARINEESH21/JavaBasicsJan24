package oopsSamples;

public abstract class Student {
	String name;
	String address;
	float gpa;
	static final String college="IITC";//cannot be changed it s constant
	private double average;
	
	public Student() {
		
	}
	public Student (String strName) {
		name = strName;
	}
//	public void goToClass() {
	//	System.out.println("Goto Class");
		
//	}
	public final double calculateCGP() {
		return 10.5;

		}
		public abstract void goToClass();
		public void goToClass (String direction) {
			
		}
		
		public double getAverage()
		{
			return average;
		}
		
		public void setAverage(double s1, double s2, double s3)
		{
			average = s1+s2+s3/3;
		}
	

}
