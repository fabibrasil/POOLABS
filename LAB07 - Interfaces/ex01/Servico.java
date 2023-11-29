package ex01;

public class Servico implements Classificavel {

    private float preco ;

    public Servico(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public boolean eMenorQue (Classificavel o) {
        Servico compara1 = (Servico) o;
        if ( this.preco < compara1.preco) {
            return true ;
        } else {
            return false ;
        }
    }
}
