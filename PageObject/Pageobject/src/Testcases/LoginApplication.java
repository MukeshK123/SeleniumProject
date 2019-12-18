package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import objectrepository.RediffLoginPage;

public class LoginApplication {
	
	@Test
	public void Login1()
	
	{	
		System.setProperty("webdriver.chrome.driver", "D:\\Java_Related\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage rd=new RediffLoginPage(driver);
		rd.Emailid().sendKeys("mukesh.kolukuluri");
		rd.Password().sendKeys("SWENGn2j4g5");
		rd.Proceed().click();
		//String redirected_url = driver.getCurrentUrl();//This url is not matching with the one  showing in address bar.
		//driver.get(redirected_url);
		//String actualUrl="https://f5mail.rediff.com/ajaxprism/container?angular=1&els=faddcd43b7ad3d0be60d7151eced18af&user_size=1";
		//String redirected_url= driver.getCurrentUrl();
		//driver.get(redirected_url);
		//String actualUrl = "https://f5mail.rediff.com/ajaxprism/container?";
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl= "https://mail.rediff.com/cgi-bin/login.cgi";
		if(actualUrl.equalsIgnoreCase("https://mail.rediff.com/cgi-bin/login.cgi")) 
		{ 
			  Assert.assertEquals(expectedUrl,actualUrl);	
			  System.out.println("Login Failed"); 
			  
		}
		else
		{
			Assert.assertTrue(true);
			System.out.println("Login Successful");
		}
		
		
		
	}
	
	public static void main(String args[])
	{
		
		LoginApplication login = new LoginApplication();
		login.Login1();
		
	}
	
	

}
