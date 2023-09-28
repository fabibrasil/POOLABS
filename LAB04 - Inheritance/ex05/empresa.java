package ex05;

class Funcionario{
    private String nome;
    private String dataNascimento;
    private double salario;

    public Funcionario(String nome, String dataNascimento, double salario){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }
    public double calcularSalario(){
        return salario;
    }
    public String getNome(){
        return nome;
    }
}

class Chefe extends Funcionario{
    public Chefe (String nome, String dataNascimento, double salarioFixo){
        super(nome, dataNascimento, salarioFixo);
    }
}

class Vendedor extends Funcionario {
    private double valorFixo;
    private double comissao;
    private double vendas;

    public Vendedor(String nome, String dataNascimento, double valorFixo, double comissao, double vendas){
        super(nome, dataNascimento,0);
        this.valorFixo = valorFixo;
        this.comissao = comissao;
        this.vendas = vendas;
    }

    public double calcularSalario(){
        return valorFixo+comissao*vendas;
    }
}

class Operario extends Funcionario{
    private double valorProducao;
    private int qnt_produzida;

    public Operario(String nome, String dataNascimento, double valorProducao, int qnt_produzida){
        super(nome, dataNascimento, 0);
        this.valorProducao = valorProducao;
        this.qnt_produzida = qnt_produzida;
    }

    public double calcularSalario(){
        return valorProducao*qnt_produzida;
    }
}

class Horista extends Funcionario{
    private double valorHora;
    private int totalHoras;

    public Horista(String nome, String dataNascimento, double valorHora, int totalHoras){
        super(nome, dataNascimento, 0);
        this.valorHora = valorHora;
        this.totalHoras = totalHoras;
    }

    public double calcularSalario(){
        return valorHora*totalHoras;
    }
}
public class empresa {
    public static void main(String[] args){
        Funcionario[] funcionarios = new Funcionario[4];

        funcionarios[0] = new Chefe("Fabiana", "24/04/1997", 10000);
        funcionarios[1] = new Vendedor("Diulia", "28/01/2004", 2000, 5, 200);
        funcionarios[2] = new Operario("Fernando", "18/06/2004", 50, 50);
        funcionarios[3] = new Horista("Matheus", "24/05/2004", 50, 40);

        for(Funcionario funcionario : funcionarios){
            double salario = funcionario.calcularSalario();
            System.out.println(funcionario.getNome() + ": Salário =" + salario);
        }
    }
}
