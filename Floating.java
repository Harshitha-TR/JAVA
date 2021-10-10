import java.util.Scanner;

public class Floating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float num1 = sc.nextFloat();
		if(num1==0) {
			System.out.println("zero");
		}
		else if(num1>0) {
			System.out.println("positive");
		}
		else if(num1<0) {
			System.out.println("negative");
		}
		else if(num1<1) {
			System.out.println("small");
		}
		else if(num1 > 1000000) {
			System.out.println("large");
		}
	}

}
