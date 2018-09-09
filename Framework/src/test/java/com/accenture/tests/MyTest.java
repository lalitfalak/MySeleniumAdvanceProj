package com.accenture.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class MyTest {
  @Test
  public void loginTest() {
	  boolean ER=true;
	  boolean AR=true;
	  Assert.assertEquals(AR, ER);
  }
  @Test
  public void Registration() {
	  boolean ER=true;
	  boolean AR=false;
	  Assert.assertEquals(AR, ER);
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
