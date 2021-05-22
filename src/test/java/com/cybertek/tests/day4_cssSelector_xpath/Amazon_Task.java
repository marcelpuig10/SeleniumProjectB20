package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazon_Task {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");

        WebElement amazonSearchBar = driver.findElement(By.cssSelector("input{id='twotabsearchtextbox"));
        amazonSearchBar.sendKeys("Java programming"+ Keys.ENTER);

        String expectedTitle = "Amazon.com : Java programming";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification Passed!");
        }else {
            System.out.println("Title verification Failed!");
        }

        Thread.sleep(5000);
        driver.close();

    }
}
