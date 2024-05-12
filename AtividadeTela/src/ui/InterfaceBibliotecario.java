package ui;

import logic.Biblioteca;
import logic.Livro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceBibliotecario extends JFrame implements ActionListener {
private Biblioteca biblioteca;

    private JTextField txtTitulo, txtAutor, txtAno;
    private JButton btnAdicionar;

    public InterfaceBibliotecario(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;

        setTitle("Interface do Bibliotecário");
        setSize(400, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel lblTitulo = new JLabel("Título:");
        lblTitulo.setBounds(20, 20, 80, 20);
        add(lblTitulo);

        txtTitulo = new JTextField();
        txtTitulo.setBounds(100, 20, 200, 20);
        add(txtTitulo);

        JLabel lblAutor = new JLabel("Autor:");
        lblAutor.setBounds(20, 50, 80, 20);
        add(lblAutor);

        txtAutor = new JTextField();
        txtAutor.setBounds(100, 50, 200, 20);
        add(txtAutor);

        JLabel lblAno = new JLabel("Ano de Publicação:");
        lblAno.setBounds(20, 80, 150, 20);
        add(lblAno);

        txtAno = new JTextField();
        txtAno.setBounds(150, 80, 150, 20);
        add(txtAno);

        btnAdicionar = new JButton("Adicionar Livro");
        btnAdicionar.setBounds(20, 120, 150, 30);
        btnAdicionar.addActionListener(this);
        add(btnAdicionar);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAdicionar) {
            String titulo = txtTitulo.getText();
            String autor = txtAutor.getText();
            int ano = Integer.parseInt(txtAno.getText());
            Livro livro = new Livro(titulo, autor, ano);
            biblioteca.adicionarLivro(livro);
            JOptionPane.showMessageDialog(this, "Livro adicionado com sucesso!");
            limparCampos();
        }
    }

    private void limparCampos() {
        txtTitulo.setText("");
        txtAutor.setText("");
        txtAno.setText("");
    }}
