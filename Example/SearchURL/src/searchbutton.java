import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchbutton {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/DELL/java-2023-06/eclipse/chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/ncr");
	String Title = driver.getTitle();
	System.out.println("Title: + title");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	WebElement searchBox = driver.findElement(By.name("q"));
	WebElement searchBox1 = driver.findElement(By.name("btnK"));
	
	searchBox.sendKeys ("selenium");
	searchBox.click();
	searchBox.sendKeys(Keys.ENTER);

	
	searchBox = driver.findElement(By.name("q"));
	String value = searchBox.getAttribute("value");
	System.out.println("search value: " + value);
	
	driver.quit();
	
	}

}
