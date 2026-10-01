package com.mark;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

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

        Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setBrand("Dell");
        l1.setModel("XPS 13");
        l1.setRam(16);


        Alien a1 = new Alien();
        a1.setAid(102);
        a1.setAname("Mark");
        a1.setTech("Python");
        a1.setLaptop(l1);







        // use only once
        SessionFactory sf = new Configuration()
                           .addAnnotatedClass(com.mark.Alien.class)
                           .addAnnotatedClass(com.mark.Laptop.class)
                           .configure()
                           .buildSessionFactory();

        // open a session
        Session session = sf.openSession();


        Transaction tx = session.beginTransaction();
//        session.persist(s1);
//        s2 = session.find(com.mark.Student.class, 3);
//        session.merge(s1);

//        s1 = session.find(com.mark.Student.class, 9);
//        session.remove(s1);

        session.persist(l1);
        session.persist(a1);

        tx.commit();
        sf.close();




        System.out.println(a1);
//        System.out.println(s2.getsName());

    }
}
