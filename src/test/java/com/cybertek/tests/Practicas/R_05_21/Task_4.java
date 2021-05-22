package com.cybertek.tests.Practicas.R_05_21;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//YAHOO EMAIL LOGIN
public class Task_4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%3B_ylt%3DA2KLfSc6S6hgykAAOGpXNyoA%3B_ylu%3DY29sbwNiZjEEcG9zAzEEdnRpZANDMTYxN18xBHNlYwNzcg--");
        driver.manage().window().maximize();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Yahoo";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
        }

        WebElement username = driver.findElement(By.id("login-username"));
        username.sendKeys();
    }
}
