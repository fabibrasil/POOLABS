package ex04;

public abstract class Contato {
    protected String apelido;
    protected String nome;
    protected String email;
    protected String aniversario;

    public Contato(String apelido, String nome, String email, String aniversario) {
        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }

    public void imprimirBasico(){
        System.out.println("Apelido: "+ this.apelido);
        System.out.println("Nome: "+ this.nome);
        System.out.println("Email: "+ this.email);
        System.out.println("Aniversario: "+ this.aniversario);
    }

    public abstract void imprimirContato();
}