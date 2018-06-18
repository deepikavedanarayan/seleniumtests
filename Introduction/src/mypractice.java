import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mypractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\john\\Downloads\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();  
		
		driver.get("http://linkedin.com");//opening google.com on chrome
		
		driver.findElement(By.xpath("//input[contains(@class,'login')]")).sendKeys("deepika.rosepetals@gmail.com");
		
		
        driver.findElement(By.cssSelector("input[type*='password']")).sendKeys("test1234");
//driver.findElement(By.id("login-submit")).click();
driver.findElement(By.xpath("//*[text()='Join now']")).click();
	}

	
}
