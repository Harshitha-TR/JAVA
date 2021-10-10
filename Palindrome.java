import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rev=0, rem,real;
		real=num;
		while(num !=0)
		{
			rem = num%10;
			rev = rev*10 + rem;
			num= num/10;
		}
		if(real == rev)
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("NOt a palindrome");
		}
	}

}
