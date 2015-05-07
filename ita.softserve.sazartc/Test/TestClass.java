package com.sandbox.examples;

enum InitType {PerHour, FixedRate}

public class TestClass {
    
    final static public InitType PER_HOUR = InitType.PerHour;
    final static public InitType FIXED_RATE = InitType.FixedRate;

    public void printInitTypeValue (InitType initType) {
        System.out.println(initType);
    }
    
}
