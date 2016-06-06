package edu.iis.mto.bdd.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject {

	private final WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getWelcomeMessage() {
		return driver.findElement(By.id("welcome-message")).getText();
	}

}
