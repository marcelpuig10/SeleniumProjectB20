package com.cybertek.tests.day1_seleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //1- setup the browser
        WebDriverManager.chromedriver().setup();

        //2- create instance of selenium web driver
        WebDriver driver = new ChromeDriver();

        //3- get the page for Tesla.com

        driver.get("https://www.tesla.com");

        System.out.println("Current title: " + driver.getTitle());
        System.out.println("current URL: " + driver.getCurrentUrl());

        //going back using navigations
        Thread.sleep(3000);//putting 3 seconds of wait
        driver.navigate().back();

        //going forward using navigations
        driver.navigate().forward();

        //3 seconds wait
        Thread.sleep(3000);

        //refreshing the page using navigations
        driver.navigate().refresh();

        //3 seconds wait
        Thread.sleep(3000);

        //going to another url using .to() method
        driver.navigate().to("https://www.google.com");

        System.out.println("Current title: " + driver.getTitle());

        driver.getCurrentUrl();
        System.out.println("Current title: " + driver.getTitle());
        System.out.println("current URL: " + driver.getCurrentUrl());

        driver.manage().window().maximize();

        driver.close();





    }
}
