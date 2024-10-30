package com.juaracoding.drivers;

import com.juaracoding.drivers.strategies.DriverStrategy;
import com.juaracoding.drivers.strategies.DriverStrategyImplementer;
import com.juaracoding.utils.Contants;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DriverSingleton {

        private static DriverSingleton instance = null;
        private static WebDriver driver;

        private DriverSingleton(String driver){
            instantiate(driver);
        }

        public WebDriver instantiate(String strategy){
            DriverStrategy driverStrategy = DriverStrategyImplementer.chooseStrategy(strategy);
            driver = driverStrategy.setStragey();
            driver.manage().timeouts().implicitlyWait(Contants.TIMEOUT, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            return driver;
        }

        public static DriverSingleton getInstance(String driver){
            if (instance == null){
                instance = new DriverSingleton(driver);
            }
            return instance;
        }

        public static WebDriver getDriver(){
            return driver;
        }

       public static void closeObjectInstance(){
            instance = null;
            driver.quit();
       }
}
