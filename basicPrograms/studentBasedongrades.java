package basicPrograms;

import java.util.Scanner;

public class studentBasedongrades {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Grade (capital letters only) ");
	char ch=sc.next().charAt(0);
	
	if(ch=='A'){
		System.out.println("first class");
	}
	else if(ch=='B'){
		System.out.println("Second class");
	}
	else if(ch=='C'){
		System.out.println("Third class");
	}
	else {
		System.out.println("Fail");
	}
}
}
