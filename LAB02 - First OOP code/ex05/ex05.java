package ex05;

import ex01.ex01Figurinha;
import ex04.ex04Selecao;

public class ex05 {

    public static void main(String[] args){
        ex01Figurinha figurinhaBrasil = new ex01Figurinha("Brasil");
        String[] titularesBrasil = {"Leticia Izidoro", "Marta", "Debinha", "Antonia", "Bruninha", "Kathellen", "Lauren", "Monica Hickman", "Rafaelle", "Tamires"};
        String[] reservasBrasil = {"Barbara", "Duda Sampaio", "Kerolin", "Luana", "Adriana", "Ana Vitoria", "Ary Borges", "Andressa", "Geyse", "Camila", "Nycole", "Bia", "Gabi"};
        ex04Selecao selecaoBrasil = new ex04Selecao("Brasil", titularesBrasil, "Arthur Elias", reservasBrasil);
        System.out.println("Figurinha do Brasil: ");
        figurinhaBrasil.mostrarInformacoes();
        System.out.println("Ficha técnica Brasil: ");
        selecaoBrasil.mostrarInformacoes();
    }
}
