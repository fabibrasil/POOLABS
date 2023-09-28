package ex06;

public class Ingresso{
    private double valor;
    public Ingresso(double valor){
        this.valor = valor;
    }
    public void escreverValor(){
        System.out.println("Valor do ingresso: R$" +valor);
    }
}

class VIP extends Ingresso{
    private double valorAdicional;

    public VIP (double valor, double valorAdicional){
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorIngressoVIP(){
        return super.getValor() + valorAdicional;
    }
}

class Normal extends Ingresso{
    public Normal (double valor){
        super(valor);
    }

    public void TipoIngresso(){
        System.out.println("ex06.Ingresso ex06.Normal");
    }
}

class CamaroteInferior extends VIP {
    private String localizacao;

    public CamaroteInferior(double valor, double valorAdicional, String localizacao){
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }
    public String getLocalizacao(){
        return localizacao;
    }
    public void escreveLocalizacao(){
        System.out.println("Localizacao: " + localizacao);
    }
}

class CamaroteSuperior extends VIP{
    public CamaroteSuperior(double valor, double valorAdicional){
        super(valor,valorAdicional);
    }
    public double getValorIngresso(){
        return super.getValorIngressoVIP();
    }
}
