package edu.iis.mto.bdd.cucumber.steps;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Then;

/**
 * A description goes here.
 * User: john
 * Date: 6/10/13
 * Time: 9:13 PM
 */
public class FeaturedDestinationSteps {

	private final WebDriver driver = new FirefoxDriver();
	
    @Then("^(?:she|he) should see ([0-9]+) featured destinations$")
    public void shouldSeeFeaturedDestinations(int featuredCount) {
    	List<WebElement> featuredDestinations = driver.findElements(By.cssSelector("#featured .destination-title"));
    	assertThat(featuredDestinations.size(), equalTo(featuredCount));
    }

    @Then("^the featured destinations should include (.*) costing ([0-9]+)$")
    public void featuredDestinationsShouldInclude(String expectedDestination, int price) {
    	List<WebElement> featuredDestinations = driver.findElements(By.cssSelector("#featured .destination-title"));
    	for (WebElement featuredDestination : featuredDestinations) {
    		String destinationCity =  featuredDestination.findElement(By.cssSelector(".destination-title")).getText();
    		String priceValue = featuredDestination.findElement(By.className(".destination-price")).getText();
    		int priceIntValue = Integer.parseInt(priceValue.substring(1));
		}
    	
    }
}
