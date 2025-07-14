package com.juaracoding.btestng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignInTest {
  private String username;
  private String password;

  @BeforeClass
  public void setup() {
    username = "jhondoe";
    password = "123qwerty";
  }

  @Test
  public void tc003() {
    SignIn signIn = new SignIn();

    signIn.setUsername(username);
    signIn.setPassword(password);
    boolean actual = signIn.onSignIn();

    Assert.assertTrue(actual);
  }

  @AfterClass
  public void tearDown() {
    username = "";
    password = "";
  }
}
