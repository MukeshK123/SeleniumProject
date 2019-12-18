import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FirefoxDriver
		System.setProperty("webdriver.gecko.driver", "D:\\Java_Related\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		driver.navigate().to("http://yahoo.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.close();
		//driver.quit();
	}

}
