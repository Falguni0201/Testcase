import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrenturl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\java-2023-06\\eclipse\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/ncr");
		
		
		WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("tutorialkart");
        searchBox.sendKeys(Keys.RETURN);
         
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
         
        driver.quit();
	}

}
