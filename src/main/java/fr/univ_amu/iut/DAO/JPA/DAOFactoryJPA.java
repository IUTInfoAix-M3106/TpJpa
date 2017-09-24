package fr.univ_amu.iut.DAO.JPA;

import fr.univ_amu.iut.DAO.DAOEtudiant;
import fr.univ_amu.iut.DAO.DAOFactory;
import fr.univ_amu.iut.DAO.DAOModule;
import fr.univ_amu.iut.DAO.DAOProf;

public class DAOFactoryJPA implements DAOFactory {
    @Override
    public DAOEtudiant createDAOEtudiant() {
        return new DAOEtudiantJPA();
    }

    @Override
    public DAOProf createDAOProf() {
        return null;
    }

    @Override
    public DAOModule createDAOModule() {
        return null;
    }
}
