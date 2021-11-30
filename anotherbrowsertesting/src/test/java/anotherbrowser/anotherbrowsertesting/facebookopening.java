package anotherbrowser.anotherbrowsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookopening {
	
	public void dropdown(WebElement el,int value) {
		Select s=new Select(el);
		s.selectByIndex(value);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "../anotherbrowsertesting/chromedriver.exe");
     ChromeDriver driver=new ChromeDriver();
     driver.get("https://en-gb.facebook.com/");
     driver.manage().window().maximize();
     Thread.sleep(3000);
     WebElement createNewAccount=driver.findElement(By.cssSelector("a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
     createNewAccount.click();
     Thread.sleep(3000);
     WebElement Name=driver.findElement(By.name("firstname"));
     Name.sendKeys("Lovely");
     WebElement Surname=driver.findElement(By.name("lastname"));
     Surname.sendKeys("Sharma");
     WebElement Email=driver.findElement(By.name("reg_email__"));
      Email.sendKeys("lovely.sharma@gmail.com");
     WebElement password=driver.findElement(By.cssSelector("input[id='password_step_input']"));
      password.sendKeys("123456");
      
      facebookopening fc=new facebookopening();
      //dateodbirth selection
      WebElement DateOfBirth=driver.findElement(By.id("day"));
      fc.dropdown(DateOfBirth, 4);
      Thread.sleep(3000);
      WebElement Month=driver.findElement(By.name("birthday_month"));
      fc.dropdown(Month,6);
      Thread.sleep(3000);
      WebElement year=driver.findElement(By.name("birthday_year"));
      fc.dropdown(year,10);  
      //Genderselection
      WebElement Genderselection=driver.findElement(By.cssSelector("label[class='_58mt']"));
      Genderselection.click();
      
      WebElement signup=driver.findElement(By.name("websubmit"));
      signup.click();
	}

}
