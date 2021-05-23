package com.demoqa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base {
	public WebDriver driver;
	Actions action;
	
		
	public WebDriver openWebPage() {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/");	
		return driver;
		}
	
	public void scrollIntoElement(WebElement ele) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
	}
	
}
