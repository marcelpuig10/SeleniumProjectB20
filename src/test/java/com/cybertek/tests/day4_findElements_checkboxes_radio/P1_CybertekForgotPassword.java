package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.tests.day3.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_CybertekForgotPassword {

    public static void main(String[] args) {
        //XPATHand CSSSelectorPRACTICESDO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        // TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
        // 1. Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // 2. Go to http://practice.cybertekschool.com/forgot_password

        driver.get("http://practice.cybertekschool.com/forgot_password");

        // 3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
        // a. “Home” link

        WebElement homeLink = driver.findElement(By.xpath(""));

        // b. “Forgot password” header

        WebElement header = driver.findElement(By.xpath("//h2[.=‘Forgot Password’]"));

        // c. “E-mail” text

        WebElement emailText = driver.findElement(By.xpath("//label[@for=‘email’]"));

        // d. E-mail input box

        WebElement emailInput = driver.findElement(By.xpath("//input[@name=‘email’]"));

        // e. “Retrieve password” button

        WebElement retrievePasswordButton = driver.findElement(By.cssSelector("button.radius"));

        // f. “Powered by Cybertek School” text 4. Verify all WebElements are displayed. Better if you do with both XPATHand CSSselector for practice purposes.


    }
}
