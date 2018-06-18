import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\john\\Downloads\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
			//Implicit Waits
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			driver.get("http://www.qaclickacademy.com/practice.php");
//to get the count of links on the page
			
			
		int count = driver.findElements(By.tagName("a")).size();
		
		System.out.println(count);
		
		//to get the count of links in the footer section
		
		WebElement footersection = driver.findElement(By.id("gf-BIG"));
		
		int count1 = footersection.findElements(By.tagName("a")).size();
		
		System.out.println(count1);
		
		//to get the count of links in column
		
		WebElement column = footersection.findElement(By.xpath("//table[@class = 'gf-t']/tbody/tr/td[1]"));
		
		int count2 = column.findElements(By.tagName("a")).size();
		
		System.out.println(count2);
		
		for(int i =1; i<count2;i++) {
			
// Actions a = new Actions((WebDriver) column);
 
String tab = Keys.chord(Keys.CONTROL,Keys.ENTER);
 
column.findElements(By.tagName("a")).get(i).sendKeys(tab);
 

}
		 Set <String> id =  driver.getWindowHandles(); 
		Iterator<String>  IT = id.iterator();
	
		  
		  while(IT.hasNext()){
			  
			  
			  driver.switchTo().window(IT.next());
			  
			  System.out.println(driver.getTitle());
		  }
		
}
}