package basicPrograms;

public class positiveoddWhile {
	public static void main(String[] args) {
		int i=-10;
		while(i<=10) {
			if(i%2!=0&&i>0) {
				System.out.println(i);
			}
			i++;
		}
	}
}
