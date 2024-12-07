package IntroductionToJava;

import java.util.Scanner;

public class NinethProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Hi!! Please enter your name ");
		String a=sc.nextLine();
		
		System.out.println("Please Enter the age");
				int b=sc.nextInt();
		
		
		if (b<60)
		{
			System.out.println(a+" is not a senior citizen");
		}
		else {
			System.out.println(a+" is a senior citizen");
		}
		

	}

}
