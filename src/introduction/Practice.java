package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Invoking browser
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com"); // Wait for load full component
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Check the check box is selected and unselected
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id = 'checkBoxOption1']")).isSelected());
		System.out.println("Test Passed : Already Unchecked");
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id = 'checkBoxOption1']")).isSelected());
		System.out.println("Test Passed : Click On It And Checked");
		Thread.sleep(2000);
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id = 'checkBoxOption1']")).isSelected());
		System.out.println("Test Passed : Click On It And Unchecked");
		
		// Get Number Of Check boxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
	}

}
