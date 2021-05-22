package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P0_FindElements_Practice {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/forgot_password");

        //WE NEED TO CREATE A LOCATOR THAT RETURNS A;; THE LINKS ON THE PAGE
        //body//a
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));//storing all of the links that
        // are returned by findElements

        for (WebElement each : listOfLinks) {

            System.out.println(each.getText());
            System.out.println(each.getAttribute("href"));

        }

        int numberOfLinks = listOfLinks.size();
        System.out.println("numbers of links = " + numberOfLinks);
    }

}
