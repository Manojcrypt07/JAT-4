package IntroductionToJava;

import java.util.Scanner;

public class EighthProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the words to be printed");
		String a=sc.nextLine();
		for (int i=1;i<=10;i++)
		{
			System.out.println(a);
		}
	}

}
