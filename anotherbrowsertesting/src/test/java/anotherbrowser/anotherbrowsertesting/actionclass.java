package anotherbrowser.anotherbrowsertesting;

import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class actionclass {

	WebDriver driver;
	 @Before
	public void TC_01() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","../anotherbrowsertesting/chromedriver.exe");
		 driver=new ChromeDriver();
	     driver.get("https://www.makemytrip.com/");
	     driver.manage().window().maximize();
	     Thread.sleep(4000);
	}
	 @Test
	public void TC_02() throws InterruptedException {
		 driver.findElement(By.xpath("//div[@data-cy='outsideModal']")).click();
		WebElement fromcity= driver.findElement(By.xpath("//input[@data-cy='fromCity']"));
		fromcity.click();
		Thread.sleep(2000);
		WebElement searchCity=driver.findElement(By.xpath("//input[@placeholder='From']"));
	    searchCity.sendKeys("i");
	    Thread.sleep(2000);
	    
	    Actions ac=new Actions(driver);
	   List<WebElement> listoffrom=driver.findElements(By.xpath("//li[contains(@id,'react-autowhatever-1-section-0')]"));
	   int fromlistsize=listoffrom.size();
	   System.out.println(listoffrom.size());
	   String city="Indore";
	   int i=0;
	   
	   while(i<fromlistsize) {
		   
		String value=driver.findElement(By.xpath("//input[@placeholder='From']")).getAttribute("value");
		
		if(city.equalsIgnoreCase(value)) {
			ac.sendKeys(Keys.ENTER).perform();
			break;
		}
			else
			{
				Thread.sleep(3000);
				ac.sendKeys(Keys.ARROW_DOWN).perform();
		     
	   }
	   i++;
	  
	    }
	   
	   
	   
	}
	
 
  }
