package ui;

import logic.Biblioteca;
import logic.Livro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceAdministrador extends JFrame implements ActionListener {
private Biblioteca biblioteca;

    private JButton btnMostrar;

    public InterfaceAdministrador(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;

        setTitle("Interface do Administrador");
        setSize(400, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);

        btnMostrar = new JButton("Mostrar Livros");
        btnMostrar.setBounds(20, 50, 150, 30);
        btnMostrar.addActionListener(this);
        add(btnMostrar);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnMostrar) {
            StringBuilder livrosStr = new StringBuilder("Livros na biblioteca:\n");
            for (Livro livro : biblioteca.getLivros()) {
                livrosStr.append("Título: ").append(livro.getTitulo()).append(", Autor: ").append(livro.getAutor()).append(", Ano: ").append(livro.getAnoPublicacao()).append("\n");
            }
            JOptionPane.showMessageDialog(this, livrosStr.toString());
        }
    }}
