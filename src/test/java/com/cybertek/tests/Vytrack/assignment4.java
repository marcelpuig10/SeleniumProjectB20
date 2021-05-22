package com.cybertek.tests.Vytrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class assignment4 {


    WebDriver driver;

//AC# 4 Verify that truck driver should be able to delete Vehicle odometer.

    @BeforeMethod

    public void setUpMethod(){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        //Open given URL
        driver.get("https://qa2.vytrack.com/user/login");

        //Login as a truck driver


        String  username= "user151";
        String password= "UserUser123";

        driver.findElement(By.id("prependedInput")).sendKeys(username);
        driver.findElement(By.id("prependedInput2")).sendKeys(password);

        driver.findElement(By.id("_submit")).click();

        //Go to Vehicles Odometer page

        driver.get("https://qa2.vytrack.com/entity/Extend_Entity_VehiclesOdometer");




    }

    @Test

    public void delete_entry_vehicle_odometer(){

        driver.findElement(By.name("checkbox")).click();





    }

    @AfterMethod

    public void TearDownMethod() throws InterruptedException{
            Thread.sleep(3000);
            driver.close();



    }
}

