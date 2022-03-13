 
package br.edu.ifsul.cc.lpoo.clinicavet.model.dao;

/**
 *
 * @author Izolante
 */
public interface InterfacePersistencia {
            
    public Boolean conexaoAberta();
    
    public void fecharConexao();
    
    public Object find(Class c, Object id) throws Exception;
    
    public void persist(Object o) throws Exception;
    
    public void remover(Object o) throws Exception;
        
}
