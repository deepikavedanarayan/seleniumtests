import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OracleProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\john\\Downloads\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
			//Implicit Waits
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			driver.get("http://den01yqa.us.oracle.com/auxprojects/fa_jet_poc_gmaps/dist/FndOverview.html");	
			
			driver.manage().window().maximize();
			//WebDriverWait e = new WebDriverWait(driver,10);
			
			//e.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='groupNode_workforce_management']")));
			
			//driver.findElement(By.xpath("//div[@id='groupNode_workforce_management']")).click();
			
			//e.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='_UIShell_pagination_icon_infolets']/path[3]")));
		
			
			driver.findElement(By.xpath("//*[@id='_FAO_container']/div/a[2]")).click();
			
			System.out.println(driver.findElements(By.tagName("iframe")));
			
			driver.switchTo().frame(0);
			///html/body/div/fnd-simple-ui-shell/div[1]/div[3]/div/fnd-fuse-overview/div[1]/div[2]/div[1]/div[1]/div/div/div[7]/div/div/button[1]
			
			//*[@id="incidentsMap"]/div/div/div[7]/div/div/button[1]
			
			 WebElement out = driver.findElement(By.xpath("//*[@id='incidentsMap']/div/div/div[1]/div[3]/div[2]/div[3]/div[1]/img"));
			
			JavascriptExecutor js  = (JavascriptExecutor) driver;
			
			js.executeScript("arguments[0].click();", out); 
			
			//String map =  "return document.getElementById(\"incidentsMap\");";
			
			//String Text = (String) js.executeScript(map);
			
			//driver.findElement(By.xpath("//*[@id='incidentsMap']/div/div/iframe"));
			
			//driver.findElement(By.xpath("//*[@id='incidentsMap']/div/div/div[7]/div/div/button[1]")).click();
			
			//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='incidentsMap']/div/div/iframe")));
			
			 //Actions a = new Actions (driver);
			 
			 
			//WebElement scroll= driver.findElement(By.xpath("//*[@id='incidentsMap']/div/div/iframe"));
			
			// a.moveToElement(scroll).doubleClick().build().perform();
			 
			 //WebElement move = (driver.findElement(By.xpath("//*[@id='incidentsMap']/div/div/div[7]/div/div/button[1]")));
			 
			//a.moveToElement(move).doubleClick().build().perform();
			 
			 //WebElement move = (driver.findElement(By.cssSelector("")));
			 
			//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='incidentsMap']/div/div/iframe")));
			 
			//a.moveToElement(move).doubleClick().build().perform();
			 
			//*[@id="_FAcontainer"]
		
			 
			 
			
			//#_FAcontainer
			}

	
}
