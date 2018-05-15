package com.zjm.design.d5_prototype;
/**
 * 对象实现 Cloneable 接口，                     super.clone()  是重点
 * @author Administrator
 *
 */
public class PrototypeJava implements Cloneable {  

    public Object clone() throws CloneNotSupportedException {  
    	PrototypeJava proto = (PrototypeJava) super.clone();  
        return proto;  
    }  
}  
