package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Practice2 {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Invoking browser
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.navigate().to("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(1000);
		driver.findElement(By.name("name")).sendKeys("Test");
		driver.findElement(By.name("email")).sendKeys("testing@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'exampleInputPassword1']")).sendKeys("Testing@12");	
		driver.findElement(By.xpath("//input[@type = 'checkbox']")).click();
		driver.findElement(By.id("inlineRadio1")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("bday")).sendKeys("1999/09/09");
		
		driver.findElement(By.xpath("//input[@type = 'submit']")).is;
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
	
		// Handling Java Alert using Selenium Web Driver
		
		String text = "tushar";
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.cssSelector("[id='alertbtn']")).click(); 
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(1000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
	}

}
