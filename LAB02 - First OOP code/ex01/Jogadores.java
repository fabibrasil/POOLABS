package ex01;

public class Jogadores {
    public static void main (String[] args){
        ex01Figurinha jogador1 = new ex01Figurinha("Tamires", "10/10/1987", 1.61, 63.0, "lateral esquerda", "Brasil");
        ex01Figurinha jogador2 = new ex01Figurinha("Monica", "21/04/1987", 1.72, 64.0, "zagueira", "Brasil");
        ex01Figurinha jogador3 = new ex01Figurinha("Marta", "19/02/1986", 1.63, 57.0, "meio campista", "Brasil");
        System.out.println("Fica técnica das jogadoras: ");
        jogador1.mostrarInformacoes();
        jogador2.mostrarInformacoes();
        jogador3.mostrarInformacoes();
    }
}
