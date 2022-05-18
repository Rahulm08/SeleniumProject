package Mindtree.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//open url
		driver.get("https://www.urbanladder.com/");
		
		//login with valid details
		driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
		driver.findElement(By.xpath("//a[@class='login-link authentication_popup']")).click();
		driver.findElement(By.xpath("//input[@class='email required input_authentication']")).sendKeys("rahulbsc143@gmail.com");
		driver.findElement(By.xpath("//input[@class='required input_authentication']")).sendKeys("R@hul123virat");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        
        //navigate to stores
        driver.findElement(By.xpath("//a[@class='featuredLinksBar__link']")).click();
        driver.navigate().back();
        //navigate to track orders
        driver.findElement(By.xpath("//a[@class='header-icon-link']")).click();
	}

}
