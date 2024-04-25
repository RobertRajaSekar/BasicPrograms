package basicPrograms;

import java.util.Scanner;

public class tshirtdowhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char size;
		int price;

		do {
			System.out.print("Enter the T-shirt size (S, M, L, XL): ");
			size = scanner.next().charAt(0);
			System.out.print("Enter the T-shirt price: ₹");
			price = scanner.nextInt();

			if (size == 'S' && price <= 1000) {
				System.out.println("Tom found a T-shirt that fits his criteria!");
			} 
			else {
				System.out.println("Tom did not find a suitable T-shirt.Please try again...");
			}

		} while (size != 'S' || price > 1000);

		System.out.println("Tom successfully bought a T-shirt");

	}
}
