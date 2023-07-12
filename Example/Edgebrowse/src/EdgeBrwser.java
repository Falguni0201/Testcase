import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class EdgeBrwser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:/Users/DELL/java-2023-06/eclipse/edgedriver_win64\\msedgedriver.exe");
		      //instance of EdgeDriver
		      WebDriver driver = new EdgeDriver();
		      //URL launch
		      driver.get("https://www.microsoft.com/");
		   }
		
	}


