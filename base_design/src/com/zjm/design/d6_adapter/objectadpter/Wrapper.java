package com.zjm.design.d6_adapter.objectadpter;

public class Wrapper implements TargetTable {  

    private Source source;  
      
    public Wrapper(Source source){  
        super();  
        this.source = source;  
    }  
    @Override  
    public void method2() {  
        System.out.println("this is the targetable method!");  
    }  

    @Override  
    public void method1() {  
        source.method1();  
    }  
}  
