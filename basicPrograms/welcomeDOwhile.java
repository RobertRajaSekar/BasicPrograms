package basicPrograms;

import java.util.Scanner;

public class welcomeDOwhile {
	public static void main(String[] args) {
		char ans ;
		Scanner scanner=new Scanner(System.in);

		do {
			System.out.println("Welcome.... \n");

			System.out.println("Do you want to print again \nType 'Y' for YES Type 'N' for NO");
			ans=scanner.next().charAt(0);

		}
		while(ans =='Y' || ans=='y'); 
		System.out.println("Thank you");
	}
}


