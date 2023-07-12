import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class dorjeLink {

	private static final WebElement[] Links = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/DELL/java-2023-06/eclipse/chromedriver_win32\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://office.dorje.io/sign-in");
		
		List<WebElement> links = driver.findElements(By.className("ng-star-inserted"));

		for(WebElement link: links) {
		    System.out.println(link.getAttribute("href"));
		}
		driver.quit();

	}

}
