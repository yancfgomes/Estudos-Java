import java.util.ArrayList;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        ArrayList<Veiculo> list = new ArrayList<Veiculo>();
        Veiculo vei;

        Scanner into = new Scanner(System.in);
        Integer b;
        do {
            System.out.println("Digite o modelo: ");
            String m = into.next();

            System.out.println("Digite o valor: ");
            Double v = into.nextDouble();

            System.out.println("Digite o ano: ");
            Integer a = into.nextInt();

            System.out.println("OBJETO CADASTRADO");

            vei = new Veiculo(m, a, v);
            list.add(vei);

            System.out.println("Digite 1 para continuar ou 0 para sair: ");
            b = into.nextInt();
        } while (b != 0);

        for (Veiculo v : list) {
            System.out.println("O modelo: " + v.getModelo());
            System.out.println("O ano " + v.getAno());
            System.out.println("O valor: " + v.getValor());
            System.out.println("------------------");
        }
    }
}
