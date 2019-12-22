package StepDefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RediffLoginStepDef {
	
	@Given("^User is on the Rediff Login landing page$")
	@Test
    public void user_is_on_the_rediff_login_landing_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java_Related\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
	}

    @When("^User gives credentials to login as Jim and password1 $")
    public void user_gives_credentials_to_login_as_jim_and_password1() throws Throwable {
    	
    
        
    }

    @Then("^Rediff Home page is populated $")
    public void rediff_home_page_is_populated() throws Throwable {
        
    }

}
