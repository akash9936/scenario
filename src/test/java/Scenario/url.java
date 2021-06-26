package Scenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class url {
	public static WebDriver driver;
	public static void url1() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		if (website.Website.equals("youtube"))
		{
			driver.get("https://www.youtube.com/");
		}
		else if (website.Website.equals("facebook")) {
			driver.get("https://www.facebook.com/");
		}
		else if (website.Website.equals("google")) {
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