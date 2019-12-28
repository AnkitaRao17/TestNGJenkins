package com.demo.locatrs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginLocators {
	WebDriver driver;
	  
	//constructor
	 public LoginLocators (WebDriver driver){
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
	 }
	 
	 
	 @FindBy(id="user-message")
	 public WebElement useranme;
	 
	 @FindBy(xpath="//button[text()= 'Show Message']")
	 public WebElement btn;
	 

}
