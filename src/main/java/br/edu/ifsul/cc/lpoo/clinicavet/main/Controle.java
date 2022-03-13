/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.clinicavet.main;

import br.edu.ifsul.cc.lpoo.clinicavet.autenticacao.JPanelAutenticacao;
import br.edu.ifsul.cc.lpoo.clinicavet.model.dao.PersistenciaJDBC;
import br.edu.ifsul.cc.lpoo.clinicavet.gui.JFramePrincipal;
import br.edu.ifsul.cc.lpoo.clinicavet.gui.JMenuBarHome;
import br.edu.ifsul.cc.lpoo.clinicavet.gui.JPanelHome;

/**
 *
 * @author Izolante
 */
public class Controle {
    
    private PersistenciaJDBC conexaoJDBC;
    
    private JFramePrincipal frame;
    
    private JPanelAutenticacao painelAutenticacao;
    
    private JMenuBarHome menuBar;
    
    private JPanelHome painelHome;
    
}
