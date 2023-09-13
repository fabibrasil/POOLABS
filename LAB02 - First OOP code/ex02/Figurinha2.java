package ex02;

import ex01.ex01Figurinha;

public class Figurinha2 {
    private String nome;
    private String dataNascimento;
    private double altura;
    private double peso;
    private String posicao;
    private String pais;

    public Figurinha2(String nome, String dataNascimento, double altura, double peso, String posicao, String pais) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Posição: " + posicao);
        System.out.println("País: " + pais);
    }

    public static void main(String[] args) {
        ex01Figurinha jogador1 = new ex01Figurinha("Tamires", "10/10/1987", 1.61, 63.0, "lateral esquerda", "Brasil");
        ex01Figurinha jogador2 = new ex01Figurinha("Monica", "21/04/1987", 1.72, 64.0, "zagueira", "Brasil");
        ex01Figurinha jogador3 = new ex01Figurinha("Marta", "19/02/1986", 1.63, 57.0, "meio campista", "Brasil");
        System.out.println("Fica técnica das jogadoras: ");
        jogador1.mostrarInformacoes();
        jogador2.mostrarInformacoes();
        jogador3.mostrarInformacoes();
    }
}
