package com.peaksoft;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet{

    public void voice() {
        System.out.println("Vov Vov");
    }
    public  void init() {
        System.out.println("init method");
    }
    public void destroy(){
        System.out.println("destroy Method");
    }
}
