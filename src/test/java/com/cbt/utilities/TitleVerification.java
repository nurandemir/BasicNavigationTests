package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import javax.sql.rowset.BaseRowSet;
import java.util.*;

public class TitleVerification {
    public static void main(String[] args) {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");
        WebDriver driver= BrowserFactory.getDriver("chrome");
        String[]titles=new String[3];
        String[]cURL=new String[3];
        for(int i=0;i<urls.size();i++){
            driver.get(urls.get(i));
            titles[i]=driver.getTitle();
            cURL[i]=driver.getCurrentUrl();
        }
        StringUtility.verifyEquals(titles[0],titles[1]);
        StringUtility.verifyEquals(titles[0],titles[2]);
        StringUtility.verifyEquals(titles[1],titles[2]);


        StringUtility.verifyEquals(cURL[0].substring(0,34), "http://practice.cybertekschool.com");
        StringUtility.verifyEquals(cURL[1].substring(0,34), "http://practice.cybertekschool.com");
        StringUtility.verifyEquals(cURL[2].substring(0,34), "http://practice.cybertekschool.com");


        driver.quit();

    }
}
