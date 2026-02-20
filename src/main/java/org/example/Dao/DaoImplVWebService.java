package org.example.Dao;

public class DaoImplVWebService implements IDao{
    @Override
    public double getData() {
        System.out.println("============== version web service =================");
        return 50;
    }
}
