package com.cybertek.tests.Practicas.R_05_21;

import com.cybertek.tests.day3.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//AMAZON----> SEARCH FOR WOODEN SPOON
public class Task_2 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://amazon.com");

        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("wooden spoon" + Keys.ENTER);

        String actualTitle = driver.getTitle();
        String expectedTitle = "wooden spoon";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }





    }
}
