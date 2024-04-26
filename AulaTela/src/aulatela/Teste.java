package aulatela;

public class Teste {
    public static void main(String[] args) {
        Pessoa pes = new Pessoa("João", 18, 500.0);
        
        System.out.println("O nome: " + pes.getNome());
        System.out.println("A idade: " + pes.getIdade());
        System.out.println("A renda: " + pes.getRenda());
    }
}
