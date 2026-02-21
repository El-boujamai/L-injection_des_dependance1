package net.ouardia.pres;

import net.ouardia.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXML {
    public static void main(String[] args) {
            ApplicationContext springcontext = new ClassPathXmlApplicationContext("config.xml");
             IMetier metier = (IMetier)springcontext.getBean("metier");
           System.out.println("Res="+metier.calcul());

    }
}
