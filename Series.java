import java.util.Scanner;
public class Series {

	void Cube() {
		int a,cube;
		Scanner sc  = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			cube = i*i*i;
			System.out.println(cube);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Series series = new Series();
		series.Cube();
	}

}
