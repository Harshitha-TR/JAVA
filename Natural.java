import java.util.Scanner;
public class Natural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,sum = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(n);
		for(i=1;i<=n;i++)
		{
			sum += i;
		}
		System.out.println("Sum of natural numbers is "+sum);
	}

}
