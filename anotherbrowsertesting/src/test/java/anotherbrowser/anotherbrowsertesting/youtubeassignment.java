package anotherbrowser.anotherbrowsertesting;

import java.util.Iterator;
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

public class youtubeassignment {
	WebDriver driver;
	
	 @Before
	public void TC_01() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "../anotherbrowsertesting/chromedriver.exe");
		 driver=new ChromeDriver();
	     driver.get("https://www.youtube.com/");
	     driver.manage().window().maximize();
	     Thread.sleep(4000);
	 }
	     
	     @Test
	 	public void TC_02() throws InterruptedException 
	     {
	    	 int i=0;
	     
	    	 List<WebElement> allVideo=driver.findElements(By.id("video-title"));
	          for(WebElement element:allVideo ) {
		          element.click();
		          Thread.sleep(3000);
		          System.out.println(driver.getTitle());
		          driver.navigate().back();
		          i++;
		          if(i==4) 
		        	  break;	  
	     }
	 String currentwindow=driver.getWindowHandle();
	 System.out.println(driver.getWindowHandle());
	 Actions ac=new Actions(driver);
	 i=0;
	
	 List<WebElement> differnttab=driver.findElements(By.id("video-title"));
	 System.out.println(differnttab.size());
	 for(WebElement video:differnttab ) {
		 
		 ac.keyDown(Keys.CONTROL).click(video).keyUp(Keys.CONTROL).build().perform();
		 i++;
		 if(i==4) 
			 break;	
	 }
	Set<String> totalwindows=driver.getWindowHandles();
	System.out.println(totalwindows.size());
     // Iterator<String> it=totalwindows.iterator();
      Thread.sleep(4000);
    // String first= it.next();
    // String second= it.next();
    // String third= it.next();
    // String fourth= it.next();
    // String fifth= it.next();
     //String sixth= it.next();
     //Thread.sleep(4000);
    // driver.switchTo().window(fourth);
     
    for(String address:totalwindows ) {
    	  driver.switchTo().window(address);
    	System.out.println(driver.getCurrentUrl());
    }
  Thread.sleep(3000);
     driver.switchTo().window(currentwindow);
}
	     
}
