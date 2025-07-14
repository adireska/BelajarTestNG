package com.juaracoding.btestng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;


public class Hooks {
    @BeforeMethod
    public void BeforeMethod() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void AfterMethod() {
        System.out.println("After Method");
    }


}
