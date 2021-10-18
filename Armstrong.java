import java.util.Scanner;

public class Armstrong {

	static boolean CheckArm(int n)
	{
		int temp, digit=0, last=0,sum=0;
		temp=n;
		while(temp>0)
		{
			temp=temp/10;
			digit++;
		}
		temp=n;
		while(temp>0)
		{
			last = temp%10;
			sum += (Math.pow(last, digit));
			temp = temp/10;
		}
		if(n==sum)
			return true;
		else
			return false;
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(CheckArm(num))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("NO");
		}
	}

}
