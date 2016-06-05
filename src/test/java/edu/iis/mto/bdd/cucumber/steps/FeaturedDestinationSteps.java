package edu.iis.mto.bdd.cucumber.steps;

import cucumber.api.java.en.Then;

/**
 * A description goes here.
 * User: john
 * Date: 6/10/13
 * Time: 9:13 PM
 */
public class FeaturedDestinationSteps {


    @Then("^(she|he) should see (d+) featured destinations$")
    public void shouldSeeFeaturedDestinations(int featuredCount) {
    }

    @Then("^the featured destinations should include (.*) costing (d+)$")
    public void featuredDestinationsShouldInclude(String expectedDestination, int price) {
    }
}
