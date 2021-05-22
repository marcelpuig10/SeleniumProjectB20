package com.cybertek.tests.Practicas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankAll {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/");

        driver.manage().window().maximize();

       // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        Thread.sleep(3000);

        driver.findElement(By.id("signin_button")).click();
        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.name("user_password")).sendKeys("password" + Keys.ENTER);

        Thread.sleep(3000);




    }
}
