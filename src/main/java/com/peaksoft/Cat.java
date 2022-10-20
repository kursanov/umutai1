package com.peaksoft;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet{
    public void voice() {
        System.out.println("Meau Meau");
    }
}
