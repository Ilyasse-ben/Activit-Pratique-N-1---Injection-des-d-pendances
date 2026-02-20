package org.example.Metier;

import org.example.Dao.IDao;

public class MetierImp implements IMetier{

    private IDao idao;

    /**
     * Pour injecter dans l'attribut idao
     * un objet d'une classe qui implémente l'interface IDao
     * au moment de l'instantiation
     * on préfére l'injection avec le constructeur, il est plus rapide,
     * et il est plus optimiser que les setterse
     */
    public MetierImp(IDao idao){
        this.idao=idao;
    }
    public MetierImp(){

    }

    @Override
    public double calcule() {
        double res=idao.getData();
        return res*100;
    }
    /**
     * Pour injecter dans l'attribut idao
     * un objet d'une classe qui implémente l'interface IDao
     * au moment de l'instantiation
     */
    public void setIdao(IDao idao){
        this.idao=idao;
    }
}
