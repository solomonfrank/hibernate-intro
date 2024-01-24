package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.util.HibernateUtil;

public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        // initialize session object
        Session session = sessionFactory.openSession();
        Song song = new Song(); // transient state

        song.setId(1);
        song.setArtistName("Davido");
        song.setTitle("If");
        session.beginTransaction();
        session.save(song);
        session.getTransaction().commit();
        session.close();

        System.out.println("Saved");

    }
}