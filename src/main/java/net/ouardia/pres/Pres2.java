package net.ouardia.pres;

import net.ouardia.dao.IDao;
import net.ouardia.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws FileNotFoundException, InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner( new File("Config.txt"));
        String daoClassName = scanner.nextLine();
        Class cdao = Class.forName(daoClassName);
        IDao dao = (IDao)cdao.newInstance();

        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier)cdao.getConstructor(IDao.class).newInstance(dao);





    }
}
