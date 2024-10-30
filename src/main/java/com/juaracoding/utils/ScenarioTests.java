package com.juaracoding.utils;

public enum ScenarioTests {

    //T1 - Tn

    //feature login
    T1("Successful login with valid credentials"),
    T2("Invalid login with invalid credentials"),
    //feature recruitment
    T3("Admin Add new candidate");

    private String scenarioTestName;

    ScenarioTests(String value){
        scenarioTestName = value;
    }

    public String getScenarioTestName(){
        return scenarioTestName;
    }
}
