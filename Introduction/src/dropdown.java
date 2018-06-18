import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\john\\Downloads\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver", 
//				"C:\\Users\\john\\Downloads\\geckodriver.exe");
//		
//			WebDriver driver=new FirefoxDriver(); 
			driver.get("http://www.spicejet.com");
			
	Select s = new Select (driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
			
		
	//Select s = new Select ();
			
			//s.selectByValue("USD");
			
			//s.selectByIndex(2);
			
			//driver.findElement(By.cssSelector("([id = 'ctl00_mainContent_ddl_originStation1_CTXT'])[1]")).click();
			
			driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
	        // driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_originStation1_CTXT\']")).click();

			
			driver.findElement(By.xpath("//a[@value = 'BLR']")).click();
			//driver.findElement(By.cssSelector("[value = 'GOI']")).click();
	//checkboxes
	driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).click();
	
	System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).isSelected());
	
	//handling radio button
	
	//driver.findElement(By.xpath("//input[@value = 'Cheese']")).click();
	}

}
