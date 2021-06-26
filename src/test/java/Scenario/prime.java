package Scenario;

import java.util.Scanner;

public class prime {
	static int again;

	public static void main(String[] args) {
		input();
	}
	public static void input(){
		int Num, k = 0, i=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number you want to check: ");
		Num=sc.nextInt();
		int j =Num;
		for (i=1;i<=j;i++) {
			int Num1=Num%i;
			if (Num1==0) {
				k++;
			}
		}
		if (k>2) {
			System.out.println("Number is not prime");
		}
		else {
			System.out.println("Number is  prime");
		}
		System.out.println("Do you want to enter again?(enter 1 for yes and 2 for No)");
		again=sc.nextInt();
		repeat();
	}
	public static void repeat() {
		if (again==1) {
			input();
		}
		else
		{
			System.out.println("Thank you");
		}
	}
}
