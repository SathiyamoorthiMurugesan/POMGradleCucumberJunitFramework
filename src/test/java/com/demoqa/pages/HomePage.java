package com.demoqa.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	Base base = new Base();
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By DemoQAImage = By.linkText("https://demoqa.com/");
//	By Elements = By.xpath("//h5[contains(text(),'Elements')]");
	By Elements = By.xpath("//div[@class='card-body'][1]");
	
	public void verifyHomePageTitle() {
		Assert.assertEquals("ToolsQA", driver.getTitle());
	}
	
	public void scrollIntoElement(WebElement ele) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
	}
	
	public void enterElementsPage() throws InterruptedException {
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(Elements)).click().build().perform();
//		System.out.println(driver.findElement(Elements).getText());
		base.scrollIntoElement(driver.findElement(Elements));
//		scrollIntoElement(driver.findElement(Elements));
		driver.findElement(Elements).click();
	}
}
