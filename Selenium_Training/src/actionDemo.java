import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class actionDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		/*
		DesiredCapabilities ch= DesiredCapabilities.chrome();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);*/

		System.setProperty("webdriver.chrome.driver", "D:\\Java_Related\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		Actions a = new Actions(driver); //Actions class to capture mouse over etc...
		//a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform(); // using xpath locator
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D://Java_Related//screenshot.png")); // To copy file from "src" object to local folder.
		System.out.println("Printed Screenshot");
		//creating a variable(move) of type webelement and storing the value in move.
		WebElement move=driver.findElement(By.xpath("//span[contains(@class,'nav-line-2')][contains(text(),'Account & Lists')]"));
		a.moveToElement(move).contextClick().build().perform();
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		synchronized(driver)
		{
		driver.wait(5); // java.lang.IllegalMonitorStateException (how to resolve this)
		}
		driver.close();
		//can also break the below line as above
		//a.moveToElement(driver.findElement(By.xpath("//span[contains(@class,'nav-line-2')][contains(text(),'Account & Lists')]"))).build().perform(); //using xpath locator
		//a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform(); // using id locator
		
	}

}
