package edu.iis.mto.bdd.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private final WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void open() {
		driver.get("http://localhost:8080/#/welcome");
	}

	public void signinWithCredentials(String userEmail, String userPassword) {
		driver.findElement(By.name("email")).sendKeys(userEmail);
		driver.findElement(By.name("password")).sendKeys(userPassword);
		driver.findElement(By.id("signin")).click();
	}
}
