package com.demoqa.steps;

import org.openqa.selenium.WebDriver;

import com.demoqa.pages.Base;
import com.demoqa.pages.HomePage;

//import cucumber.api.java.en.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	WebDriver driver;
//	
//	public StepDefinitions(WebDriver driver) {
//		this.driver = driver;
//	}
	
	Base base = new Base();
	HomePage homepage;

@Given("^user launches the application$")
public void user_launches_the_application() {
//	WebDriverManager.chromedriver().setup();
//	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//	driver.get("https://demoqa.com/");
	driver = base.openWebPage();
}
@Then("user should land on Demo QA home page")
public void user_should_land_on_demo_qa_home_page() {
	homepage = new HomePage(driver);
//	homepage = new HomePage(base.driver);
	homepage.verifyHomePageTitle();
}
@When("user navigates to elements page")
public void user_navigates_to_elements_page() throws InterruptedException {
	homepage = new HomePage(driver);
	homepage.enterElementsPage();
}


}
