package StepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CartSteps2 {

	@Given("^User go to SPA$")
	public void user_is_on_Home_Page() throws Throwable {
		System.out.println("0");
		}

	@When("^User fuck$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		System.out.println("1");
		}


}
