import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; // Importe a classe ActionListener
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela_Veiculo implements ActionListener {
    Veiculo vei;
    ArrayList<Veiculo> list = new ArrayList<Veiculo>();

    JFrame tela = new JFrame();
    JPanel painel = new JPanel();

    JLabel lbmodelo = new JLabel("Modelo: ");
    JLabel lbano = new JLabel("Ano: ");
    JLabel lbvalor = new JLabel("Valor: ");

    JTextField txtmodelo = new JTextField();
    JTextField txtano = new JTextField();
    JTextField txtvalor = new JTextField();

    JButton btsalvar = new JButton("Salvar");
    JButton btalterar = new JButton("Alterar");
    JButton btlistar = new JButton("Listar");
    JButton btexcluir = new JButton("Excluir");

    void criarTela() {
        tela.setSize(400, 300); // tamanho
        tela.setLocation(250, 250); // localização
        painel.setLayout(null);

        lbmodelo.setBounds(10, 10, 100, 30);
        txtmodelo.setBounds(110, 10, 100, 30);

        lbano.setBounds(10, 50, 100, 30);
        txtano.setBounds(110, 50, 130, 30);

        lbvalor.setBounds(10, 90, 100, 30);
        txtvalor.setBounds(110, 90, 130, 30);

        btsalvar.setBounds(10, 160, 80, 30);
        btlistar.addActionListener(this);
        btlistar.setBounds(110, 160, 80, 30);

        painel.add(lbmodelo);
        painel.add(txtmodelo);

        painel.add(lbano);
        painel.add(txtano);

        painel.add(lbvalor);
        painel.add(txtvalor);

        painel.add(btlistar);
        painel.add(btsalvar);

        tela.getContentPane().add(painel); // add painel na tela
        tela.setVisible(true); // tela visível
    }

    public static void main(String[] args) {
        Tela_Veiculo tv = new Tela_Veiculo();
        tv.criarTela();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btsalvar) {
            String mod = txtmodelo.getText();
            Integer ano = Integer.parseInt(txtano.getText());
            Double vlr = Double.parseDouble(txtvalor.getText());
            vei = new Veiculo(mod, ano, vlr);
            list.add(vei);
            JOptionPane.showMessageDialog(null, "Objeto cadastrado com Sucesso!!");
            txtmodelo.setText("");
            txtano.setText("");
            txtvalor.setText("");
        }
        if (e.getSource() == btlistar) {
            for (Veiculo v : list) {
                JOptionPane.showMessageDialog(null,
                        "O modelo: " + v.getModelo() + " O ano: " + v.getAno() + " O valor: R$ " + v.getValor());
            }
        }
    }
}
