import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dorjeTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/DELL/java-2023-06/eclipse/chromedriver_win32\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://office.dorje.io/sign-in");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(550));
		WebElement searchBox = driver.findElement(By.className("flex"));
		String tagName = searchBox.getTagName();

		System.out.println("Tag Name: " + tagName);
		driver.quit();

	}

}
