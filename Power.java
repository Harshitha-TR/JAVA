import java.util.Scanner;
public class Power {

	boolean checkNumber() {
		int m;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==0)
		{
			m=n/2;
			n=m;
			if(m%2==0) {
				return true;
			}
			else
				return false;
		}
		return false;
	}
	public static void main(String[] args) {
		Power p= new Power();
		p.checkNumber();
	}
}
