import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stem.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\john\\Downloads\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver(); 
			
			
			driver.manage().window().maximize();
			
			driver.get("https://jqueryui.com/droppable/");
			
			driver.switchTo().fr
			driver.findElement(By.xpath("//*[@id = 'draggable']")).click();

	}

}
