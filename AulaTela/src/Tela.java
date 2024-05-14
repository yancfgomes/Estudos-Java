
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;




public class Tela implements ActionListener {
	Pessoa pes;
	JFrame tela = new JFrame ("Cadastro de Pessoa");
	JPanel painel = new JPanel();
	
	
	JLabel lbnome = new JLabel ("Nome: ");
	JLabel lbidade = new JLabel ("Idade: ");
	JLabel lbrenda = new JLabel ("Renda: ");
	
	JTextField txtnome = new JTextField();
	JTextField txtidade = new JTextField();
	JTextField txtrenda = new JTextField();

	JButton btsalvar = new JButton("Salvar");
	
	void criarTela () {
		
		tela.setSize(400,350);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		painel.setLayout(null);
		
		lbnome.setBounds(10, 10, 100, 30);
		txtnome.setBounds(10, 40, 100, 30);
		lbidade.setBounds(10, 70, 100, 30);
		txtidade.setBounds(10, 100, 100, 30);
		lbrenda.setBounds(10, 130, 100, 30);
		txtrenda.setBounds(10, 160, 100, 30);
		
		
		btsalvar.setBounds(40, 220, 100, 30);
		
		
		painel.add(lbnome);
		painel.add(txtnome);
		painel.add(lbidade);
		painel.add(txtidade);
		painel.add(lbrenda);
		painel.add(txtrenda);
		painel.add(btsalvar);
		btsalvar.addActionListener(this);
		
		
		tela.getContentPane().add(painel); //add o painel na tela
		tela.setVisible(true); //torna a tela visível
	 }
	public static void main(String [] args) {
		Tela tp = new Tela();
		tp.criarTela();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btsalvar);
			String n = txtnome.getText();
			Integer i = Integer.parseInt(txtidade.getText());
			Double r = Double.parseDouble(txtrenda.getText());
			
			pes = new Pessoa (n, i, r);
			
			JOptionPane.showMessageDialog(null, "Objeto Cadastrado com Sucesso!");
			//JOptionPane.showMessageDialog(null, "Nome: " + pes.getNome() + "n\ A idade: " + pes.getIdade()+ "n\ A renda: " +pes.getRenda());

			
		
	}
}
