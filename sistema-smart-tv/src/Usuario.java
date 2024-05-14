public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();
        System.out.println("TV ligada: " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.diminuirvolume();
        smartTV.diminuirvolume();
        smartTV.diminuirvolume();
        smartTV.diminuirvolume();
        smartTV.aumentarvolume();

        System.out.println("Volume Atual: " + smartTV.volume );

        System.out.println("Canal atual: " + smartTV.canal);

        smartTV.mudarCanal(13);

        System.out.println("Canal atual: " + smartTV.canal);

        
        smartTV.ligar();
        System.out.println("Novo status -> TV ligada ? " + smartTV.ligada);


        smartTV.desligar();
        System.out.println("Novo status -> Tv Ligada ? " + smartTV.ligada);

    }
}
