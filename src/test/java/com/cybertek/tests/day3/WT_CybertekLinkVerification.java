package com.cybertek.tests.day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WT_CybertekLinkVerification {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        
    }

}
