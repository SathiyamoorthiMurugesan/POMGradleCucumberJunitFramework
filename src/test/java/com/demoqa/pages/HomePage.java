package com.demoqa.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By DemoQAImage = By.linkText("https://demoqa.com/");
	By Elements = By.xpath("//h5[contains(text(),'Elements')]");
	
	public void verifyHomePageTitle() {
		Assert.assertEquals("ToolsQA", driver.getTitle());
	}
	
	public void enterElementsPage() {
		driver.findElement(Elements).click();
	}
}
