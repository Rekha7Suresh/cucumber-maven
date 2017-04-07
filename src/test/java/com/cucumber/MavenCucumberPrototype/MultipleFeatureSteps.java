package com.cucumber.MavenCucumberPrototype;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultipleFeatureSteps {

	@Given("^I have opened a \"([^\"]*)\" feature$")
	public void i_have_opened_a_feature(String window) throws Throwable {
		System.out.println("Opened a browser "+window);
	}

	@When("^I click on some link$")
	public void i_click_on_some_link() throws Throwable {
	    System.out.println("Clicked a link");
	}

	@Then("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
	    System.out.println("Closed the browser");
	}
}
