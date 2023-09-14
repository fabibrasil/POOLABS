class Proprietario {
    private String nome;
    public Proprietario(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}

class Carro{
    private String modelo;
    private Proprietario pessoa;
    public Carro(String modelo, Proprietario pessoa){
        this.modelo = modelo;
        this.pessoa = pessoa;
    }
    public String getModelo(){
        return modelo;
    }
    public Proprietario getPessoa(){
        return pessoa;
    }
}

class Associacao { //os objetos são independentes
    public static void main(String[] args) {
        Proprietario pessoa1 = new Proprietario("João");
        Proprietario pessoa2 = new Proprietario("Maria");

        Carro carro1 = new Carro("Toyota ", pessoa1);
        Carro carro2 = new Carro("Honda ", pessoa2);

        System.out.println(carro1.getModelo() + "pertence a: " + carro1.getPessoa().getNome());
        System.out.println(carro2.getModelo() + "pertence a: " + carro2.getPessoa().getNome());
    }
}

class Agregacao{
    public static void main(String[] args){

    }
}
