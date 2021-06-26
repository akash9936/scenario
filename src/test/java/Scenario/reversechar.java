package Scenario;

public class reversechar {
	static int j;
	static char revword;
	public static void main(String[] args) {
		String word = "Akash1234";
		int i = word.length();
		int k = word.length();
		for (j=0;j<k;j++) {
			i--;
			revword=word.charAt(i);
			System.out.print(revword);
		}
	}
}