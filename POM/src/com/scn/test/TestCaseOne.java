package com.scn.test;

import java.util.concurrent.TimeUnit;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.util.scn.Locator;

public class TestCaseOne
{
	public static WebDriver driver;
	public TestCaseOne(WebDriver driver) {
		this.driver=driver;
	}
	public static void main(String[] args) {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
		Locator locator=new Locator(driver);
		locator.EditBox(driver, "Email", "selenium");
		locator.buttonClick(driver, "next");
		locator.EditBox(driver, "Passwd", "Test");
		locator.buttonClick(driver,"signIn");
		locator.clickLink(driver,"Sign in with a different account");
		
	}
}
