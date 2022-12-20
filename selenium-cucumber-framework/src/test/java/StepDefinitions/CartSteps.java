package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Runners.CodeBase;
import Runners.TestRunner;

public class CartSteps extends CodeBase {

	@Given("^Visior is on registration Page$")
	public void user_is_on_Home_Page() throws Throwable {
		openUrl("https://buggy.justtestit.org/");
		
	}

	@When("^Visior enters registration details and Click on register$")
	public void user_Navigate_to_Registeration_Page() throws Throwable {
		
		WebElement element=driver.findElement(By.xpath("//a[text()='Register']"));
		click(element);
	}

	@Then("^Verify visior can vote for a sport car$")
	public void Verify_Registration_URL() throws Throwable {
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(currentURL, "https://buggy.justtestit.org/register");
		driver.quit();
	}

}
