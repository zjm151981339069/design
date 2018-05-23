package com.zjm.design.d16_iterator;

public class Test {  

    public static void main(String[] args) {  
        CollectionTest collection = new ListCollection();  
        ItratorTest it = collection.iterator();  
          
        while(it.hasNext()){  
            System.out.println(it.next());  
        }  
    }  
}  
