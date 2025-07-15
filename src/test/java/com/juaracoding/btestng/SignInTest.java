package com.juaracoding.btestng;
import org.testng.annotations.Test;

public class SignInTest {
  @Test(priority = 1)
  public void signinTest() {
    System.out.println("Method A");
  }

  @Test(priority = 2, enabled = false)
  public void dashboardTest() {
    System.out.println("Method B");
  }

  @Test(priority = 3)
  public void profileTest() {
    System.out.println("Method C");
  }

}
