import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\john\\Downloads\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
			//Implicit Waits
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			driver.get("https://www.path2usa.com/travel-companions");
			
			driver.findElement(By.xpath("//input[@id = 'travel_date']")).click();
			
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[1]/th[2]")).click();
			
	List<WebElement> months = driver.findElements(By.className("month"));
			
			int count = driver.findElements(By.className("month")).size();
			
			for (int i = 0; i <count; i++)
			{
				String date = driver.findElements(By.className("month")).get(i).getText();
				
				if (date.equalsIgnoreCase("Jan")) {
					
					driver.findElements(By.className("month")).get(i).click();
					//break;
				}
			}
			
			//grab the common attribute put it into list and iterate
			/*List<WebElement> dates = driver.findElements(By.className("day"));
			
			int count = driver.findElements(By.className("day")).size();
			
			for (int i = 0; i <count; i++)
			{
				String date = driver.findElements(By.className("day")).get(i).getText();
				
				if (date.equalsIgnoreCase("15")) {
					
					driver.findElements(By.className("day")).get(i).click();
					//break;
				}
			}*/
}
} 