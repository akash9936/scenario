package openWebsite;

import java.util.Scanner;

public class timeconv {
	static int hh,mm,ss, Tss, again;
	static String Name;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter your Name:");
		Name= sc.next();
		System.out.println("Hi " +Name+ " !Welcome to convert Hours, Minutes into Second world");
		time();
	}
	public static void time() {
		System.out.println("Please enter Hours:");
		hh = sc.nextInt();

		System.out.println("Please enter Minute:");
		mm = sc.nextInt();

		System.out.println("Please enter Second:");
		ss = sc.nextInt();
		Tss=hh*3600 + mm*60 + ss;
		System.out.println("Total Number of Second: " +Tss);
		repeat();
	}
	public static void repeat() {
		System.out.println("Do you want to check with another data (Press 1 for yes, Press 2 for no:");
		again =sc.nextInt();
		if (again==1) {
			time();
		}
		else {
			System.out.println("Thank You "+Name);
		}
	}
}


