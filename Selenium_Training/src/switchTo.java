import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Java_Related\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Set<String> handleid=driver.getWindowHandles();
		Iterator<String> it=handleid.iterator();
		String parentid=it.next();
		String childid=it.next();
		
		driver.switchTo().window(parentid);
		driver.switchTo().window(childid);
	
	}

}
