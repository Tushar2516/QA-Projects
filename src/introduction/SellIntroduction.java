package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SellIntroduction {

	public static void main(String[] args) {

		// Invoking Browser
		// ChromeDriver driver = new ChromeDriver();
		
		// chromedriver.exe -> Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kotwal\\chromedriver.exe");
		// Webdriver.chrome.driver -> Value of Path
		
		// Firefox launch
		WebDriver fireDriver = new FirefoxDriver();
		fireDriver.get("https://rahulshettyacademy.com/");
		System.out.println(fireDriver.getTitle());
		System.out.println(fireDriver.getCurrentUrl());
		fireDriver.close();
		
 		// Chrome launch
		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com/");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		driver.close();
//		driver.quit();
	} 

}
