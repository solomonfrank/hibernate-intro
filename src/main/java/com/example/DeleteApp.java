package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.util.HibernateUtil;

public class DeleteApp {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        // initialize session object
        Session session = sessionFactory.openSession();

        // fetch song to delete
        Song song = session.get(Song.class, 1);
        song.setArtistName("Burna Boy");
        session.beginTransaction();
        session.delete(song);
        session.getTransaction().commit();

    }
}
