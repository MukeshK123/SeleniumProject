package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import objectrepository.RediffHomePage;


public class HomePageTest {
	
	@Test
	public void Home()
	
	{	
		System.setProperty("webdriver.chrome.driver", "D:\\Java_Related\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffHomePage rh=new RediffHomePage(driver);
		rh.HomeLink().click();
		rh.Search().sendKeys("shoes");
		rh.SearchIcon().click();
		
		
		
	
	}
	
}
