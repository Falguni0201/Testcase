import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class findbrokenlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:/Users/DELL/java-2023-06/eclipse/chromedriver_win32\\chromeDriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://google.com/ncr");
List<WebElement> links = driver.findElements(By.tagName("a"));

String url = "";
HttpURLConnection connection = null;
int respCode = 0;
for(WebElement link: links) {
	 try {
         url = link.getAttribute("href");
         connection = (HttpURLConnection)(new URL(url).openConnection());
         connection.setRequestMethod("HEAD");
         connection.connect();
         
         respCode = connection.getResponseCode();
         if(respCode == 400 ||
                 respCode == 403 ||
                 respCode == 404 ||
                 respCode == 408 ||
                 respCode == 410 ||
                 respCode == 503){
        	
        	 System.out.println("[Broken]     - " + url);
         }
         else{
             System.out.println("[Not Broken] - " + url);
         }
     } catch (MalformedURLException e) {
         e.printStackTrace();
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
 connection.disconnect();

 driver.quit();
}

}    	 
         
	


	


