import java.util.Scanner;

public class Difference {
	
	int calculateDifference() {
		int i,p = 0,cube=0,m = 0,Sum=0;
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			cube += i*i;
			m += i;
			p=m*m;
			Sum = cube - p;
		}
		System.out.println(cube);
		System.out.println(p);
//		Sum = cube - p;
		System.out.println(Sum);
		return Sum;
	}

	public static void main(String[] args) {
		Difference d = new Difference();
		d.calculateDifference();
	}

}
