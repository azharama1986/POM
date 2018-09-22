package com.util.scn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locator 
{
	public WebDriver driver;
	public Locator(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void EditBox(WebDriver driver,String locator,String value)
	{
		
			
		    driver.findElement(By.id(locator));
			if( driver.findElement(By.id(locator)).isEnabled())
			{   
				 driver.findElement(By.id(locator)).clear();
				 driver.findElement(By.id(locator)).sendKeys(value);
			}
			
			else
			{
				System.out.println("Element is not enabled to fill data");
			}
			
			
	}
	
	public void buttonClick(WebDriver driver,String locator)
	{
		
			
		    driver.findElement(By.id(locator));
			if( driver.findElement(By.id(locator)).isEnabled())
			{   
				 driver.findElement(By.id(locator)).click();
			}
			
			else
			{
				System.out.println("Element is not enabled to Click");
			}
			
			
	}
	
	public void clickLink(WebDriver driver,String locator)
	{
		
			
		    driver.findElement(By.linkText(locator));
			if( driver.findElement(By.linkText(locator)).isDisplayed())
			{   
				driver.findElement(By.linkText(locator)).click();
			}
			
			else
			{
				System.out.println("Link is not displayed to Click");
			}
			
			
	}
	
	public void dropDownSelect(WebDriver driver,String Locator,String Value)
	{
		
	}
	
	
	

}
