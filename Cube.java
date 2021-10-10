import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			int cube = i*i*i;
			System.out.println(cube);
		}
	}

}
