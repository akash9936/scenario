package Scenario;

public class reversechar {
	public static void main(String[] args) {
		String word = "Akash1234";
		int h = word.length();
		for (int j=0;j<word.length();j++) {
			h--;
		char	revword=word.charAt(h);
			System.out.print(revword);
		}
	}
}