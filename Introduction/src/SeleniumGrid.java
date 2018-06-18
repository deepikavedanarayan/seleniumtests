import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumGrid {

	public static void main(String[] args) {
		
		int sum=0;
		
		int totalsum;
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\john\\Downloads\\geckodriver.exe");
		
			WebDriver driver=new FirefoxDriver();
			
			driver.get("http://www.cricbuzz.com/live-cricket-scorecard/19956/ind-vs-afg-only-test-afghanistan-tour-of-india-2018");
	
			
		
		WebElement table= driver.findElement(By.cssSelector("div[class = 'cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope']"));
		
		int count = table.findElements(By.cssSelector("div[class = 'cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		
		for (int i = 0 ;i<count-2;i++) {
			
			// to print all the runs in a column
			//System.out.println(table.findElements(By.cssSelector("div[class = 'cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
			// to Add all the runs
	String value = table.findElements(By.cssSelector("div[class = 'cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		int add = Integer.parseInt(value);
		sum = sum + add;
		}
		System.out.println(sum);
String extravalue =	table.findElement(By.xpath("//div[text()= 'Extras']/following-sibling::div")).getText();

int withextra = Integer.parseInt(extravalue);

 totalsum = sum+withextra;
 
 System.out.println(totalsum);

	
	System.out.println(table.findElement(By.xpath("//div[text()= 'Total']/following-sibling::div")).getText());
		}
	
	
	

}
