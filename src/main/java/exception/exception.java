package exception;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class exception {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akash.singh\\Downloads\\testchrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://google.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("new")).click();
try {
	driver.findElement(By.name("c")).click();
	}
catch (NoSuchElementException i) {
	System.out.println("element not found");

}
}
}