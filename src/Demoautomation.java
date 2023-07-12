import org.openqa.selenium.chrome.ChromeDriver;

public class Demoautomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webDriver.chrome.driver","C:/Users/DELL/java-2023-06/eclipse/chromedriver_win32\\chromeDriver");
   ChromeDriver driver = new ChromeDriver();
   driver.get("http://www.google.com");
	}
	
 
}
