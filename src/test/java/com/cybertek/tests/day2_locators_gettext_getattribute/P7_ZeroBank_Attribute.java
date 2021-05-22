package com.cybertek.tests.day2_locators_gettext_getattribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P7_ZeroBank_Attribute {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement zeroBankLink = driver.findElement(By.className("brand"));

        String expectedLinkText = "Zero Bank";
        String actualLinkText = zeroBankLink.getText();
        if(actualLinkText.equals(expectedLinkText)){
            System.out.println("Link text verification PASSED");
        }else{
            System.out.println("Link text verification FAILED");
        }

        String expectedInAttributeValue = "index.html";
        String actualHREFValue = zeroBankLink.getAttribute("href");

        if(actualHREFValue.contains(expectedInAttributeValue)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }
    }
}
