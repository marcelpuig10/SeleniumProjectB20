package com.cybertek.tests.day5;


import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setUpClass(){ System.out.println("Before class is running..."); }

    @AfterClass
    public void afterClass(){ System.out.println("After class is running..."); }

    @BeforeMethod
    public void setUpMethod(){ System.out.println("Before method is running..."); }

    @Test
    public void test1() { System.out.println("Test1 is running..."); }

    @Test
    public void test2(){ System.out.println("Test2 is running..."); }

    @AfterMethod
    public void after(){ System.out.println("After method is running..."); }

    @Test
    public void test3() {

        String str1 = "TestNG";
        String str2 = "TestNG";
        String str3 = "ajakjsjd";

        Assert.assertTrue(str1.equals(str2));

        Assert.assertTrue(str1.equals(str3) , "Str1 is not equal to Str3.");

        System.out.println("JUst checking if this line will run????? ");

        Assert.assertEquals(str1, str2, "Failure message just in case str1 is not equals to str2");


    }

}
