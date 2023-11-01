package com.vega.PowerCtrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testeCucumber {

    private WebDriver driver;

    public void teste(){
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayba\\Desktop\\trabalhoTesteSistemas\\chromedriver-win64\\chromedriver.exe");

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        throw new io.cucumber.java.PendingException();
    }
}
