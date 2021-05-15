package com.demoqa.steps;

//import cucumber.api.java.en.*;

import io.cucumber.java.en.*;

public class StepDefinitions {
	

@Given("^user launches the application$")
public void user_launches_the_application() {
	System.out.println("11111");
}
@Then("user should land on Demo QA home page")
public void user_should_land_on_demo_qa_home_page() {
	System.out.println("2222222");
}
@When("user navigates to elements page")
public void user_navigates_to_elements_page() {
	System.out.println("333333333");
}


}
