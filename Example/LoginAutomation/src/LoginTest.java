import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {

private static final FluentWait<WebDriver> wait = null;

//	private static WebElement NextButton;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdrver.chrome.driver","C:/Users/DELL/java-2023-06/eclipse/chromedriver_win32\\chromeDriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://www.gmail.com");
//Send email address
driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("solankifalguni18@gmail.com");
    driver.findElement(By.xpath("//div[@id='identifierNext']")).click();

//send password
WebElement passwordButton = driver.findElement(By.xpath("//input[@name='password']"));

wait.until(ExpectedConditions.elementToBeClickable(passwordButton));
passwordButton.sendKeys("020112@falguni");
driver.findElement(By.xpath("//div[@id='passwordNext']")).click();

}
}