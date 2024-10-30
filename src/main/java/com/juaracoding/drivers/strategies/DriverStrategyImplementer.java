package com.juaracoding.drivers.strategies;

import com.juaracoding.utils.Contants;

public class DriverStrategyImplementer {

    public static DriverStrategy chooseStrategy(String strategy){
        switch (strategy){
            case Contants.CHROME:
                return new Chrome();
            case Contants.FIREFOX:
                return new Firefox();
            default:
                return null;
        }
    }
}
