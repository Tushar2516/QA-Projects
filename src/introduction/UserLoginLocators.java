package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserLoginLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kotwal\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("tushar");
		driver.findElement(By.name("inputPassword")).sendKeys("heyIamHere@12");
		driver.findElement(By.className("signInBtn")).click();
		 
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); 
		
		 // Forgot password
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Nexo");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Nexo@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("Nexo@morningstar.com");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(2)"));
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("7779991112");
		driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		// Back to login
		driver.findElement(By.className("go-to-login-btn")).click();
		
		// Login with valid credentials
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);
		driver.findElement(By.id("chkboxOne")).click();	
		driver.findElement(By.id("chkboxTwo")).click();	
		Thread.sleep(1000);
		driver.findElement(By.className("signInBtn")).click();
		 
	}

}
