package net.ouardia.dao;

public class DaoImpl implements IDao{

    @Override
    public double getData() {
        Systeme.out.println("vrsion base de donnees");
        double t= 34;
        return 0;
    }
}
