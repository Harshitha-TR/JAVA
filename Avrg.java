import java.util.Scanner;
public class Avrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
		int sum  = A+B+C+D+E;
		int avg = sum/5;
		System.out.println("Sum of numbers is "+sum);
		System.out.println("Average of numbers is "+avg);
	}

}
