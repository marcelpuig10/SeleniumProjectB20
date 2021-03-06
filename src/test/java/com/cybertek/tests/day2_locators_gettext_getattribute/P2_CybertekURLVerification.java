package com.cybertek.tests.day2_locators_gettext_getattribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekURLVerification {

    public static void main(String[] args) {

        //TC #2: Cybertek Verifications

        //1. Open Chrome browser
            //setup my browser driver
        WebDriverManager.chromedriver().setup();
            //create instance of chrome browser from WebDriver
        WebDriver driver = new ChromeDriver();

            //this line will maximize the newly opened browser page
        driver.manage().window().maximize();

        //2. Go to https://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com");

        //3. Verify URL contains
        //Expected: cybertekschool
        String expectedInUrl = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedInUrl)){
            System.out.println("URL Verification PASSED!");
        }else{
            System.out.println("URL Verification FAILED!!!");
        }

        //4.0 Verify title:
        //Expected: Practice
        if (driver.getTitle().equals("Practice")){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }









    }
}
