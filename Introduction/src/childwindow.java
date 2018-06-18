import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\john\\Downloads\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver(); 
			
			
			driver.manage().window().maximize();
			driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en-GB&flowName=GlifWebSignIn&flowEntry=SignUp");
			
			driver.findElement(By.xpath("//*[@id=\'initialView\']/footer/ul/li[1]")).click();
					
			System.out.println(driver.getTitle());
			
	
		Set<String> id = 	driver.getWindowHandles();
			Iterator<String> IT = id.iterator();
			String Parentid = IT.next();
			
			String Childid = IT.next();
			driver.switchTo().window(Childid);
			
		System.out.println(driver.getTitle());
	}
;
}
