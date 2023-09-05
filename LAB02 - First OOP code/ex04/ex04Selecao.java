package ex04;

public class ex04Selecao {
    private String nomeDaSelecao;
    private String[] titulares;
    private String tecnico;
    private String[] reservas;

    public ex04Selecao(String nomeDaSelecao, String[] titulares, String tecnico, String[] reservas){
        this.nomeDaSelecao = nomeDaSelecao;
        this.titulares = titulares;
        this.tecnico = tecnico;
        this.reservas = reservas;
    }

    public void mostrarInformacoes(){
        System.out.println("Nome da Seleção: " + nomeDaSelecao);
        System.out.println("Jogadoras titulares: " );
        for (int i = 0; i<titulares.length; i++){
            System.out.println(titulares[i]);
        }
        System.out.println("Nome do tecnico: " + tecnico);
        System.out.println("Jogadoras reserva: ");
        for(int i = 0; i<reservas.length; i++){
            System.out.println(reservas[i]);
        }
        System.out.println();
    }
    public static void main(String[] args){
        String[] titularesBrasil = {"Leticia Izidoro", "Marta", "Debinha", "Antonia", "Bruninha", "Kathellen", "Lauren", "Monica Hickman", "Rafaelle", "Tamires"};
        String[] reservasBrasil = {"Barbara", "Duda Sampaio", "Kerolin", "Luana", "Adriana", "Ana Vitoria", "Ary Borges", "Andressa", "Geyse","Camila", "Nycole", "Bia", "Gabi"};
        ex04Selecao selecaoBrasil = new ex04Selecao("Brasil", titularesBrasil, "Arthur Elias", reservasBrasil);
        String[] titularesEspanha = {"Miza Rodrigues", "Ivana Andres", "Ona", "Olga", "Tere", "Fiamma", "Aitana", "Irene", "Mariona", "Marta Cardona", "Athenea"};
        String[] reservasEspanha = {"Enith", "Cata", "Elene", "Laia", "Jana", "Rocio", "Sheila", "Oihane", "Irene", "Jenni", "Maite", "Maria"};
        ex04Selecao selecaoEspanha = new ex04Selecao("Espanha", titularesEspanha, "Jorge Vilda", reservasEspanha);
        System.out.println("Ficha tecnica das seleções: ");
        selecaoBrasil.mostrarInformacoes();
        selecaoEspanha.mostrarInformacoes();
    }
}


