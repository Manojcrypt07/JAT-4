package IntroductionToJava;

import java.util.Scanner;

public class FourthProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a=");
		int a=sc.nextInt();
		System.out.println("Enter b=");;
		int b=sc.nextInt();
		System.out.println("before Swapping");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		int z=a;
		 a=b;
		 b=z;
		 System.out.println("After Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		

	}

}
