package Scenario;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		{
			int count;
			String temp;
			Scanner scan = new Scanner(System.in);

			//User will be asked to enter the count of strings 
			System.out.print("Enter number of strings you would like to enter:");
			count = scan.nextInt();


			String str[] = new String[count];
			Scanner scan2 = new Scanner(System.in);

			//User is entering the strings and they are stored in an array
			System.out.println("Enter the Strings one by one:");
			for(int i = 0; i < count; i++)
			{
				str[i] = scan2.nextLine();
			}
			scan.close();
			scan2.close();
			for (int k=0;k<count;k++) {
				System.out.println("Entered Array is: " +str[k]);

			}

		}
	}
}
