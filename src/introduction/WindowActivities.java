package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Invoking the browser
		//System.setProperty("webDriver.chrome.driver", "C:\\Users\\Kotwal\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Open Browser
//		driver.manage().window().maximize();
		driver.get("https://google.com"); // Wait for load full component
		driver.navigate().to("https://rahulshettyacademy.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		
	}

}
