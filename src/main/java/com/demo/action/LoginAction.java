package com.demo.action;

import com.demo.locatrs.LoginLocators;

public class LoginAction extends BaseClass{
	LoginLocators loginLocators = new LoginLocators(driver);

	public void login() {
	loginLocators.useranme.sendKeys("ankita");
	loginLocators.btn.click();
	
	}
}
