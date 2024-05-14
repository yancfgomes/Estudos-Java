public class SmartTV {

        boolean ligada = false;
        int canal = 1;
        int volume = 25;

        public void aumentarvolume(){
            volume++;
            System.out.println("Aumentando o volume para : " + volume);
        }

        public void diminuirvolume(){
            volume--;
            System.out.println("Diminuindo o volume para : " + volume);

        }
        public void aumnetarCanal(){
            canal++;
        }

        public void diminuircanal(){
            canal--;
        }

        public void mudarCanal (int novoCanal){
            canal = novoCanal;
        }

        public void ligar(){
            ligada = true;
        }

        public void desligar (){
            ligada = false ; 
        }
}