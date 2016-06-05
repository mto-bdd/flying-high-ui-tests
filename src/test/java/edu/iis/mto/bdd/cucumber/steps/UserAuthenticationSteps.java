package edu.iis.mto.bdd.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import edu.iis.mto.bdd.model.FrequentFlyerMember;

public class UserAuthenticationSteps {


    @Given("^$user is a registered Frequent Flyer$")
    public void givenARegisteredFrequentFlyer(FrequentFlyerMember user) {}

    @When("^$user authenticates with a valid email address and password$")
    public void whenJaneAuthenticatesWithAValidEmailAddressAndPassword(FrequentFlyerMember user) {
    }

    @Then("^$user should be given access to (her|his) account$")
    public void thenTheUserShouldBeGivenAccessToAccount(FrequentFlyerMember user) {
    }

    @Given("^$user has logged on$")
    public void aUserHasLoggedOnAs(FrequentFlyerMember user) {
    }

    @When("^$user views the home page$")
    public void whenAUserViewsTheHomePage() {}

}
