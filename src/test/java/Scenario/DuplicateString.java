package Scenario;

public class DuplicateString {
//Identifies duplicate Value from String Array
	public static void main(String[] args) {
		String name[]= {"Apple","toy","Sweet","Apple"};
		for(int i=0;i<name.length; i++) {
			for(int j=i+1;j<name.length; j++) {
				if(name[i].equals(name[j])) {
					System.out.println("Duplicate String is "+name[i]);
				}
			}
		}
	}
}
