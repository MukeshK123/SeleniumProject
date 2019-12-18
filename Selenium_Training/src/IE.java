import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//InternetExplorerDriver
		System.setProperty("webdriver.ie.driver", "C:\\Windows\\MicrosoftWebDriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());

	}

}
