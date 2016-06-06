package edu.iis.mto.bdd.cucumber.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://localhost:8080/#/welcome")
public class LoginPageSerenity extends PageObject {

	private WebElement email;
	private WebElement password;

	private WebElement signin;

	public void signinWithCredentials(String userEmail, String userPassword) {
		email.sendKeys(userEmail);
		password.sendKeys(userPassword);
		signin.click();
	}

}
