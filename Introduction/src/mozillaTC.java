import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mozillaTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\john\\Downloads\\geckodriver.exe");
		
			WebDriver driver=new FirefoxDriver();  
			
			driver.get("http://Google.com");
			
			System.out.println(driver.getTitle());
	}

}
