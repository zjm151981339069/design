package com.zjm.design.d2_mult_factory;

public class SendSmsFactory implements Provider{  

    @Override  
    public Sender produce() {  
        return new SmsSender();  
    }  
}  
