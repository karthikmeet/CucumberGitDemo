package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@./src/test/resource/failed.txt", glue = { "org.stepdefinition" }, plugin = "rerun:./src/test/resource/failed.txt")
public class Rerunner {

}


