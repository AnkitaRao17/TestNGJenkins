package com.demo.action;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass {
 public static WebDriver driver =null;
 
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "E:\\New folder\\java software\\chromedriver.exe");
		driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

  }

  //always give different name to methods than annotation
  @AfterMethod
  public void afterMethod() {
	 driver.close();
  }

}
