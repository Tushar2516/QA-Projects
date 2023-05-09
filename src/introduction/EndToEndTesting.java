
package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEndTesting {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// Handling AutoSuggestive drop down (based on input showing drop down)
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}

		// Select one way
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

		// Select Dynamic Drop down Destination - Arrival
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']"))
				.click();

		// Calendar
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		// Check the second calendar is disable.
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("Enbled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		// Discount check
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		// Passengers Drop down
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		int click = 1;
		while (click < 5) {
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			click++;
		}
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println("Test Pass");
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();

		// Currency Drop Down

		WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropDown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("USD");

		// Search button
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
