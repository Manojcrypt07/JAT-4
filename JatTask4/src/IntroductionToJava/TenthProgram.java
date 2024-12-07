package IntroductionToJava;

import java.util.Scanner;

public class TenthProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int a=sc.nextInt();
		int b=0;
		while(a>0) {
			a=a/10;
			b++;
		}
		System.out.println("The number of digits is "+b);
	}

}
