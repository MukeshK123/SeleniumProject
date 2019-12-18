import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java_Related\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0); // identifying frame by index (Starts with 0)
		driver.switchTo().frame("String"); // Frame name..
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-free']"))); // identifying frame by tag(iframe) webelement 
		driver.switchTo().frame(driver.findElement(By.cssSelector("frameset[class='demo-free']"))); // identifying frame by tag(frameset) webelement
		
		Actions a = new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable")); 
		WebElement target=driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, target).build().perform(); 
		driver.switchTo().defaultContent();  // to come out of the frame and do other actions in the webpage.
}
	
}
