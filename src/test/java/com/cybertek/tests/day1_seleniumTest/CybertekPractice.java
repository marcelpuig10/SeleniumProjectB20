package com.cybertek.tests.day1_seleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekPractice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cybertekschool.com/");

        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
        String expectedUrl = "cybertekschool";

        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);
        String expectedTitle = "Practice";

        if( currentUrl.equals(expectedUrl) && currentTitle.equals(expectedTitle)){
            System.out.println("Verification Title and URL: PASS!");
        }else {
            System.out.println("Verification Title and URL: FAILED!");
        }
    }
}
