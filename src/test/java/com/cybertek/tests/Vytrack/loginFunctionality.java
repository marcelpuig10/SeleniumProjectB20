package com.cybertek.tests.Vytrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class loginFunctionality {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://qa2.vytrack.com/user/login");

        String expectedTitle= "Dashboard";
       String  username= "user28";
       String password= "UserUser123";

       driver.findElement(By.id("prependedInput")).sendKeys(username);
       driver.findElement(By.id("prependedInput2")).sendKeys(password);

       driver.findElement(By.id("_submit")).click();

       String actualTitle= driver.getTitle();

        Actions hoverDropdown = new Actions(driver);


        hoverDropdown.moveToElement(driver.findElement(By.linkText("#"))).perform();



        System.out.println(actualTitle);
       if(actualTitle.equals(expectedTitle)){
           System.out.println("PASS");
           driver.close();
      }else {
           System.out.println("FAILED");
           driver.quit();
       }


    }
}
