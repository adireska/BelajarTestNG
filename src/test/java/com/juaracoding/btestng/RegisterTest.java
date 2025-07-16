package com.juaracoding.btestng;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegisterTest {
  private Register register;

  @BeforeClass(groups = "setup")
  public void setup() {
    register = new Register();
  }

  @Test(priority = 1, groups = { "p-high", "regressionTest" })
  @Parameters("username")
  public void fillUsername(String username) {
    register.setUsername(username);
    Assert.assertEquals(username, register.getUsername());
  }

  @Test(priority = 2, groups = { "high", "regressionTest" })
  @Parameters("password")
  public void fillPassword(String password) {
    register.setPassword(password);
    Assert.assertEquals(password, register.getPassword());
  }

  @Test(priority = 3, groups = { "low" })
  @Parameters("email")
  public void fillEmail(String email) {
    register.setEmail(email);
    Assert.assertEquals(email, register.getEmail());
  }

  @Test(priority = 4, groups = { "regresionTest" })
  public void clickButtonRegister() {
    boolean actual = register.clickButtonRegister();
    Assert.assertTrue(actual);
  }
}
