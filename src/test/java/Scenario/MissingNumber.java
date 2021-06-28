package Scenario;

public class MissingNumber {
	static int x;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,5,7,9,10,11,12,14,17,25};
		//1st for loop to get diff greater then 1
		for(int i=0; i<(a.length-1);i++) {
			if((a[i+1]-a[i])>1) {
				x=+(a[i]+1);
				System.out.println("Missing Number is "+x);
				//2nd for loop to check the next digit is missing or not
				for(int j=2;j<=(a[i+1]-a[i]);j++)
				if((a[i+1]-x)>1) {
					x=x+1;
					System.out.println("Missing Number is "+(x));
				}
			}
		}
	}
}


