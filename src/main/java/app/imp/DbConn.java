/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.imp;

import app.io.DAO;
import app.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Carlos
 */
public class DbConn implements DAO{
    
    Session session;
    
    public void openConnection() {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        session = sessionFactory.openSession();
    }

    public void closeConnection() {
        if (session != null) {
            session.close();
        }
    }
    
}
