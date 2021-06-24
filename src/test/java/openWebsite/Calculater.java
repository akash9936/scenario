package openWebsite;

import java.util.Scanner;

public class Calculater {
	private static final Object[] oper1 = null;
	private static final int[] number = null;
	static String s, num4;
	static int num3;
	static int x=1;
	static int i,j ;

	public static void main(String[] args) {
		System.out.println("Welcome to Akash Calculatter");
		Scanner sc=new Scanner(System.in);

		System.out.println("enter total number you want in operation");
		s=sc.next();
		i=Integer.parseInt(s);
		Numbers1();
	}
	public static void Numbers1(){
		for (j=1;j<i; j++){
			Scanner sc=new Scanner(System.in);

			System.out.println("Please enter your Number:"+j);
			String num4=sc.next();
			int num1 =Integer.parseInt(num4);
			int[] number = {num1};
			number[j]=num1;
			System.out.println("Please enter your Operator (+,-,/,*)"+j);
			String oper=sc.next();
			String[] oper1 = {oper};
			oper1[j] = oper;
		}

		switch (j) {

		case 1:
			if(oper1[0].equals("+")){
				num3=number[0]+number[1];
				System.out.println("Addition of your value is:" +num3);
			}
			else if (oper1[0].equals("-")) {
				num3=(number[i])-(number[i+1]);
				System.out.println("Sub of your value is:" +num3);
			}
			else if (oper1[0].equals("*")) {
				num3=(number[i])*(number[i+1]);
				System.out.println("Multi of your value is:" +num3);
			}
			else if (oper1[0].equals("/")) {
				num3=(number[i])/(number[i+1]);
				System.out.println("Dev of your value is:" +num3);
			}
			else {
				System.out.println("incorrect value");
			}
			x=2;
			break;
		case 2:

		default:
			break;
		}
		if(oper1[i].equals("+")){
			num3=number[i]+number[i+1];
			System.out.println("Addition of your value is:" +num3);
		}
		else if (oper1.equals("-")) {
			num3=(number[i])-(number[i+1]);
			System.out.println("Sub of your value is:" +num3);
		}
		else if (oper1.equals("*")) {
			num3=(number[i])*(number[i+1]);
			System.out.println("Multi of your value is:" +num3);
		}
		else if (oper1.equals("/")) {
			float num3=(number[i])/(number[i+1]);
			System.out.println("Dev of your value is:" +num3);
		}
		else {
			System.out.println("incorrect value");
		}


	}


public static void firstcalculation() {
	int num1 =Integer.parseInt(num4);
	if(oper1.equals("+")){
		num3=number[i]+number[i+1];
		System.out.println("Addition of your value is:" +num3);
	}
	else if (oper1.equals("-")) {
		num3=(number[i])-(number[i+1]);
		System.out.println("Sub of your value is:" +num3);
	}
	else if (oper1.equals("*")) {
		num3=(number[i])*(number[i+1]);
		System.out.println("Multi of your value is:" +num3);
	}
	else if (oper1.equals("/")) {
		float num3=(number[i])/(number[i+1]);
		System.out.println("Dev of your value is:" +num3);
	}
	else {
		System.out.println("incorrect value");
	}


}
}
