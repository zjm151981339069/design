package com.zjm.design.d17_ChainofResponsibility;

public abstract class AbstractHandler {  
      
    private Handler handler;  

    public Handler getHandler() {  
        return handler;  
    }  

    public void setHandler(Handler handler) {  
        this.handler = handler;  
    }  
      
}  
