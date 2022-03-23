package com.bank;

import com.bank.databases.user;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



public class DataBaseSave  {
    private SessionFactory sessionFactory;

    public DataBaseSave() {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

        Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
        sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
    }

    public Integer saveUser(user user){
        Session session = null;
        Integer id = null;
        try {

            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            id =(Integer) session.save(user);
            transaction.commit();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return  id;
    }


}
