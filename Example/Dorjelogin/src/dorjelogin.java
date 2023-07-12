import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import dev.failsafe.internal.util.Assert;

public class dorjelogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver","C:/Users/DELL/java-2023-06/eclipse/chromedriver_win32\\chromeDriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    
	driver.get("https://office.dorje.io/sign-in");
	driver.findElement(By.tagName("button")).click();
	
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	

WebElement email = driver.findElement(By.name("email"));
email.clear();
email.sendKeys("admin@arishti.com");

WebElement password = driver.findElement(By.id("password"));
password.clear();
password.sendKeys("x(~$t(@F0Q3X");

driver.findElement(By.tagName("button")).click();


	}
}




	
	


