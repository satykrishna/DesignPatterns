package com.oops.example;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestFactoryRun {
    
    
    public static void main(String[] args) {
        
        Result result = JUnitCore.runClasses(TestFactoryPattern.class);
        
        for(Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        
        System.out.println(result.wasSuccessful());
    }

}
