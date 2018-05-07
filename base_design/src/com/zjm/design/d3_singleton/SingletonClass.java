package com.zjm.design.d3_singleton;

public class SingletonClass {  

    /* 私有构造方法，防止被实例化 */  
    private SingletonClass() {  
    }  

    /* 此处使用一个内部类来维护单例 */  
    private static class SingletonClassFactory {  
        private static SingletonClass instance = new SingletonClass();  
    }  

    /* 获取实例 */  
    public static SingletonClass getInstance() {  
        return SingletonClassFactory.instance;  
    }  

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
    public Object readResolve() {  
        return getInstance();  
    }  
}  
