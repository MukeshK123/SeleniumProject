import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class HttpsTest {
	@Test
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//code to proceed when there are ssl certificate issues on diff browsers when trying launch a web browser.
		//Adding capabilities to your chrome browser
		
		DesiredCapabilities ch= DesiredCapabilities.chrome();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		
		/*
		//firefox code
		DesiredCapabilities ff= DesiredCapabilities.firefox();
		ff.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ff.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);*/
		
		
		//IE Code
		/*
		DesiredCapabilities ie= DesiredCapabilities.internetExplorer();
		ie.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ie.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);*/
		
		
		//code for local browser
	    ChromeOptions c = new ChromeOptions();
		//InternetExplorerDriver c = new InternetExplorerDriver(); (Not sure what are the options for IE)
		c.merge(ch);
	
		System.setProperty("webdriver.chrome.driver", "D:\\Java_Related\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize(); //To Maximize the window.
		//driver.manage().deleteAllCookies(); // To delete cookies..
		//driver.manage().deleteCookieNamed("sessionKey name"); // To delete a specific cookie by name.
		System.out.println("Deleted Cookies");
		
		// Take Screenshots in Selenium
		//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D://Java_Related//screenshot.png")); // To copy file from "src" object to local folder.
		System.out.println("Printed Screenshot");
		

	}

}
