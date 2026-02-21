package net.ouardia.pres;

import net.ouardia.dao.DaoImpl;
import net.ouardia.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();
       MetierImpl metier = new MetierImpl(d);
       System.out.println("Res = "+ metier.calcul());
    }
}
