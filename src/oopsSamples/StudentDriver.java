package oopsSamples;

import java.util.ArrayList;


public class StudentDriver {
	public static void main(String[] args) {
	//	Student s1 = new Student("John");
	//	s1.address = "chennai";
	//	s1.gpa = 4.5f;
		
	//	Student s2 = new Student("Peter");
	//	s2.address = "Bengluru";
	//	s2.gpa = 3.5f;
		
	//	System.out.println("Student1    "+s1.name  +s1.gpa  +s1.address);
	//	System.out.println("Student2    "+s2.name  +s2.gpa  +s2.address);
		
		// dynamic binding - parent instance can be changed
		Student mstud = new MNCStudent ("Mike");
		mstud.gpa = 3.5f;
		
		Student pstud = new PayStudent ("Rosy");
		pstud.gpa = 3.5f;
		
		Student astud = new AuditStudent ("Joy");
		
	//	pstud.setAverage(445,66,55);
	//	Student astud = new AuditStudent ("John","chn");
		System.out.println(AuditStudent.college);
		
		
		//to invoke interface method
		MNCStudent mncStud = new MNCStudent("rohith");
		System.out.println(mncStud.calculateAtten());
		System.out.println(mncStud.calculateScore());
		
	//inherited class	
		mstud.goToClass();
		pstud.goToClass();
		
		
		StudentList studList =new StudentList();
        studList.addstudent(mstud);
        studList.addstudent(pstud);
        studList.addstudent(astud);
      
     //Array list is creater for goto class   
        ArrayList<Student> list =studList.getStudents();
        for(Student stud:list) {
        	stud.goToClass();
        	stud.goToClass("next building");
        	System.out.println(stud.calculateCGP());

		stud.goToClass();
	}

 }
}
