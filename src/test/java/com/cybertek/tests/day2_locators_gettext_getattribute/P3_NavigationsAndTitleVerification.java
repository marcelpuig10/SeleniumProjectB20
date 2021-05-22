package com.cybertek.tests.day2_locators_gettext_getattribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationsAndTitleVerification {

    public static void main(String[] args) {

        //TC #3: Back and forth navigation
        //1. Open chrome browser

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //2. Go to Google
        driver.get("https://google.com");

        //3. Click to Gmail from top
        driver.findElement(By.linkText("Gmail")).click();


        //4. Verify title contains:
        //Expected: Gmail
        String expectedInTitle = "Gmail";
        String actualTitle=   driver.getTitle();

        if (actualTitle.contains(expectedInTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");

        }

        //5. Go back to  google
        driver.navigate().back();

        //6. Verify title equals
        //Expected: Google

        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();

        if (actualGoogleTitle.contains(expectedGoogleTitle)){
            System.out.println("Google title verification PASSED!");
        }else{
            System.out.println("Google title verification FAILED!!!");
        }











    }
}
