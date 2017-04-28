package com.ua.osmachko.simpleprogramm;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


/**
 * Created by Valerii_Osmachko on 4/27/2017.
 */
public class HibernateUtilities {

    private static SessionFactory sessionFactory = buildSessionFactory();
    //private static StandardServiceRegistry serviceRegistry;


  /* static {
       try {
           Configuration configuration = new Configuration().configure();
             *//*serviceRegistry = new StandardServiceRegistryBuilder()
                   .applySettings(configuration.getProperties()).build();
             sessionFactory =configuration.buildSessionFactory(serviceRegistry);*//*
             serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
                                                                .build();
           Metadata metadata = new MetadataSources(serviceRegistry)
                   .getMetadataBuilder().build();
           sessionFactory = metadata.getSessionFactoryBuilder().build();
       } catch (HibernateException exception) {
           System.out.println("Problem creating session factory!");
       }
   }*/

    private static SessionFactory buildSessionFactory() {
        try {
            StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                    .configure("hibernate.cfg.xml").build();
            Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();
            return metadata.getSessionFactoryBuilder().build();
        } catch (HibernateException he) {
            System.out.println("Session Factory creation failure");
            throw he;
        }
    }


   public static SessionFactory getSessionFactory() {
       return sessionFactory;
   }


}
