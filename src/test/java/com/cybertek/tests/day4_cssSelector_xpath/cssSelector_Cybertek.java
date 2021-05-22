package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cssSelector_Cybertek {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        System.out.println("honeLink.isDisplayed() = " + homeLink.isDisplayed());

        WebElement forgotPassword =driver.findElement(By.cssSelector("button[id='form_submit']"));
        System.out.println("forgotPassword.isDisplayed() = " + forgotPassword.isDisplayed());

        WebElement emailText = driver.findElement(By.cssSelector("label[for='email']"));
        System.out.println("emailText.isDisplayed() = " + emailText.isDisplayed());

        WebElement emailInputBox = driver.findElement(By.cssSelector("input[type='text']"));
        System.out.println("emailInputBox.isDisplayed() = " + emailInputBox.isDisplayed());






    }
}
