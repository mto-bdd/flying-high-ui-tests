package edu.iis.mto.bdd.cucumber.steps;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookingAFlightSteps {

  
    @Given("^I want to book a flight$")
    public void givenIWantToBookAFlight() {
    }

    @When("^I search for (.*) flights from (.*) to (.*) in (.*)$")
    public void whenISearchForFlights(String flightType, String from, String to, String travelClass) {
    }

    @Then("^I should see the list of all available flights$")
    public void thenIShouldSeeTheListOfAllAvailableFlights() {
    }


    @When("^I enter ('.*') into the 'from' city field$")
    public void enterFromPrefix(String prefix) {
    }

    @Then("^I should see the following cities:$")
    public void shouldSeeCities(List<String> expectedCities) {

    }

}
