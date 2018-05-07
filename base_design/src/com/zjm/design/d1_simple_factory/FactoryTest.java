package com.zjm.design.d1_simple_factory;

public class FactoryTest {  

    public static void main(String[] args) {  
        SendFactory factory = new SendFactory();  
        Sender sender = factory.produce("sms");  
        sender.send();  
    }  
}  
