package net.ouardia.ext;

import net.ouardia.dao.IDao;

public class DaoImplv2 implements IDao {

    @Override
    public double getData() {
        System.out.println("vrsion capteurs ....");
        double t = 12;
        return t;
    }
}
