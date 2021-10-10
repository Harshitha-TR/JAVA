import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prime,div,n=1;
		while(n<=100) {
			div=0;
			prime = 2;
			while(prime <= n/2) {
				if(n%prime==0) {
					div++;
					break;
				}
				prime++;
			}
			if(div ==0 && n!=1) {
				System.out.println(n);
			}
			n++;
		}
	}

}
