import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Class name = ChromeDriver
		// 
		System.setProperty("webdriver.chrome.driver", "D:\\Java_Related\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // Create driver object for Browser
		driver.get("http://mail.google.com");    // To launch Google.com
		System.out.println(driver.getTitle()); // To get the Title of the page.
		System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("mukesh82.k@gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("mukesh82.k@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		//driver.findElement(By.cssSelector("input.whsOnd.zHQkBf")).sendKeys("£$%66");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("£$%66");
		//driver.findElement(By.id("passwordNext")).click();
		//driver.findElement(By.className("rFrNMe A3sRAb YKooDc q9Nsuf zKHdkd sdJrJc")).sendKeys("£$%66");
		//driver.findElement(By.id("passwordNext")).click();
		
			//custom xpath
		//tagname[@
	}

}
