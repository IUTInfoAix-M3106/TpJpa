package fr.univ_amu.iut.DAO;

import fr.univ_amu.iut.DAO.JDBC.DAOFactoryJDBC;
import fr.univ_amu.iut.DAO.JPA.DAOFactoryJPA;

public class DAOFactoryProducer {
    public static DAOFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("JPA")) {
            return new DAOFactoryJPA();
        } else if (choice.equalsIgnoreCase("JDBC")) {
            return new DAOFactoryJDBC();
        }
        return null;
    }
}