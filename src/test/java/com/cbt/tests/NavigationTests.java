package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        String pageTitle1 = driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String pageTitle2 = driver.getTitle();
        driver.navigate().back();
        String pageTitle3 = driver.getTitle();
        StringUtility.verifyEquals(pageTitle1, pageTitle3);
        driver.navigate().forward();
        String pageTitle4 = driver.getTitle();
        StringUtility.verifyEquals(pageTitle2, pageTitle4);
        driver.quit();

        System.out.println("=====");
        WebDriver driver2 = BrowserFactory.getDriver("safari");
        driver2.get("https://google.com");
        pageTitle1 = driver2.getTitle();
        driver2.navigate().to("https://etsy.com");
        pageTitle2 = driver2.getTitle();
        driver2.navigate().back();
        pageTitle3 = driver2.getTitle();
        StringUtility.verifyEquals(pageTitle1, pageTitle3);
        driver2.navigate().forward();
        pageTitle4 = driver2.getTitle();
        StringUtility.verifyEquals(pageTitle2, pageTitle4);
        driver2.quit();

        System.out.println("=====");
        driver2 = BrowserFactory.getDriver("firefox");
        driver2.get("https://google.com");
        pageTitle1 = driver2.getTitle();
        driver2.navigate().to("https://etsy.com");
        pageTitle2 = driver2.getTitle();
        driver2.navigate().back();
        pageTitle3 = driver2.getTitle();
        StringUtility.verifyEquals(pageTitle1, pageTitle3);
        driver2.navigate().forward();
        pageTitle4 = driver2.getTitle();
        StringUtility.verifyEquals(pageTitle2, pageTitle4);
        driver2.quit();

    }
}
