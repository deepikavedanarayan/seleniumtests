import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\john\\Downloads\\geckodriver.exe");
		
			WebDriver driver=new FirefoxDriver();  
			
			driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
			
			driver.findElement(By.cssSelector("[value = 'Confirmation Alert']")).click();
			//switching the driver to alter class if the pop up is not  html 
			
			System.out.println(driver.switchTo().alert().getText());//to get text and print 
			driver.switchTo().alert().accept();//positive scenario
			
			//driver.switchTo().alert().dismiss();//negative scenario
	}

	

}
