import java.util.Scanner;
public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println("Greatest number is " +num1);
		}
		else if(num2>num1 && num2>num3) {
			System.out.println("Greatest number is " +num2);
		}
		else 
			System.out.println("Greatest number is " +num3);
	}

}
