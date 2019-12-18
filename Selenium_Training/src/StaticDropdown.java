import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StaticDropdown {
	
	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java_Related\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("Div1")).getAttribute("Style");
		if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("0.5"))
				{
					Assert.assertTrue(true);
				}
		else {
					Assert.assertTrue(false);
		}
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='CJB'])[2]")).click(); // dynamic dropdown with index([2])
		// Below line of code is to select current date from the calendar.
		//a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		////div[@id='divpaxinfo']
		driver.findElement(By.id("divpaxinfo")).click();
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))); // adult element
		s.selectByValue("2");  //you can select the value from dropdown
		//s.selectByIndex(6);// you can select the value from index.
		Select t = new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Child"))); // child element
		t.selectByValue("3"); //ctl00$mainContent$ddl_Child
		WebElement check=driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		Assert.assertFalse(false);
		System.out.println("Before" + check.isSelected()); //before
		check.click(); //click on checkbox
		System.out.println("After" + check.isSelected()); //after
		// driver.findElements(By.cssSelector("//input[type='checkbox']")).size(); //count of checkboxes
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
}
	
}
