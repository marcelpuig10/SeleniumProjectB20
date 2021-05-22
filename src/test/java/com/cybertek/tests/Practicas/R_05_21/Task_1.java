package com.cybertek.tests.Practicas.R_05_21;

import com.cybertek.tests.day3.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task_1 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa3.vytrack.com/user/login");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Login";

        String check = actualTitle.equals(expectedTitle) ? "PASSED: actual title as expected title" : "FAILED: actual title not as expected";
        System.out.println(check);

       WebElement usernameLoginPage =  driver.findElement(By.xpath("//input[@id='prependedInput']"));

       usernameLoginPage.sendKeys("Storemanager201");

        WebElement passwordLoginPage =  driver.findElement(By.xpath("//input[@type='password']"));
        passwordLoginPage.sendKeys("UserUser123");
        passwordLoginPage.submit();

        String actualTitle2 = driver.getTitle();
        String expectedTitle2 = "Dashboard";

        String check2 = actualTitle2.equals(expectedTitle2)? "Passed" : "Failed";
        System.out.println(check2);

        String checkLoginVsDashboard = actualTitle2.equals(actualTitle) ? "Failed" : "Passed";
        System.out.println(checkLoginVsDashboard);






  }
}
