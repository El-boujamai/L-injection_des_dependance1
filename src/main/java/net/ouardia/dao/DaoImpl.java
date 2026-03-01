package net.ouardia.dao;

import org.springframework.stereotype.Component;

@Component("d")
public class DaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("vrsion base de donnees");
        double t= 34;
        return 0;
    }
}
