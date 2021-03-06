package openWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\akash.singh\\\\Downloads\\\\testchrome\\\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.youtube.com/watch?v=u0LvoH_DwFU");
		
	}
	


}
