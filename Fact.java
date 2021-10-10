import java.util.Scanner;
public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int fact=1;
		int num = sc.nextInt();
		while(num>=1) {
			fact = fact * num;
			num--;
		}
		System.out.println(fact);
	}

}
