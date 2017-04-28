package com.ua.osmachko.main;

import com.ua.osmachko.entity.User;
import com.ua.osmachko.entity.UserHistory;
import com.ua.osmachko.simpleprogramm.HibernateUtilities;
import org.hibernate.Session;

import java.util.Date;
import java.util.Map;

/**
 * Created by Valerii_Osmachko on 4/28/2017.
 */
public class Program {

    public static void main(String[] args) {
        Session session = HibernateUtilities.getSessionFactory().openSession();
        session.beginTransaction();

        User user = new User();
        user.setName("Joe");
        user.getHistory().add(new UserHistory(new Date(),"Set name to Joe"));
        user.getProteinData().setGoal(250);
        user.getHistory().add(new UserHistory(new Date(),"Set the goal to 250"));
        user.getListHistory().add(new UserHistory(new Date(),"Set name to Leo"));
        user.getListHistory().add(new UserHistory(new Date(),"Set goal to 300"));
        user.getMapHistory().put("GL123", new UserHistory(new Date(),"Set name to Brad"));
        user.getMapHistory().put("GL124", new UserHistory(new Date(),"Set goal to 350"));
        user.getCollectionHistory().add(new UserHistory(new Date(),"Set goal to 350"));
        user.getCollectionHistory().add(new UserHistory(new Date(),"Set name to Brad"));
        user.addHistory(new UserHistory(new Date(),"Set goal to 350"));
        user.addHistory(new UserHistory(new Date(),"Set goal to 400"));
        session.save(user);
        session.getTransaction().commit();

        session.beginTransaction();
        User loadedUser = session.get(User.class, 1);
        System.out.println(loadedUser.getName());
        System.out.println(loadedUser.getProteinData().getGoal());
        for (UserHistory history : loadedUser.getHistory()) {
            System.out.println(history.getEntryTime().toString() + " " + history.getEntry());
        }
        for (Map.Entry<String, UserHistory> history : loadedUser.getMapHistory().entrySet()) {
            System.out.println(history.getValue().getEntryTime().toString() + " " + history.getKey());
        }
        session.getTransaction().commit();
        HibernateUtilities.getSessionFactory().close();
    }
}
