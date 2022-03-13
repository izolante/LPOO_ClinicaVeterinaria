/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.clinicavet.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Izolante
 */
public class PersistenciaJDBC implements InterfacePersistencia{
    
    private final String DRIVER = "org.postgresql.Driver";
    
    private final String USER = "postgres";
    
    private final String SENHA = "postgres";
    
    public static final String URL = "jdbc:postgresql://localhost:5432/db_clinicavet";
    
    private Connection con = null;
    
    public PersistenciaJDBC() {

        try {

            Class.forName(DRIVER);
            System.out.println("Tentativa de conexao JDBC com : "+ URL);
            this.con = (Connection) DriverManager.getConnection(URL, USER, SENHA);

        } catch (ClassNotFoundException | SQLException e) {

            e.printStackTrace();
        }
    }

    @Override
    public Boolean conexaoAberta() {
        try {
            if (con != null) {
                return !con.isClosed();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void fecharConexao() {
        try {
            this.con.close();
            System.out.println("Conexão JDBC fechada!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object find(Class c, Object id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void persist(Object o) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Object o) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
