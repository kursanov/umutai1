package com.peaksoft;

import com.peaksoft.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);


        Person person = context.getBean("Person", Person.class);
        person.callYouPet();
        System.out.println(person);

        context.close();



    }
}
