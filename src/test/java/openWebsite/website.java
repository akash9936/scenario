package openWebsite;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class website {
	public static	String Website;
	public static int j=1;
	public static int q=1;
	public static void main(String[] args) {

		for (int i =0;i<3;i++)
		{
			count1();
			url.url1();
		}
	}
	public static void count1() {
		Scanner input = new Scanner(System.in);
		if (j==1) {
			System.out.println("Enter Website you want to open: ");
			j++;
		}
		Website =input.nextLine();
		return;
	}
}

