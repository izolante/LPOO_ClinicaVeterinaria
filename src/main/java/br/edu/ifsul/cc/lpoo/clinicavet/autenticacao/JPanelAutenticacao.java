/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.clinicavet.autenticacao;

import br.edu.ifsul.cc.lpoo.clinicavet.main.Controle;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author Izolante
 */
public class JPanelAutenticacao extends JPanel implements ActionListener{

    private Controle controle;
    
    private GridBagLayout gridLayout;
    
    private GridBagConstraints posicionador;
    
    private JLabel labelUsuario;
    
    private JLabel labelSenha;
    
    private JTextField textUsuario;
    
    private JPasswordField textSenha;
    
    private JButton buttonLogin;
    
    private Border border;
    
    public JPanelAutenticacao(Controle controle){
        
        this.controle = controle;
        initComponents();
    }

    private void initComponents() {
        
        gridLayout = new GridBagLayout();
        this.setLayout(gridLayout);
        
        labelUsuario = new JLabel("Usuario:");        
        labelUsuario.setToolTipText("labelUsuario");
        posicionador = new GridBagConstraints();
        posicionador.gridy = 0;
        posicionador.gridx = 0;
        this.add(labelUsuario, posicionador);
        
        textUsuario = new JTextField(10);
        textUsuario.setFocusable(true);
        textUsuario.setToolTipText("textUsuario");
        posicionador = new GridBagConstraints();
        posicionador.gridy = 0;
        posicionador.gridx = 1;
        border = textUsuario.getBorder();
        this.add(textUsuario, posicionador);
        
        labelSenha = new JLabel("Senha:");        
        labelSenha.setToolTipText("labelSenha");
        posicionador = new GridBagConstraints();
        posicionador.gridy = 1;
        posicionador.gridx = 0;
        this.add(labelSenha, posicionador);
        
        textSenha = new JPasswordField(10);
        textSenha.setFocusable(true);
        textSenha.setToolTipText("textSenha");
        posicionador = new GridBagConstraints();
        posicionador.gridy = 1;
        posicionador.gridx = 1;
        this.add(textSenha, posicionador);

        buttonLogin = new JButton("Logar");
        buttonLogin.setFocusable(true);
        buttonLogin.setToolTipText("buttonLogin");
        posicionador = new GridBagConstraints();
        posicionador.gridy = 2;
        posicionador.gridx = 1;
        buttonLogin.addActionListener(this);
        buttonLogin.setActionCommand("autenticar");
        this.add(buttonLogin, posicionador);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
