package com.cybertek.tests.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F1_TitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitile = driver.getTitle();

        if(expectedTitle.equals(actualTitile)){
            System.out.println("PASS");
        }else{
            System.out.println("Failed");
        }
    }
}
