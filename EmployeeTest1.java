import java.util.Scanner;

public class EmployeeTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Employee Employee1= new Employee("Har", 1001, "987654", 123456, "EPD", "Mysore", "Manager");
		Employee Employee2= new Employee("Div", 1002, "765454", 232123, "EPD", "Mysore", "Trainee");
		Employee Employee3= new Employee("Kiran", 1003, "986734", 12131, "EPD", "Mysore", "Trainee");
		Employee Employee4= new Employee("Niv", 1004, "93465", 1234, "EPD", "Mysore", "Manager");
		Employee Employee5= new Employee("Liki", 1005, "7655342", 234221, "EPD", "Mysore", "Manager");*/
		
		//Employee1.getInput();
		//Employee1.displayDetails();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name");
		String name = sc.next();
		System.out.println("Enter Employee id");
		int empid =  sc.nextInt();
		System.out.println("Enter contact details");
		String contact = sc.next();
		System.out.println("salary");
		double salary = sc.nextDouble();
		System.out.println("Enter DEpartment");
		String department = sc.next();
		System.out.println("Enter your Gender");
		char gender = sc.next().charAt(0);
		System.out.println("Enter designation");
		String designation = sc.next();
		Employee Emp = new Employee(name,empid,contact,salary,department,gender, designation);
		Emp.displayDetails();
	}
}
