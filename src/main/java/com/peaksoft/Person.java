package com.peaksoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Person {


    @Autowired
    @Qualifier("cat")
    private Pet pet;
    @Value("Umutai")
    private String name;
    @Value("18")
    private int age;

    public void  pet(){
    }

    public Person(Pet pet) {
        this.pet = pet;
    }
    public void callYouPet(){
        pet.voice();
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pet=" + pet +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
