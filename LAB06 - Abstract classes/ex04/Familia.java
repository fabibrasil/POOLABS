package ex04;

import ex04.Contato;

public class Familia extends Contato {
    protected String parentesco;

    public Familia(String apelido, String nome, String email, String aniversario,String parentesco){
        super(apelido, nome, email, aniversario);
        this.parentesco = parentesco;
    }
    public void imprimirContato(){
        this.imprimirBasico();
        System.out.println("Parentesco: "+ parentesco);
    }
}
