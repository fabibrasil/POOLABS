package ex04;

import ex04.Contato;

public class Trabalho extends Contato {
    protected String relacao;

    public Trabalho(String apelido, String nome, String email, String aniversario,String relacao){
        super(apelido, nome, email, aniversario);
        this.relacao = relacao;
    }
    public void imprimirContato(){
        this.imprimirBasico();
        System.out.println("Relacao: "+ relacao);
    }
}
