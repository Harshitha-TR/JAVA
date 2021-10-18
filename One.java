package ExtraCoreJava;

import java.util.Scanner;

public class One {
	
	public static void main(String[] args) {
		int aNumber;
		Scanner sc = new Scanner(System.in);
		aNumber = sc.nextInt();
		if (aNumber >= 0) {
			if (aNumber == 0)
				System.out.println("first string");
			else 
				System.out.println("second string");
		System.out.println("third string");
		}
	}

}
