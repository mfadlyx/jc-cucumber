package com.juaracoding.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {

    @Override
    public WebDriver setStragey() {
        System.setProperty("webdriver.gecko.driver", "C:\\MyTools\\geckodriver.exe");
        return new FirefoxDriver();
    }
}
