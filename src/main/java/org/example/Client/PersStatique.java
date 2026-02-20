package org.example.Client;

import org.example.Dao.DaoImplVWebService;
import org.example.Dao.IDao;
import org.example.Metier.IMetier;
import org.example.Dao.DaoImpl;
import org.example.Metier.MetierImp;

public class PersStatique {
    public static void main(String[] args){
        // first implimentation with data base
        IDao idao=new DaoImpl();
        IMetier metier=new MetierImp(idao);
        System.out.println("RESULTA : "+metier.calcule());

        // seacend implementation with xeb service
        IDao idaoWebService=new DaoImplVWebService();
        IMetier metierWebService=new MetierImp(idao);
        System.out.println("RESULTA : "+metierWebService.calcule());



    }
}
