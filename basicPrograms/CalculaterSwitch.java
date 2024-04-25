package basicPrograms;

import java.util.Scanner;

public class CalculaterSwitch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Choice...\n 1)Addition \n 2)Subtraction \n 3)Multipication  \n 4)Division");
		int choice=sc.nextInt();
		System.out.println("Enter 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			break;
		default:
			System.out.println("Enter a valid choice");
		}

	}
}
