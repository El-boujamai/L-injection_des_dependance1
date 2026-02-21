package net.ouardia.pres;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        Scanner scanner = new Scanner( new File("config.txt"));
        String daoClassName = scanner.nextLine();
        Class cdao = Class.forName(daoClassName);





    }
}
