package Mindtree.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.urbanladder.com/");
		driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
		driver.findElement(By.xpath("//a[@class='login-link authentication_popup']")).click();
		driver.findElement(By.xpath("//input[@class='email required input_authentication']")).sendKeys("rahulmacherla@gmail.com");
		driver.findElement(By.xpath("//input[@class='required input_authentication']")).sendKeys("R@hul123v");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}

}