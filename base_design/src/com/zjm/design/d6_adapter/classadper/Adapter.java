package com.zjm.design.d6_adapter.classadper;
// 适配器类继承原类，同时实现接口新增的功能
public class Adapter extends Source implements TargetTable {  
    @Override  
    public void method2() {  
        System.out.println("method 2");  
    }  
}  
