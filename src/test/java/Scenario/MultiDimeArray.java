package Scenario;

public class MultiDimeArray {

	public static void main(String[] args) {
		int[][] a= {{2,3,4},{4,6,7,8}};
		int b=a[0][1];
		System.out.println("Array at 1st set and 2nd (Array position 1st)row " +b);
		int c=a[1][1];
		System.out.println("Array at 2nd set and 2nd (Array position 1st)row " +c);

		//1st for loop will decide which Array set to consider
		for(int i=0; i<a.length;i++) {
			//below for loop will decide in above Array set calling value
			for(int j=0; j<a[i].length;j++) {
				System.out.println(a[i][j]);
			}
		}
	}
}