package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {
	
	@Given("^Customer is on Landing page$")
	public void homePage()
	{
		System.out.println("Navigate to Landing Page");
	}
	
	@When("^Customer Logs into application with username and password$")
	public void loginPage()
	{
		System.out.println("Login Successful");
	}
	
	@Then("^Home page is populated$")
	public void mainPage()
	{
		System.out.println("Navigated to home Page");
	}
	
	@And("^Customer Account details are displayed$")
	public void accountDetails()
	{
		System.out.println("Navigated to account Page");
	}
}
