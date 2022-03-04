package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.ui.WebDriverWait;

import org.repository.LoginPageRepo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class LoginPageSteps {
	LoginPageRepo repo = new LoginPageRepo();
	WebDriverWait wait;

	@Given("^Open Facebook and launch the application$")
	public void open_facebook_and_launch_the_application() {

	}

	@When("Enter the Username and Password")
	public void enter_the_Username_and_Password(DataTable table) {
		Map<String, String> asMap = table.asMap(String.class, String.class);
		System.out.println(asMap.get("One"));
		System.out.println(asMap.get("Two"));
		System.out.println(asMap.get("Three"));
		System.out.println(asMap.get("Four"));

	}

	@Then("^Close the browser$")
	public void close_the_browser(DataTable table2) {
		List<Map<String,String>> asMaps = table2.asMaps();
		
		System.out.println(asMaps.get(0));
		System.out.println(asMaps.get(1));
		System.out.println(asMaps.get(2));
		
		System.out.println();
		
		System.out.println(asMaps.get(0).get("S.No"));
		System.out.println(asMaps.get(1).get("Username"));
	}
}
