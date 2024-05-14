public class Veiculo {
    private String modelo;
    private Integer ano;
    private double valor;

    Veiculo(){}

    public Veiculo (String modelo, Integer ano, double valor){
        super();
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;


    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }


    public Integer getAno(){
        return ano;
    }
    public void setAno(Integer ano){
        this.ano = ano;
    }


    public double getValor(){
        return valor;
    }
    public void setValor(Double valor){
        this.valor = valor;
    }
    
    
}
