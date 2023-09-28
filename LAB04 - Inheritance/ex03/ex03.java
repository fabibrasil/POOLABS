package ex03;

class ex01Figurinha {
    private String nome;
    private String dataNascimento;
    private double altura;
    private double peso;
    private String posicao;
    private String pais;

    public ex01Figurinha(String nome, String dataNascimento, double altura, double peso, String posicao, String pais){ //construtor
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
    public String getNome(){
        return nome;
    }
    public String getDataNascimento(){
        return dataNascimento;
    }
    public double getAltura(){
        return altura;
    }
    public double getPeso(){
        return peso;
    }
    public String getPosicao(){
        return posicao;
    }
    public String getPais(){
        return pais;
    }
}

class FigurinhaExtra extends ex01Figurinha {
    private String categoria;
    private String cor;

    public FigurinhaExtra(String nomeJogador, String dataNascimento, double altura, double peso, String posicao, String pais, String categoria, String cor){
        super(nomeJogador, dataNascimento,altura, peso,posicao,pais);
        this.cor = cor;
        this.categoria = categoria;
    }

    public void mostrarFigurinhaExtra(){
        super.mostrarInformacoes();
        System.out.println("Categoria: " + categoria);
        System.out.println("Cor: " + cor);
    }
}

public class ex03 {
    public static void main (String[] args){
        ex01Figurinha figurinhaRegular = new ex01Figurinha("Marta", "19/02/1986", 1.63, 57.0, "meio campista", "Brasil");
        FigurinhaExtra figurinhaExtra = new FigurinhaExtra("Alex Morgan", "02/07/1989", 1.70, 56.0, "atacante", "Estados Unidos", "Legends", "Ouro");
        System.out.println("Dados da Figurinha Regular: ");
        figurinhaRegular.mostrarInformacoes();
        System.out.println("Dados da Figurinha Extra: ");
        figurinhaExtra.mostrarFigurinhaExtra();
    }
}
