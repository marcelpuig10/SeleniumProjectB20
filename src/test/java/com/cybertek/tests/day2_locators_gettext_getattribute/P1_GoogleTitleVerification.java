package com.cybertek.tests.day2_locators_gettext_getattribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_GoogleTitleVerification {

    public static void main(String[] args) {

        //TC #1: Google Title Verification
        //1. Open Chrome Browser
            //set up browser driver
        WebDriverManager.chromedriver().setup();

            //open a chrome browser
        WebDriver driver = new ChromeDriver();

        //2. Go to https://www.google.com

        driver.get("https://www.google.com");

        //3. Verify title:

        //en este test el objetivo es verificar que estamos llegando a la pagina de www.google.com

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!");
        }








    }
}
