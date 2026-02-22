package org.example.Client;

import org.example.Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersSpringNotation {
    public static void main(String[] args){
        ApplicationContext springContext=new AnnotationConfigApplicationContext("org.example");
        IMetier metier= springContext.getBean(IMetier.class);
        System.out.println("RES : "+metier.calcule());
    }
}
