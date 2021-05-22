package com.cybertek.tests.day1_seleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooPractice {
    public static void main(String[] args) {

        //TC #1: Yahoo Title Verification
        WebDriverManager.chromedriver().setup();

        //1. Open Chrome Browser
        WebDriver driver = new ChromeDriver();

        //maximize driver
        driver.manage().window().maximize();

        //2.Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");

        //3. Verify title
        //Expected: yahoo
        String expectedTitle = "Yahoo";
        String actualTitle = driver.getTitle();

        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expectedTitle = " + expectedTitle);

        //Creating verification

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!");
        }




    }
}
