package ex01;

public class ex01Figurinha {
     String nome;
     String dataNascimento;
     double altura;
     double peso;
     String posicao;
     String pais;

    public ex01Figurinha(String nome, String dataNascimento, double altura, double peso, String posicao, String pais){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
    }

    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Posição: " + posicao);
        System.out.println("País: " + pais);
    }
}



