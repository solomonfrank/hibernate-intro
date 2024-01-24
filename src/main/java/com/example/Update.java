package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.util.HibernateUtil;

public class Update {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        // initialize session object
        Session session = sessionFactory.openSession(); // session or persistence context

        Song song = session.get(Song.class, 1); // song is at persistence state
        song.setArtistName("Burna Boy");
        session.beginTransaction();
        session.update(song); // song is at persistence state
        session.getTransaction().commit(); // song is at detached state

    }

}
