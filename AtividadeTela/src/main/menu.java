package main;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import logic.Biblioteca;
import ui.InterfaceBibliotecario;
import ui.InterfaceMembroBiblioteca;
import ui.InterfaceAdministrador;


public class Menu {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		
	// Criação da janela
        JFrame frame = new JFrame("Sistema Bibliotecário");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
       
     // Criação da barra de menu
        JMenuBar barramenu = new JMenuBar();
      
     // Criação dos menus
        JMenu fileMenu = new JMenu("Menu");
        JMenu aboutMenu = new JMenu("Sobre");        
        
     // Criação dos itens de menu para o menu 
        JMenuItem bibliotecario = new JMenuItem("Bibliotecário");
        JMenuItem membro = new JMenuItem("Membro");
        JMenuItem administrador = new JMenuItem("Administrador");
        JMenuItem sair = new JMenuItem("Sair");
        
     // Adiciona um ouvinte de ação ao item "Sair"
        sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Exibe uma caixa de diálogo de confirmação ao clicar em "Sair"
                int option = JOptionPane.showConfirmDialog(frame, "Deseja sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    System.exit(0); // Sai do programa
                }
            }
        }); 
        // ações ao clicar no menuitem bibliotecario
        bibliotecario.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				InterfaceBibliotecario interfaceBibliotecario = new InterfaceBibliotecario(biblioteca);
				interfaceBibliotecario.setVisible(true);
			}
		}); 
        // ações ao clicar no menuitem membro
        membro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				InterfaceMembroBiblioteca interfaceMembroBiblioteca = new InterfaceMembroBiblioteca(biblioteca);
				interfaceMembroBiblioteca.setVisible(true);
				
			}
		});
        // ações ao clicar no menuitem Administrador
        administrador.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				InterfaceAdministrador interfaceAdministrador = new InterfaceAdministrador(biblioteca);
				interfaceAdministrador.setVisible(true);	
			}
		});
     
         
     // Define a janela como visível
        frame.setVisible(true);
     
    // Define a barra de menu para a janela
        frame.setJMenuBar(barramenu); 
        
        
     // Adiciona os menus à barra de menu
        barramenu.add(fileMenu);
        barramenu.add(aboutMenu);
        
     // Adiciona os itens de menu ao menu 
        fileMenu.add(bibliotecario);
        fileMenu.add(membro);
        fileMenu.add(administrador);
        fileMenu.addSeparator(); // Adiciona uma linha separadora
        fileMenu.add(sair);
        
     
       
        
      
        
        
	}

}
