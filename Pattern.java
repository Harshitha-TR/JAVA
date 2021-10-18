import java.util.Scanner;
public class Pattern {

	void Stars()
	{
		int i;
		Scanner sc = new Scanner(System.in);
		int row =  sc.nextInt();
		for(int j=row;j>=1;j--)
		{
			for(i=1;i<=j;i++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p= new Pattern();
		p.Stars();
	}

}
