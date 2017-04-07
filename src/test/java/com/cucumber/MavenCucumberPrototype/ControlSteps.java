package com.cucumber.MavenCucumberPrototype;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ControlSteps {

	public WebDriver driver;

	@Given("^I am on the zoo site$")
	public void i_am_on_the_zoo_site() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium Projects\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.thetestroom.com/webapp/");
	}

	@When("^I click on the \"([^\"]*)\"$")
	public void i_click_on_the(String page) throws Throwable {
		driver.findElement(By.id(page.toLowerCase()+"_link")).click();
		//driver.findElement(By.xpath("//*[@id='contact_link']")).click();
	}

	@Then("^I set the start date to \"([^\"]*)\"$")
	public void i_set_the_start_date_to(String dropItem) throws Throwable {
		Select select = new Select(driver.findElement(By.id("start_select")));
		select.selectByVisibleText(dropItem);
	}

	@Then("^I close the broswer$")
	public void i_close_the_broswer() throws Throwable {
		Thread.sleep(1000);
		driver.quit();
	}

	@Then("^I populate the contact form$")
	public void i_populate_the_contact_form() throws Throwable {
		driver.findElement(By.name("name_field")).sendKeys("Rekha Arun");
		driver.findElement(By.id("rdona")).click();
		driver.findElement(By.id("cdona")).click();
	}
}
