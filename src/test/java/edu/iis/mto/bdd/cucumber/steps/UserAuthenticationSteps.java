package edu.iis.mto.bdd.cucumber.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import edu.iis.mto.bdd.model.FrequentFlyerMember;

public class UserAuthenticationSteps {
	private final WebDriver driver = new FirefoxDriver();
	
    @Given("^(.*) is a registered Frequent Flyer$")
    public void givenARegisteredFrequentFlyer(FrequentFlyerMember user) {}

    @When("^(.*) authenticates with a valid email address and password$")
    public void whenJaneAuthenticatesWithAValidEmailAddressAndPassword(FrequentFlyerMember user) {
    	driver.get("http://localhost:8080/#/welcome");
    	driver.findElement(By.name("email")).sendKeys(user.getEmail());
		driver.findElement(By.name("password")).sendKeys(user.getPassword());
		driver.findElement(By.id("signin")).click();
		
    }

    @Then("^(.*) should be given access to (?:her|his) account$")
    public void thenTheUserShouldBeGivenAccessToAccount(FrequentFlyerMember user) {
    }

    @Given("^(.*) has logged on$")
    public void aUserHasLoggedOnAs(FrequentFlyerMember user) {
    }

    @When("^(?:.*) views the home page$")
    public void whenAUserViewsTheHomePage() {}

}
