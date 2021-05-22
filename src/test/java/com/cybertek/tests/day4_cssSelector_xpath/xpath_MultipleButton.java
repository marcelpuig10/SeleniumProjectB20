package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class   xpath_MultipleButton {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement button1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));

        button1.click();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        String expectedText = "clicked on button one!";
       // String actualText =
    }
}
