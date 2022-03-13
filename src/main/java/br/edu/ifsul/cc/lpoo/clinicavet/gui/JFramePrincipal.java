/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.clinicavet.gui;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.WindowEvent;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.event.WindowListener;

/**
 *
 * @author Izolante
 */
public class JFramePrincipal extends JFrame implements WindowListener {
    
    public CardLayout cardLayout;
    public JPanel painel;
    
    public JFramePrincipal(){
        
        initComponents();
    }
    
    private void initComponents(){
    
        this.setTitle("Clinica Veterinaria");
        
        this.setMinimumSize(new Dimension(800,600));
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.addWindowListener(this);
        
        cardLayout = new CardLayout();
        
        painel = new JPanel();
        
        painel.setLayout(cardLayout);
        
        this.add(painel);
    }
    
    public void addTela(JPanel p, String nome){
        
        painel.add(p, nome);
    }
    
    public void showTela(String nome){
        
        cardLayout.show(painel, nome);
    }
    

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
