package edu.iis.mto.bdd.cucumber.workflowsteps;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import edu.iis.mto.bdd.cucumber.pages.HomePageSerenity;
import edu.iis.mto.bdd.cucumber.pages.LoginPageSerenity;
import edu.iis.mto.bdd.model.FrequentFlyerMember;
import net.thucydides.core.annotations.Step;

public class AuthenticationWorkFlowSteps {
	LoginPageSerenity loginPage;
	HomePageSerenity homePage;

	@Step
	public void enterEmailAndPasswordFor(FrequentFlyerMember user) {
		loginPage.open();
		loginPage.signinWithCredentials(user.getEmail(), user.getPassword());
	}

	@Step
	public void verifyWelcomeMessageFor(FrequentFlyerMember user) {
		String welcomeMessage = homePage.getWelcomeMessage();
		assertThat(welcomeMessage, equalTo("Witaj " + user.getFirstName()));
	}
}
