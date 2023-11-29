package ex01;

public class Cliente implements Classificavel {
    private String nome ;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public boolean eMenorQue (Classificavel o) {
        Cliente compara2 = (Cliente) o;
        if ( this.nome.compareTo(compara2.nome) < 0) {
            return true ;
        } else {
            return false ;
        }
    }
}
