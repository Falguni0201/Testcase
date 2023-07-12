import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class dorjeSearch {

	
	private static WebElement searchBox;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:/Users/DELL/java-2023-06/eclipse/chromedriver_win32\\chromeDriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://office.dorje.io/sign-in");

driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
WebElement searchBox = driver.findElement(By.className("flex"));
Boolean isSearchBoxDisplayed = searchBox.isDisplayed();
 
if (isSearchBoxDisplayed) {
    System.out.println("The Dashboard  is  displayed.");
} else {
    System.out.println("The  Dashboard is not displayed.");
}
 
driver.quit();

	}

	
	}


