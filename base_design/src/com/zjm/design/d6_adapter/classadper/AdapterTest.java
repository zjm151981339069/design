package com.zjm.design.d6_adapter.classadper;

public class AdapterTest {  

    public static void main(String[] args) {  
        TargetTable target = new Adapter();  
        target.method1();  
        target.method2();  
    }  
}  
