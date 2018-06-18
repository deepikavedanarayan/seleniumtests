import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\john\\Downloads\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();  
			
		driver.get("https://login.salesforce.com/");
		
		//Syntax for CSS tagname[attribute = '']
		
		driver.findElement(By.cssSelector("[name = 'username']")).sendKeys("sdsd");
		driver.findElement(By.cssSelector("[name= 'pw']")).sendKeys("efdfd");
	}

}
