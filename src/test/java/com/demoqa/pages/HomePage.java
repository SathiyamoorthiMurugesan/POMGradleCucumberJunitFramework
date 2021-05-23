package com.demoqa.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	Base base;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By DemoQAImage = By.linkText("https://demoqa.com/");
//	By Elements = By.xpath("//h5[contains(text(),'Elements')]");
	By Elements = By.xpath("//div[@class='card-body'][1]");
	By TextBox = By.xpath("//span[contains(text(),'Text Box')]");
	By FullName = By.id("userName");
	By UserEmail = By.id("userEmail");
	By CurrentAddress = By.id("currentAddress");
	By permanentAddress = By.id("permanentAddress");
	
	
	public void verifyHomePageTitle() {
		Assert.assertEquals("ToolsQA", driver.getTitle());
	}
	
	public void scrollIntoElement1(WebElement ele) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
	}
	
	public void enterElementsPage() throws InterruptedException {
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(Elements)).click().build().perform();
//		System.out.println(driver.findElement(Elements).getText());
//		scrollIntoElement(driver.findElement(Elements));
		scrollIntoElement1(driver.findElement(Elements));
		driver.findElement(Elements).click();
	}
	
	public void completeTextBox() {
		driver.findElement(TextBox).click();
		driver.findElement(FullName).sendKeys("Sathya");
		driver.findElement(UserEmail).sendKeys("sathya08ece@gmail.com");
		driver.findElement(CurrentAddress).sendKeys("Chennai");
		driver.findElement(permanentAddress).sendKeys("Dharapuram");
		
	}
}
