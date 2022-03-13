 
package br.edu.ifsul.cc.lpoo.clinicavet.model.dao;

import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Izolante
 */
public class PersistenciaJPA implements InterfacePersistencia {
    
    public EntityManagerFactory factory;
    public EntityManager entity;
    
    public PersistenciaJPA(){

        factory = Persistence.createEntityManagerFactory("pu_db_clinicavet");
        entity = factory.createEntityManager();
    }


    @Override
    public Boolean conexaoAberta() {
        
        return entity.isOpen();   
    }

    @Override
    public void fecharConexao() {
        
        entity.close();        
    }
    
    @Override
    public Object find(Class c, Object id) throws Exception {
        
        return entity.find(c, id);       
    }

    @Override
    public void persist(Object o) throws Exception {
        
        entity.getTransaction().begin();
        entity.persist(o);
        entity.getTransaction().commit();
        
    }

    @Override
    public void remover(Object o) throws Exception {
        
        entity.getTransaction().begin();
        entity.remove(o);
        entity.getTransaction().commit();
        
    }
   
}
