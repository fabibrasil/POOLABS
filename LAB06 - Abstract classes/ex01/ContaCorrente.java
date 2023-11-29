package ex01;

public class ContaCorrente {
    private float saldo;
    private Boolean estado;
    private int numConta;
    private int senha;

    public ContaCorrente(float val, int num, int senhaDeEntrada) {
        numConta = num;
        senha = senhaDeEntrada;
        saldo = val;
        estado = true;
    }

    public boolean debitaValor(float val, int senhaDeEntrada) {
        if (senhaDeEntrada != senha)
            return (false); // senha deve ser válida
        if (!(estado))
            return (false); // conta deve ser ativa
        if (val <= 0)
            return (false); // val > 0
        if (val > saldo)
            return (false);

        saldo -= val;

        if (saldo == 0)
            estado = false;

        return (true);
    }

    public void debitaValor(float val) {
        saldo -= val;
    }

    public float getSaldo(int senhaDeEntrada) {
        if (senha == senhaDeEntrada)
            return saldo;
        else
            return -1; // indicando que houve problema na senha
    }

    public void creditaValor(int senhaDeEntrada, float val) {
        if (senha == senhaDeEntrada)
            saldo += val;
    }

    protected Boolean getEstado(int senhaDeEntrada) {
        if (senha == senhaDeEntrada)
            return estado;
        else
            return false;
    }

    protected void setEstado(int senhaDeEntrada, Boolean b) {
        if (senha == senhaDeEntrada)
            estado = b;
    }

    protected boolean isSenha(int senhaDeEntrada) {
        if (senha == senhaDeEntrada)
            return true;
        else
            return false;
    }
}


