import java.util.Scanner;
public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1,num2,temp,gcd=0;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		while(num2 !=0)
		{
			temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		gcd = num1;
		System.out.println(gcd);
	}

}
