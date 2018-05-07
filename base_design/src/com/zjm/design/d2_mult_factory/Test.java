package com.zjm.design.d2_mult_factory;

public class Test {  

    public static void main(String[] args) {  
        Provider provider = new SendMailFactory();  
        Sender sender = provider.produce();  
        sender.send();  
    }  
}  
