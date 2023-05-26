package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstselenium {
    public static void main(String[] args) {

        System.setProperty("webriver.chrome.driver","/Users/aliates/Desktop/Selenium Libraries/Driver/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.chrome.com/");

    }
}
