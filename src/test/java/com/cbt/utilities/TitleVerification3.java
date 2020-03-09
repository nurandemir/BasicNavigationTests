package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.*;

public class TitleVerification3 {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://lulugandgeorgia.com",
                "https://wayfair.com/",
                "https://walmart.com/",
                "https://westelm.com/");
        WebDriver driver;
        String[]titles=new String[4];
        String[]cURL=new String[4];

        for(int i=0;i<urls.size();i++){
            driver= BrowserFactory.getDriver("chrome");
            driver.get(urls.get(i));
            titles[i]=driver.getTitle();
            titles[i]=titles[i].replace(" ", "").toLowerCase();
            cURL[i]=driver.getCurrentUrl();
            if (cURL[i].contains(titles[i])) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
            System.out.println(cURL[i]+" "+titles[i]);
            driver.quit();
        }

    }
}
