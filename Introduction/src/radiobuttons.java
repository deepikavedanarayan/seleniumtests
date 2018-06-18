import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\john\\Downloads\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
			driver.get("http://echoecho.com/htmlforms10.htm");
			
			//driver.findElement(By.xpath("//input[@value = 'Butter']")).click();
			
			//System.out.println(driver.findElements(By.xpath("//input[@name= 'group1']")).size());
			
			//Select s = new Select(driver.findElement(By.cssSelector("input[name='group1']")));checkon this
			
			//s.selectByIndex(2);
			
			
			// clicks all the radio button one by one 
			/* int count =driver.findElements(By.xpath("//input[@name= 'group1']")).size();
			 
			 
			 for (int i=0; i<count;i++)
			 {
				 
				 driver.findElements(By.xpath("//input[@name = 'group1']")).get(i).click();
			 }*/

			//NOW JUST CLICK ON CHEESE
			
			int count =driver.findElements(By.xpath("//input[@name= 'group1']")).size();
			
			
			 
			 for (int i=0; i<count;i++)
			 {
				 
		String test =	 driver.findElements(By.xpath("//input[@name = 'group1']")).get(i).getAttribute("value");
			
			if (test.equals("Cheese"))
			{
					 driver.findElements(By.xpath("//input[@name = 'group1']")).get(i).click();

			}		 
				 
			 
}
			


	}
}
