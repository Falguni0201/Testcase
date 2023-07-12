import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class getalllink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:/Users/DELL/java-2023-06/eclipse/chromedriver_win32\\chromeDriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://google.com/ncr");

List<WebElement> links = driver.findElements(By.tagName("a"));

for(WebElement link: links) {
    System.out.println(link.getAttribute("href"));
}
driver.quit();
}
	}


