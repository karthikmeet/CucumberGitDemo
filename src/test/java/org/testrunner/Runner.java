package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = { "org.stepdefinition" }, monochrome = true,
plugin = "rerun:./src/test/resource/failed.txt")
public class Runner {

}