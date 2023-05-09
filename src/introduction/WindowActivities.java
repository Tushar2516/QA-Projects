package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WindowActivities {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Invoking the browser
		//System.setProperty("webDriver.chrome.driver", "C:\\Users\\Kotwal\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Open Browser
//		driver.manage().window().maximize();
		driver.get("https://google.com"); // Wait for load full component
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("Enbled");
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
		
		// Select Dynamic Drop down Destination - Arrival
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
						
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
//		 driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		// second way.. without index using parent child relationship
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
				
		// Calendar 
		Thread.sleep(1000);
//		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
						
		
	}

}
