package anotherbrowser.anotherbrowsertesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class signupUsingXpath {
	 ChromeDriver driver;
	@Before
	public void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "../anotherbrowsertesting/chromedriver.exe");
		 driver=new ChromeDriver();
	     driver.get("https://en-gb.facebook.com/");
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	}
	@Test
	public void signup() throws InterruptedException {
		WebElement createNewAccount=driver.findElement(By.xpath("//a[text()='Create New Account']"));
	     createNewAccount.click();
	     Thread.sleep(3000);
	     WebElement Name=driver.findElement(By.xpath("//input[@name='firstname']"));
	     Name.sendKeys("Lovely");
	     WebElement Surname=driver.findElement(By.xpath("//*[@name='lastname']"));
	     Surname.sendKeys("Sharma");
	     WebElement Email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
	      Email.sendKeys("lovely.sharma@gmail.com");
	     WebElement password=driver.findElement(By.xpath("//input[@type='password' and @name='reg_passwd__' ]"));
	      password.sendKeys("123456");
	      
	      signupUsingXpath fc=new signupUsingXpath();
	      //dateodbirth selection
	      WebElement DateOfBirth=driver.findElement(By.xpath("//select[@*='Day']"));
	      fc.dropdown(DateOfBirth, 4);
	      Thread.sleep(3000);
	      WebElement Month=driver.findElement(By.xpath("//select[@aria-label='Month']"));
	      fc.dropdown(Month,6);
	      Thread.sleep(3000);
	      WebElement year=driver.findElement(By.xpath("//select[@aria-label='Year']"));
	      fc.dropdown(year,10);  
	      //Genderselection
	      WebElement Genderselection=driver.findElement(By.xpath("//label[text()='Female']"));
	      Genderselection.click();
	      
	      WebElement signup=driver.findElement(By.xpath("//button[text()='Sign Up']"));
	      signup.click();
	}
	
	public void dropdown(WebElement el,int value) {
		Select s=new Select(el);
		s.selectByIndex(value);
	}
	



}
