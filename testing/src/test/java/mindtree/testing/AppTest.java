package mindtree.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//open url
		driver.get("https://www.urbanladder.com/");
		
		//Signup
		driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
		driver.findElement(By.xpath("//a[@class='signup-link authentication_popup']")).click();
		driver.findElement(By.xpath("//input[@class='textfield email required input_authentication email-suggest']")).sendKeys("rahulbsc143@gmail.com");
		driver.findElement(By.xpath("//input[@class='textfield required input_authentication']")).sendKeys("R@hul123virat");
        driver.findElement(By.xpath("//input[@value='Sign Up']")).click();
	}

}
