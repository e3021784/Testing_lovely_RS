package anotherbrowser.anotherbrowsertesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "../anotherbrowsertesting/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        
          List<WebElement> allVideo=driver.findElements(By.id("video-title"));
          for(WebElement element:allVideo ) {
	          element.click();
	          Thread.sleep(3000);
	          driver.navigate().back();
}

	}

}
