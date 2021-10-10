import java.util.Scanner;

public class Week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		if(num1<=7 && num1>0) {
		if(num1 ==1)
			System.out.println("Sunday");
		else if(num1 ==2)
			System.out.println("Monday");
		else if(num1 ==3)
			System.out.println("Tuesday");
		else if(num1 == 4)
			System.out.println("Wednesday");
		else if(num1 == 5)
			System.out.println("Thursday");
		else if(num1 ==6)
			System.out.println("Friday");
		else if(num1 ==7)
			System.out.println("Saturday");
		}
	}

}
