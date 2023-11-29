package ex02;

import ex01.ContaCorrente;

public class ContaComum extends ContaCorrente {
    public ContaComum(float val, int num, int senhaDeEntrada) {
        super(val, num, senhaDeEntrada);
    }

    public boolean debitaValor(float val, int senhaDeEntrada) {
        if (senhaDeEntrada != senha)
            return false; // senha deve ser válida
        else if (!(estado))
            return false; // conta deve ser ativa
        else if (val <= 0)
            return false; // val > 0
        else if (val > saldo)
            return false;

        saldo -= val;

        if (saldo == 0)
            estado = false;

        return true;
    }

}