import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		System.setProperty("webdriver.chrome.driver", "D:\\Java_Related\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//b[contains(text(),'Veg/fruit name')]")).click();
		//driver.findElement(By.xpath("//b[contains(text(),'Veg/fruit name')]")).click();
		java.util.List<WebElement> firstColList=driver.findElements(By.cssSelector("tr td:nth-child(2)"));// Only webelements of column 2
		
		ArrayList<String> originalList=new ArrayList<String>(); 
		for(int i=0;i<firstColList.size();i++)
		{
			 originalList.add(firstColList.get(i).getText());
			
			System.out.println("original list is" + originalList.get(i));
		}
		
		ArrayList<String> copiedList=new ArrayList<String>();
		
		for (int i = 0;i<originalList.size();i++)
		{
			copiedList.add(originalList.get(i));
		}
		
		Collections.sort(copiedList);
		Collections.reverse(copiedList);
		for(int i=0;i<copiedList.size();i++)
		{
			System.out.println("sorted list is" + copiedList.get(i));
		}
		
		Assert.assertTrue(originalList.equals(copiedList));
		
		
		
		
		
		
		

	}

}
