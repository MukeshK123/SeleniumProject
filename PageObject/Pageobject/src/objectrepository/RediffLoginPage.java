package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	WebDriver driver;
	
	public RediffLoginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	
	By username=By.xpath("//input[@id='login1']"); // By locator is storing the xpath in username.
	By password=By.xpath("//input[@id='password']");
	By Go=By.xpath("//input[@name='proceed']");
	
	public WebElement Emailid()
	
	{
		return driver.findElement(username);
	}
	public WebElement Password()
	
	{
		return driver.findElement(password);
	}
	public WebElement Proceed()
	
	{
		return driver.findElement(Go);
	}
	

}
