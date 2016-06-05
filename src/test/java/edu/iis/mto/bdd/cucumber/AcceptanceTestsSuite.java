package edu.iis.mto.bdd.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty",
		"html:target/cucumber" }, glue = "edu.iis.mto.bdd.cucumber.steps", features = {"classpath:edu.iis.mto.bdd.cucumber"})
public class AcceptanceTestsSuite {

}
