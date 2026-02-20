package org.example.Client;

import org.example.Dao.IDao;
import org.example.Metier.IMetier;

import java.io.File;
import java.util.Scanner;

public class PersDynamique {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Config.txt"));
            String daoClasseName=sc.nextLine();
            System.out.println(daoClasseName);
            Class cdao=Class.forName(daoClasseName);
            IDao dao=(IDao) cdao.newInstance();

            String metierClasseName=sc.nextLine();
            System.out.println(metierClasseName);
            Class cMetier=Class.forName(metierClasseName);
            IMetier metier=(IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);
            //IMetier metier=(IMetier) cMetier.getConstructor().newInstance();
            //Method setDao= cMetier.getDeclaredMethod("setIdao",IDao.class);
            //setDao.invoke(metier,dao);


            System.out.printf("RES : "+metier.calcule());


        }catch (Exception e){
            System.out.println("Nous avons un erruer de type : "+e.getMessage());
        }
    }
}
