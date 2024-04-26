
public class Pessoa {
	private String nome;
	private Integer idade;
	private Double renda;
	
	
	public Pessoa (String nome, Integer idade, Double renda){
		super();
		this.nome=nome;
		this.idade = idade;
		this.renda = renda;
	}
	//adiciona
	public void setNome (String nome) {
		this.nome = nome;
	}
	//retorna
	public String getNome() {
		return nome;
	}
	
	public void setIdade(Integer idade) {
		this.idade =idade;
		
	}
	public Integer getIdade() {
		return idade;
	}
	public void setRenda(Double renda) {
		this.renda = renda;
	}
	public Double getRenda() {
		return renda;
	}
}