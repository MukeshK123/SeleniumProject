import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java_Related\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); // implicit wait declared globally.
		String[] itemsListed = {"Cucumber","Brocolli"};
		
		driver.get("http://bigbasket.com");
		
		addItems(driver,itemsListed);
		driver.findElement(By.cssSelector("img[alt='Cart']"));
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]"));
		
	}
		
		public static  void addItems(WebDriver driver,String[] itemsListed) 
		
		{
			int j=0;
	
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++)
			
		{
			String[] name=products.get(i).getText().split("-");

			String formattedName=name[0].trim();
			
			List<String> itemsNeededList = Arrays.asList(itemsListed);
			
			if(itemsNeededList.contains(formattedName))
				
			{
			j++;
			driver.findElements(By.xpath("//div[@class='product-action']/button]")).get(i).click();
			if(j==itemsListed.length)
			{
			break; //we will not use "break" while using array list.
		}
		
		
		

	}

}
	
}
}
