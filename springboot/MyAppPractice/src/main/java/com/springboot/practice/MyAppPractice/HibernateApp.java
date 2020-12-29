package com.springboot.practice.MyAppPractice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * created by ANEK on Tuesday 5/12/2020 at 5:30 AM
 */

public class HibernateApp {
    public static void main(String... args){

        SessionFactory sessionFactory = new Configuration().buildSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();
        System.out.println("in open session ");

        session.getTransaction().commit();
        session.close();

        

    }
}
