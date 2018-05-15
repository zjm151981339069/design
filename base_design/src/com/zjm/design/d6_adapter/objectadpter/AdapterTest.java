package com.zjm.design.d6_adapter.objectadpter;

public class AdapterTest {  

    public static void main(String[] args) {  
        Source source = new Source();  
        TargetTable target = new Wrapper(source);  
        target.method1();  
        target.method2();  
    }  
}  
