package com.cybertek.tests.Practicas.R_05_21;

import com.cybertek.tests.day3.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//YOUTUBE---> SEARCH FOR A SONG
public class Task_3 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://www.youtube.com");

        WebElement searchBar = driver.findElement(By.xpath("//input[@id='search']"));

        searchBar.sendKeys("Blue - One Love");
        searchBar.submit();
        WebElement clip = driver.findElement(By.cssSelector("yt-formatted-string[class = 'style-scope ytd-video-renderer']"));



    }
}
