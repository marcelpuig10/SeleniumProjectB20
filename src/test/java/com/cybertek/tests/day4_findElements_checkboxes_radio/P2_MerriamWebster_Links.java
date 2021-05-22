package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.tests.day3.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P2_MerriamWebster_Links {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.merriam-webster.com/");

        //driver.get("https://www.merriam-webster.com");

        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));



        //List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));

        int linksWithoutText = 0;
        int linksWithText = 0;

        for (WebElement eachLink : listOfLinks){
            String textOfEachLink = eachLink.getText();

            System.out.println(eachLink.getText());

            if (textOfEachLink.isEmpty()) {
                linksWithoutText++;
            }else{
                linksWithText++;
            }
        }

        System.out.println("the number of links "+ linksWithoutText);

        System.out.println("the number of links that has text = "+ linksWithText);

        System.out.println("the number of total links on this page "+ listOfLinks);



    }
}
