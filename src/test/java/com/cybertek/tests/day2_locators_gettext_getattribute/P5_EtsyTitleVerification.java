package com.cybertek.tests.day2_locators_gettext_getattribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_EtsyTitleVerification {

    public static void main(String[] args) {

        //TC #5: Etsy Title Verification

        //1. Open Chrome Browser

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //2. Go to https://www.etsy.com

        driver.get("https://www.etsy.com");

        //3. Search for wooden spoon

        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon" + Keys.ENTER);

        //4. Verify title
        //Expected: "Wooden spoon | Etsy"

        String expectedTitle ="Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Title Verification PASSED!");
        }else{
            System.out.println("Title Verification FAILED!!!");
        }










    }
}
