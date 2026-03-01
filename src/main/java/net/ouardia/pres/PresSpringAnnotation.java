package net.ouardia.pres;

import net.ouardia.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("net.ouardia");
        IMetier metier = (IMetier)applicationContext.getBean(IMetier.class);
        System.out.println("Res="+metier.calcul());
    }
}
