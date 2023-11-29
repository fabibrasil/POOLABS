package ex01;

public class Produto implements Classificavel{
    private int codigo ;

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public boolean eMenorQue (Classificavel obj) {
        Produto compara = ( Produto ) obj;
        if ( this.codigo < compara.codigo ) {
            return true ;
        } else {
            return false ;
        }
    }

    public int getCodigo() {
        return codigo;
    }
}