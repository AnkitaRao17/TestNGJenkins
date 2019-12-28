package com.demo.test;

import org.testng.annotations.Test;

import com.demo.action.BaseClass;
import com.demo.action.LoginAction;

public class Logintest extends BaseClass {
	
  @Test
  public void f() {
	  LoginAction act1 = new LoginAction();
      act1.login();
  }
}
