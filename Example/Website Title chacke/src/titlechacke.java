import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class titlechacke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:/Users/DELL/java-2023-06/eclipse/chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.tutorialkart.com/");
String title = driver.getTitle();
System.out.println(title);
driver.quit();
	}

}
