import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;	

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code
// create driver object
//Class name =ChromeDriver
//Invoke browser .exe files found in selenium
		
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\john\\Downloads\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();  
		
	//driver.get("http://facebook.com");//opening google.com on chrome
		
		/*driver.findElement(By.id("email")).sendKeys("deepika.rosepetals@gmail.com");
		
        driver.findElement(By.id("pass")).sendKeys("password");
        
        driver.findElement(By.name("pass")).sendKeys("password");
        driver.findElement(By.linkText("Forgot account?")).click();*/
	
//	driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("fdjkhlh");
	//driver.findElement(By.cssSelector("#pass")).sendKeys("jbhkj");
	//driver.findElement(By.xpath("//*[@id=\'u_0_3\']")).click();
//	driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();
		//Salesforce
		driver.get("https://login.salesforce.com/");
driver.findElement(By.id("username")).sendKeys("deepika");

//driver.findElement(By.id("password")).sendKeys("12345");

driver.findElement(By.xpath("//input[@id='password']")).sendKeys("sjhjs");  //creating own xpath with //input[@attributename ='value']

//driver.findElement(By.name("Login")).click();

 driver.findElement(By.xpath("//*[@id='Login']")).click();//Indentifying locator by Xpath

System.out.println( driver.findElement(By.xpath("//*[@id='error']")).getText());//printing the error text by using getText method
 

 
		
		//System.out.println(driver.getTitle());//Validate if the title is correct
		
		//System.out.println(driver.getCurrentUrl());//validate if landed on correct URL
		
		//System.out.println(driver.getPageSource());//to get pagesource
	//driver.get("Http://yahoo.com");	
		
	//driver.navigate().back();
	
	//driver.navigate().forward();
	
	//driver.close();//closes current browser
	//driver.quit();//closes all the browsers
	
	}

}
