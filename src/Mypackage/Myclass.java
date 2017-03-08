package Mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Myclass {
	WebDriver driver;
	@BeforeMethod
	public void openurl()
	{
		//Chrome driver
		
		System.setProperty("webdriver.chrome.driver","E:\\Softwares\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void Login()
	{	
		driver.get("https://www.linkedin.com/");
		System.out.println("Runing in Jenkins...............");
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}
	

}
