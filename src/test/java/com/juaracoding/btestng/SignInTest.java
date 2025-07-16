package com.juaracoding.btestng;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class SignInTest {
  private SignIn signIn;

  @BeforeClass
  public void setup() {
    System.out.println("SigninTest.setup");
    signIn = new SignIn();
  }

  @Test(priority = 1)
  @Parameters({"username", "password"})
  public void fillUsername(String username, String password) {
    signIn.setUsername(username);
    signIn.setPassword(password);
    Assert.assertEquals(username, signIn.getUsername());
  }

  // @Test(priority = 2)
  // @Parameters("password")
  // public void fillPassword(String password) {
  //   signIn.setPassword(password);
  //   Assert.assertEquals(password, signIn.getPassword());
  // }

  @Test(priority = 2)
  public void clickButtonSignIn() {
    boolean actual = signIn.clickButtonSignIn();
    Assert.assertTrue(actual);
  }

}
