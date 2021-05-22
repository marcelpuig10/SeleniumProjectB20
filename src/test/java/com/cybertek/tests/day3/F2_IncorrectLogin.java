package com.cybertek.tests.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_IncorrectLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        //driver.findElement(By.id("email")).sendKeys("somethingwrong@gmail.com");

        WebElement inputUsername = driver.findElement(By.id("email"));

        inputUsername.sendKeys("somethingwrong@gmail.com");

        WebElement inputPassword = driver.findElement(By.id("pass"));

        inputPassword.sendKeys("some wrong password" + Keys.ENTER);

        String expectedTitle = "Log into Facebook";
        System.out.println(expectedTitle);

        Thread.sleep(5000);// it was giving failed cause it was gettin title from homepage.so had to wait few seconds
        //before pulling actual title
        //after adding a few seconds the result was PASS

        String actualTitle = driver.getTitle();

        System.out.println(actualTitle);

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("PASS");
        } else {
            System.out.println("Failed");
        }
    }
}
