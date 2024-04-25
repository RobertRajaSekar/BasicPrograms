package basicPrograms;

public class bloodDonateNestedif {
	public static void main(String[] args) {
		int weight=70;
		String blood="O+";
		if(weight>=50) {
			if(blood=="O+") {
				System.out.println("The person is eligible to donate");
			}
			else {
				System.out.println("The person's blood group not matched ");
			}
		}
		else {
			System.out.println("The person not able to donate");
		}
	}
}
