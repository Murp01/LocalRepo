package com.cucumber.LLMavenCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefNewsletterSignUpForm {
	WebDriver driver;
	
	@Given("^the user opens the newsletter page$")
	public void the_user_opens_the_newsletter_page() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "c:\\Eclipse\\Webdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
	}

	@Then("^opens the form$")
	public void opens_the_form() throws Throwable {
		System.out.println("It opens the form");
	}

	@Then("^completes all mandatory fields$")
	public void completes_all_mandatory_fields() throws Throwable {
		System.out.println("It fills in all mandatory fields");
	}

	@Then("^clicks submite$")
	public void clicks_submite() throws Throwable {
		System.out.println("It Clicks on submit");

	}

	@Then("^the form will send$")
	public void the_form_will_send() throws Throwable {
		System.out.println("The form is sent");

	}

	@Then("^a success message will appear$")
	public void a_success_message_will_appear() throws Throwable {
		System.out.println("Congrats message is displayed");
	}

}
