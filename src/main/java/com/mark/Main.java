package com.mark;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main() {

//    Student s1 = new Student();
//    s1.setsName("Busseng");
//    s1.setRollNo(10);
//    s1.setsAge(27);

//    Student s2 =null;


//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(com.mark.Student.class);
//        cfg.configure();

//        Laptop l1 = new Laptop();
//        l1.setLid(1);
//        l1.setBrand("Dell");
//        l1.setModel("XPS 13");
//        l1.setRam(16);
//
//
//        Laptop l2 = new Laptop();
//        l2.setLid(2);
//        l2.setBrand("Apple");
//        l2.setModel("MacBook Pro");
//        l2.setRam(32);
//
//        Laptop l3 = new Laptop();
//        l3.setLid(3);
//        l3.setBrand("HP");
//        l3.setModel("Spectre x360");
//        l3.setRam(16);

//        Alien a1 = new Alien();
//        a1.setAid(102);
//        a1.setAname("Mark");
//        a1.setTech("Python");
//
//
//        Alien a2 = new Alien();
//        a2.setAid(103);
//        a2.setAname("John");
//        a2.setTech("Java");
//
//
//
//        a1.setLaptops(Arrays.asList(l1, l2));
//        a2.setLaptops(Arrays.asList(l3));
//
//
//




        // use only once
        SessionFactory sf = new Configuration()
                           .addAnnotatedClass(com.mark.Alien.class)
                           .addAnnotatedClass(com.mark.Laptop.class)
                           .configure()
                           .buildSessionFactory();

        // open a session
        Session session = sf.openSession();


//        Transaction tx = session.beginTransaction();
//        session.persist(s1);
//        s2 = session.find(com.mark.Student.class, 3);
//        session.merge(s1);

//        s1 = session.find(com.mark.Student.class, 9);
//        session.remove(s1);
//
//        session.persist(l1);
//        session.persist(l2);
//        session.persist(l3);

//
//        session.persist(a1);
//        session.persist(a2);
//
//
//
//
//        Alien a5 = session.find(Alien.class, 101);
//       System.out.println(a5);
//
//        session.close();
//
//
//        Session session1 = sf.openSession();
//
//
//        Alien a6 = session1.find(Alien.class, 102);
//        System.out.println(a6);

        Query<Laptop> query = session.createQuery("from Laptop", Laptop.class);

//        List<Laptop> laptops = query.getResultList();

//        List<Laptop> laptops1 = session.createQuery("from Laptop where ram > 16", Laptop.class).getResultList();

//        for (Laptop laptop : laptops) {
//            System.out.println(laptop);
//
//        }

//        for (Laptop laptop : laptops1) {
//            System.out.println(laptop);
//        }


//        String brand = "Apple";
//        List<Laptop> laptops2 = session.createQuery("from Laptop where brand = :brand", Laptop.class)
//                .setParameter("brand", brand)
//                .getResultList();
//
//        for (Laptop laptop : laptops2) {
//            System.out.println(laptop);
//        }

//        Laptop lappy = session.find(Laptop.class, 1);
//        System.out.println(lappy);

       session.close();


        Session session1 = sf.openSession();
        Laptop lappy1 = session1.find(Laptop.class, 1);
        System.out.println(lappy1);
        session1.close();


        Session session2 = sf.openSession();
        Laptop lappy2 = session2.find(Laptop.class, 1);
        System.out.println(lappy2);
        session2.close();

        sf.close();


//        System.out.println(s2.getsName());

    }
}
