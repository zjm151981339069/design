package com.zjm.design.d1_simple_factory;

public class MultSendFactory {
	 public Sender produceMail(){  

         return new MailSender();  
     }  
       
     public Sender produceSms(){  
         return new SmsSender();  
     }  
}
