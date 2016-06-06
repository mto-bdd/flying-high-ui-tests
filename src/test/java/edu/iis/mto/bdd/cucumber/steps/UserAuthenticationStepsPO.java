package edu.iis.mto.bdd.cucumber.steps;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import edu.iis.mto.bdd.cucumber.pages.HomePageWebDriver;
import edu.iis.mto.bdd.cucumber.pages.LoginPage;
import edu.iis.mto.bdd.cucumber.pages.LoginPageWebDriver;
import edu.iis.mto.bdd.model.FrequentFlyerMember;

public class UserAuthenticationStepsPO {
	private final WebDriver driver = new FirefoxDriver();
	private LoginPageWebDriver loginPage;

//	@Given("^(.*) is a registered Frequent Flyer$")
	public void givenARegisteredFrequentFlyer(FrequentFlyerMember user) {
	}

//	@When("^(.*) authenticates with a valid email address and password$")
	public void whenJaneAuthenticatesWithAValidEmailAddressAndPassword(FrequentFlyerMember user) {
		loginPage = new LoginPageWebDriver(driver);
		loginPage.open();
		loginPage.signinWithCredentials(user.getEmail(), user.getPassword());

	}

//	@Then("^(.*) should be given access to (?:her|his) account$")
	public void thenTheUserShouldBeGivenAccessToAccount(FrequentFlyerMember user) {
		HomePageWebDriver homepage = new HomePageWebDriver(driver);

		assertThat(homepage.getWelcomeMessage(), equalTo("Witaj " + user.getFirstName()));

	}

//	@Given("^(.*) has logged on$")
	public void aUserHasLoggedOnAs(FrequentFlyerMember user) {
		loginPage = new LoginPageWebDriver(driver);
		loginPage.open();
		loginPage.signinWithCredentials(user.getEmail(), user.getPassword());
	}

//	@When("^(?:.*) views the home page$")
	public void whenAUserViewsTheHomePage() {
	}

}
