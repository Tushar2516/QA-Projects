package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Invoking the browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropDown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		// Passengers Dropdown
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		
//		driver.findElement(By.xpath("//*[@id='hrefIncAdt']")).click();
//		driver.findElement(By.id("hrefIncAdt")).click();
//		driver.findElement(By.id("hrefIncAdt")).click();
		int click = 1;
		while(click < 5) {
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			click++;
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		
		// Select Dynamic Dropdown Destination - Arrival
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		// second way.. without index using parent child relationship
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		 
		
		
		
	} 
}
