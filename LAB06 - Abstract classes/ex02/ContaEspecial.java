package ex02;

import ex01.ContaCorrente;

public class ContaEspecial extends ContaCorrente {
    private float limite;

    public ContaEspecial(float val, int num, int senhaDeEntrada, float lim) {
        super(val, num, senhaDeEntrada);
        limite = lim;
    }

    public boolean debitaValor(float val, int senhaDeEntrada) {
        if (senhaDeEntrada != senha)
            return false; // senha deve ser válida
        else if (!(estado))
            return false; // conta deve ser ativa
        else if (val <= 0)
            return false; // val > 0
        else if (val > saldo + limite)
            return false;

        saldo -= val;

        if (saldo == 0 && limite == 0)
            estado = false;

        return true;
    }
    public void debitaValor(float val) {
        saldo -= val;
    }

    public void setLimite(int senhaDeEntrada, float lim) {
        if (senha == senhaDeEntrada)
            limite = lim;
    }

    public float getLimite(int senhaDeEntrada) {
        if (senha == senhaDeEntrada)
            return limite;
        else
            return -1;
    }
}

