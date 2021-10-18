import java.util.Scanner;

public class Count {
	static int MAX= 1000;
	
	static void countChar() {
		int count[] = new int[MAX];
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		int len = str.length();
		for(int i=0;i<len;i++)
		{
			count[str.charAt(i)]++;
		}
		char ch[] = new char[str.length()];
		for(int i=0;i<=len;i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			for(int j=0;j<=i;j++) {
				if(str.charAt(i) == ch[j])
				{
					find++;
				}
			}
			if(find == 1)
			{
				System.out.println(str.charAt(i)+ " - "+count[str.charAt(i)]);
			}
		}
	}

	public static void main(String[] args) {
		countChar();
	}

}
