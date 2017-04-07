package com.cucumber.MavenCucumberPrototype;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format={"pretty","html:target/html/","json:target/json/output.json"},
		features="src/test/feature",
		tags={"@Application,@Dummy"}
		)
public class TestSuiteTest {

}
