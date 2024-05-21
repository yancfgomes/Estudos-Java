package main;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import ui.InterfaceAdministrador;
import ui.InterfaceBibliotecario;
import ui.InterfaceMembroBiblioteca;
import logic.Biblioteca;

public class UpdateMenu extends JPanel {
    private BufferedImage backgroundImage;

    public UpdateMenu() {
        Biblioteca biblioteca = new Biblioteca();

        // Carrega a imagem de fundo
        try {
            backgroundImage = ImageIO.read(new File("C:\\Users\\Trocados\\codigoJava\\AtividadeTela\\src\\main\\background.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

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
                int option = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
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

        // Adiciona os menus à barra de menu
        barramenu.add(fileMenu);
        barramenu.add(aboutMenu);

        // Adiciona os itens de menu ao menu
        fileMenu.add(bibliotecario);
        fileMenu.add(membro);
        fileMenu.add(administrador);
        fileMenu.addSeparator(); // Adiciona uma linha separadora
        fileMenu.add(sair);

        // Define a barra de menu para este painel
        setLayout(new BorderLayout());
        add(barramenu, BorderLayout.NORTH);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sistema Bibliotecário");
        UpdateMenu panel = new UpdateMenu();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500, 800);
        frame.add(panel);
        frame.setVisible(true);
    }
}
