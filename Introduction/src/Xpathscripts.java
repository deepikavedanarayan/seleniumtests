import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathscripts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\john\\Downloads\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();  
			
		driver.get("http://facebook.com");//opening google.com on chrome
		
		
		//with Xpath the syntax is //tagname[@attribute='value']
		//with regular expression the syntax is //tagname[contains(@attribute,'value')]
		
		/*driver.findElement(By.xpath("//input[@name= 'email']")).sendKeys("hjjg");
		driver.findElement(By.xpath("//input[@id= 'pass']")).sendKeys("Ddd");
        driver.findElement(By.xpath("//input[@value= 'Log In']")).click();*/
		
		//With CSS syntax tagname[attribute='Value']
		//with regular expression the syntax is tagname[attribute*= 'value']
		driver.findElement(By.cssSelector("input[name= 'email']")).sendKeys("hjjg");//syntax 1
		
		//driver.findElement(By.cssSelector("input[id= 'pass']")).sendKeys("Ddd");
		
		driver.findElement(By.cssSelector("input#pass")).sendKeys("sd");
        driver.findElement(By.cssSelector("input[value= 'Log In']")).click();
       
	}
}

