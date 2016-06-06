package edu.iis.mto.bdd.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class HomePageSerenity extends PageObject {

	@FindBy(id = "welcome-message")
	private WebElement welcomeMessage;

	public String getWelcomeMessage() {
		return welcomeMessage.getText();
	}

}
