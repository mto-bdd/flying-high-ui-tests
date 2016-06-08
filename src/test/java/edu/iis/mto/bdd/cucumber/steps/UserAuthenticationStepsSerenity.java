package edu.iis.mto.bdd.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import edu.iis.mto.bdd.cucumber.workflowsteps.AuthenticationWorkFlowSteps;
import edu.iis.mto.bdd.model.FrequentFlyerMember;
import net.thucydides.core.annotations.Steps;

public class UserAuthenticationStepsSerenity {
	

	//@Given("^(.*) is a registered Frequent Flyer$")
	public void givenARegisteredFrequentFlyer(FrequentFlyerMember user) {
	}

	@Steps
	AuthenticationWorkFlowSteps authenticationWorkFlow;
	
	//@When("^(.*) authenticates with a valid email address and password$")
	public void whenJaneAuthenticatesWithAValidEmailAddressAndPassword(FrequentFlyerMember user) {
		authenticationWorkFlow.enterEmailAndPasswordFor(user);
	}

	//@Then("^(.*) should be given access to (?:her|his) account$")
	public void thenTheUserShouldBeGivenAccessToAccount(FrequentFlyerMember user) {
		authenticationWorkFlow.verifyWelcomeMessageFor(user);
	}

	//@Given("^(.*) has logged on$")
	public void aUserHasLoggedOnAs(FrequentFlyerMember user) {
		authenticationWorkFlow.enterEmailAndPasswordFor(user);
	}

	//@When("^(?:.*) views the home page$")
	public void whenAUserViewsTheHomePage() {
	}

}
