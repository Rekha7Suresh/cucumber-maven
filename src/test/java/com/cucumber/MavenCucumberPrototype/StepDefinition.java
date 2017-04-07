package com.cucumber.MavenCucumberPrototype;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	@Given("^This is my first dummy step")
	public void This_is_my_first_dummy_step() throws Throwable{
		System.out.println("executing first step");
	}
	
	@When("^This is my sec dummy step")
	public void This_is_my_sec_dummy_step() throws Throwable{
		System.out.println("executing sec step");
	}
	
	@Then("^This is my third dummy step")
	public void This_is_my_third_dummy_step() throws Throwable{
		System.out.println("executing third step");
	}
	
	@Then("^This is my last dummy step")
	public void This_is_my_last_dummy_step() throws Throwable{
		Assert.assertFalse(false);
	}
}
