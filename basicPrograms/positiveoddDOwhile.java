package basicPrograms;

public class positiveoddDOwhile {
	public static void main(String[] args) {
		int i=-10;
		do {
			if(i%2!=0&&i>0) {
				System.out.println(i);
			}
			i++;
		}
		while(i<=10);
	}
}
