import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		if(num1 < 0) {
			System.out.println(num1+ " is negative");
		}
		else { 
			System.out.println(num1+ " is positive" );
		}
	}
}

