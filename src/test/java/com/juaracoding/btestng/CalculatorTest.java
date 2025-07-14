package com.juaracoding.btestng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {
  private int a;
  private int b;

  @BeforeClass
  public void setup() {
    a = 10;
    b = 2;
  }

  @Test
  public void addTest() {
    int expected = 12;

    int actual = Calculator.add(a, b);
    Assert.assertEquals(actual, expected);
  }

  @Test
  public void substractTest() {

    int expected = 8;
    int actual = Calculator.substract(a, b);

    Assert.assertEquals(expected, actual);
  }

  @AfterClass
  public void tearDown() {
    a = 0;
    b = 0;
  }
}
