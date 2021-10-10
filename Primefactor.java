import java.util.Scanner;
public class Primefactor {

		public static void prime(int n) {
			while(n%2 == 0)
			{
				System.out.println(2 + " ");
				n/=2;
			}
			for(int i=3;i<=Math.sqrt(n);i+=2)
			{
				while(n%i == 0)
				{
					System.out.print(i + " ");
					n/=i;
				}
			}
			if(n>2)
			{
				System.out.print(n);
				
			}
		}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n;
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			prime(n);
	}

}
