package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_WebOrdersLogin {
    public static void main(String[] args) {

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
        }

        WebElement inputUsername = driver.findElement(By.id("ctl00_MainContent_username"));
        inputUsername.sendKeys("Tester");

        WebElement inputPassword = driver.findElement(By.id("ct100_MainContent_password"));
        inputPassword.sendKeys("test" + Keys.ENTER);

        WebElement loginButton = driver.findElement(By.id("ct100_MainContent_login_button"));
        loginButton.click();

        String expectedHomePageTitle = "Web Orders";
        String actualHomePageTitle = driver.getTitle();

        if(actualHomePageTitle.equals(expectedHomePageTitle)) {
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
        }
    }
}
