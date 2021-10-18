import java.util.Scanner;

public class Employee {
	String name;
	int empid;
	String contact;
	double salary;
	String department;
	char gender;
	Address add = new Address();
	String designation;

	public Employee(String string, int i, String string2, int j, String string3, String string4, String string5) {
		// TODO Auto-generated constructor stub
	}
	
	Employee(String name,int empid,String contact,double salary,String department,char gender, String designation){
		this.name=name;
		this.empid=empid;
		this.contact=contact;
		this.salary=1000000;
		this.department=department;
		this.gender=gender;
		this.designation=designation;
		System.out.println("Enter Address Details");
		add.address();
	}
	
	double cmsn(double percentage) {
		double commission= percentage/100* salary;
		double slry = commission+salary;
		return commission;
	}

	void displayDetails() {
		System.out.println(name);
		System.out.println(empid);
		System.out.println(contact);
		System.out.println(salary);
		System.out.println(department);
		System.out.println(gender);
		add.showAddressDetails();
		System.out.println(designation);
	}

}