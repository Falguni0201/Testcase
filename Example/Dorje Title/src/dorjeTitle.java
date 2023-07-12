import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class dorjeTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/DELL/java-2023-06/eclipse/chromedriver_win32\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://office.dorje.io/dashboard");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}

}
