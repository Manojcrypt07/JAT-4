package IntroductionToJava;

import java.util.Scanner;

public class FirstProgram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		int a=sc.nextInt();
		System.out.println("Enter b");
		int b=sc.nextInt();
		System.out.println("Enter c");
		int c=sc.nextInt();
		System.out.println("Enter d");
		int d=sc.nextInt();
		int sum1 =a+b;
		int sum2 =c+d;
		if (sum1>sum2) {
			System.out.println("sum of a and b is greater than sum of c and d");
		}
		else {
			System.out.println("sum of a and b is not greater than sum of c and d");
		}
		

	}

}
