package oopsSamples;

public class AuditStudent extends Student {
	
	public AuditStudent(String strName) {
		name = strName;
	}
	
	public void goToClass() {

}
 //method overloading
	
	public void goToClass(String direction) {
		System.out.println("goto class after audit completion...");
		System.out.println("the class is in "+direction);
	}
	}
