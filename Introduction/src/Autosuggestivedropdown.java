import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autosuggestivedropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\john\\Downloads\\geckodriver.exe");
		
			WebDriver driver=new FirefoxDriver();  
			
			driver.get("http://www.ksrtc.in/oprs-web/");
			
		driver.findElement(By.xpath("//input[@id = 'fromPlaceName']")).sendKeys("shi");
			
		driver.findElement(By.xpath("//input[@id = 'fromPlaceName']")).sendKeys(Keys.DOWN);

	
		
		
		
		//HTML javscript DOM helps us to extract all the hidden elements and selenium cannot identify the hidden elements
		
		//investigate the properties of object if  it
		
		JavascriptExecutor js  = (JavascriptExecutor) driver;
		
		String script = " return document.getElementById(\"fromPlaceName\").value;";
		
		String Text = (String) js.executeScript(script);
		
		//System.out.println(Text);	
		
		while(!Text.equalsIgnoreCase("GIRIDARSHINI")) {
			
			//System.out.println("I found it ");
			
			
			driver.findElement(By.xpath("//input[@id = 'fromPlaceName']")).sendKeys(Keys.DOWN);
			
			script =  " return document.getElementById(\"fromPlaceName\").value;";
			
		  Text = (String) js.executeScript(script);
			
			System.out.println(Text);
		}
		
		
		
	}
	

}
