package com.cybertek.tests.day2_locators_gettext_getattribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_HeaderVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        //Verify header text
        //Expected: "Log in to Zero Bank"

        //WebElement header = driver.findElement(By.tagName("h3"));// find element returns WebElement

        String actualText = driver.findElement(By.tagName("h3")).getText();
        String expectedText = "Log in to ZeroBank";

        if (actualText.equals(expectedText)){
            System.out.println("Header verification PASSED!");
        }else{
            System.out.println("Header verification FAILED!!!");
        }












    }
}
