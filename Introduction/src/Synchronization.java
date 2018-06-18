import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\john\\Downloads\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver(); 
			//globally definening implicit wait
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");

			
			driver.findElement(By.xpath("//*[@id='H-destination']")).sendKeys(" NYC");
			

			driver.findElement(By.xpath("//*[@id=\'H-destination\']")).sendKeys(Keys.TAB);
			
			
			driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);
			
			//driver.findElement(By.xpath("//a[conatins(@href,'New-York-Hotels-WestHouse')]")).click();
			// Explicit Wait with conditional synchronization
			WebDriverWait d = new WebDriverWait(driver,20);
			//d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='6467973']/div[2]/div/a")));
			
			d.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='6467973']/div[2]/div/a")));
					
			driver.findElement(By.xpath("//*[@id='6467973']/div[2]/div/a")).click();
	}
	
	
	//*[@id="6467973"]/div[2]/div/a

}
