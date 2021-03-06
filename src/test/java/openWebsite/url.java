package openWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class url {
	public static WebDriver driver;
	public static void url1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akash.singh\\Downloads\\testchrome\\chromedriver.exe");
		if (website.Website.equals("youtube"))
		{
			driver = new ChromeDriver();
			driver.get("https://www.youtube.com/");
		}
		else if (website.Website.equals("facebook")) {
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
		}
		else if (website.Website.equals("google")) {
			driver = new ChromeDriver();
			driver.get("http://google.com/");
		}
		else {
			WrongUrlError();		
		}
	}

	public static void WrongUrlError() {
		switch (website.q) {
		case 1:
			System.out.println("Enter youtube, facebook or google");
			website.q++;
			break;
		case 2:
			System.out.println("this is your last chance, Please Enter youtube, facebook or google");
			website.q++;
			break;
		case 3:
			System.out.println("Better luck next time");
			website.q++;
			break;
		}

		return;
	}
}	