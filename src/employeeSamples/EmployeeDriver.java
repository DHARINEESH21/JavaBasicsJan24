package employeeSamples;

public class EmployeeDriver {
	public static void main(String[] args) {
		        Manager manager = new Manager("Dharineesh", "34 tc", 8000.0, "Manager", "QulityEnginee");
		        Developer developer = new Developer("Hari", "67 hy", 2445, "Developer", "Java");
		        Programmer programmer = new Programmer("Arul", "324v", 1020, "Programmer","Python");

		        System.out.println("Manager's Bonus Rs." + manager.calculateBonus());
		        System.out.println("Developer's Bonus: Rs." + developer.calculateBonus());
		        System.out.println("Programmer's Bonus: Rs." + programmer.calculateBonus());

		        System.out.println(manager.generatePerformanceReport());
		        System.out.println(developer.generatePerformanceReport());
		        System.out.println(programmer.generatePerformanceReport());

		        manager.manageProject();
		        developer.manageProject();
		        programmer.manageProject();
		    }
		

	}


