package logic;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.stream.Collectors;

public class AcervoDeLivros extends JFrame {
    private List<String[]> livros;
    private DefaultTableModel tableModel;

    public AcervoDeLivros(List<String[]> livros) {
        this.livros = livros;
        setTitle("Acervo de Livros");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setLayout(new BorderLayout());

        // Create search panel
        JPanel searchPanel = new JPanel();
        searchPanel.setLayout(new FlowLayout());

        JLabel searchLabel = new JLabel("Buscar Livro:");
        JTextField searchField = new JTextField(20);
        JButton searchButton = new JButton("Buscar");

        searchPanel.add(searchLabel);
        searchPanel.add(searchField);
        searchPanel.add(searchButton);

        add(searchPanel, BorderLayout.NORTH);

        // Create table
        String[] columnNames = {"ID", "Título", "Autor", "Ano", "Status"};
        tableModel = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        // Populate table with all books
        populateTable(livros);

        // Add action listener for search button
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchText = searchField.getText().trim().toLowerCase();
                List<String[]> filteredBooks = livros.stream()
                    .filter(book -> book[1].toLowerCase().contains(searchText))
                    .collect(Collectors.toList());
                populateTable(filteredBooks);
            }
        });
    }

    private void populateTable(List<String[]> livros) {
        tableModel.setRowCount(0); // Clear existing rows
        for (String[] livro : livros) {
            tableModel.addRow(livro);
        }
    }
}
