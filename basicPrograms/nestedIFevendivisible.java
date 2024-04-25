package basicPrograms;

public class nestedIFevendivisible {
	public static void main(String[] args) {
		int n=6;
		if(n%2==0) {
			if(n%5==0) {
				System.out.println(" the given number is even and divisible by 5");
			}
			else {
				System.out.println("The given number is even but not divisible by 5");
			}
		}
		else {
			System.out.println("the given number is not even");
		}
	}
}
