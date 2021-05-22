package com.cybertek.tests.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F4_AttributeValueVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        WebElement createPageLink = driver.findElement(By.linkText("Create a Page"));

        String expectedInHref = "registration_form";
        String actualHrefValue = createPageLink.getAttribute("href");

        System.out.println("actual Href value= " + actualHrefValue);

        if(actualHrefValue.contains(expectedInHref)){
            System.out.println("HREF VALUE VERIFICATION PASSED");
        }else{
            System.out.println("HREF VALUE VERIFICATION FAILED");
        }
    }
}
