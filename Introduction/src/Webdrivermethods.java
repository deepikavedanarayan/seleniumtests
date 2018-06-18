import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdrivermethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\john\\Downloads\\geckodriver.exe");
		
			WebDriver driver=new FirefoxDriver();
			
			
			
			driver.get("https://us.makemytrip.com/");

			
			//how to automate visible and hidden mode
			
			//System.out.println("Before clicking on multi city radio button");
			
			//System.out.println(driver.findElement(By.xpath("/body/div[1]/div[4]/div[1]/div[2]/div[2]/div[2]/div[1]/div[7]/span/span[4]/a")).isDisplayed());
			
			//driver.findElement(By.xpath("//*[@id=\'multicity\']/label")).click();
			
			
	
			
	}
	


}
