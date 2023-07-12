import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class sendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\java-2023-06\\eclipse\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/ncr");
	
		
		WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("tutorialkart");
        searchBox.sendKeys(Keys.RETURN);
         
        driver.quit();
		
		
	}

}
