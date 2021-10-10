import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		if(num1 % 4 == 0) {
			if(num1 % 100 == 0) {
				if(num1 % 400 == 0) {
					System.out.println(num1+ " is a leap year");
				}
				else
					System.out.println(num1+ " is not a leap year");
			}
			else
				System.out.println(num1+ " is a leap year");
		}
		else 
			System.out.println(num1+ " is not a leap year");
		
	}

}
