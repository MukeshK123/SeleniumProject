package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectFactory {
	
	WebDriver driver;
	
	public PageObjectFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);// passing testcase class arguement to "this"
		//PageFactory.initElements(driver, this);
		
		
	}
	/*
	By home=By.xpath("//a[contains(text(),'Home')]"); // By locator is storing the xpath in username.
	By search=By.xpath("//input[@id='srchword']");
	By searchicon=By.xpath("//form[@id='queryTop']//input[@class='newsrchbtn']");*/
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement home;
	
	@FindBy(xpath="//input[@id='srchword']")
	WebElement search;
	
	@FindBy(xpath="//form[@id='queryTop']//input[@class='newsrchbtn']")
	WebElement searchicon;
	
	public WebElement HomeLink()
	
	{
		return home;
	}
	public WebElement Search()
	
	{
		return search;
	}
	public WebElement SearchIcon()
	
	{
		return searchicon;
	}

}
