package ex01;

import java.util.ArrayList;

class Funcionario {
    private String nome;
    private String dataNascimento;
    private double salario;

    public Funcionario(String nome, String dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public double calcularSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public String toString(){
        return "Nome: " + nome + ", Data de nascimento: " + dataNascimento + ", Salario: " + salario;
    }
}

class Chefe extends Funcionario{
    public Chefe(String nome, String dataNascimento, double salarioFixo){
        super(nome, dataNascimento);
        setSalario(salarioFixo);
    }
}

class Vendedor extends Funcionario{
    private double comissao;
    private double vendas;

    public Vendedor(String nome, String dataNascimento, double comissao,double vendas){
        super(nome, dataNascimento);
        this.comissao = comissao;
        this.vendas = vendas;
        setSalario(calcularSalario());
    }
    public double calcularSalario(){
        return super.calcularSalario() + comissao*vendas;
    }
}

class Operario extends Funcionario{
    private double valorProduto;
    private int qnt_produzida;

    public Operario(String nome, String dataNascimento, double valorProduto, int qnt_produzida){
        super(nome, dataNascimento);
        this.valorProduto = valorProduto;
        this.qnt_produzida = qnt_produzida;
        setSalario(calcularSalario());
    }
    public double calcularSalario(){
        return valorProduto*qnt_produzida;
    }
}

class Horista extends Funcionario{
    private double valorHora;
    private int totalHorasTrabalhadas;

    public Horista(String nome, String dataNascimento, double valorHora, int totalHorasTrabalhadas){
        super(nome, dataNascimento);
        this.valorHora = valorHora;
        this.totalHorasTrabalhadas = totalHorasTrabalhadas;
        setSalario(calcularSalario());
    }
    public double calcularSalario(){
        return valorHora*totalHorasTrabalhadas;
    }
}
public class Empresa {
    private ArrayList<Funcionario> funcionarios;

    public Empresa(){
        funcionarios = funcionarios;
        new ArrayList<>();
    }
    public void  adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    public void mostrarFolhaDePagamento(){
        for(Funcionario funcionario : funcionarios){
            System.out.println(funcionario.toString());
        }
    }
    public static void main(String[] args){
        Empresa empresa  = new Empresa();
        empresa.adicionarFuncionario(new Chefe("Fabiana Brasil", "24/04/1997", 50000));
        empresa.adicionarFuncionario(new Vendedor("Bharbara Mendes", "05/07/2001", 50, 200));
        empresa.adicionarFuncionario(new Operario("Fernando", "18/06/2004", 10, 500));
        empresa.adicionarFuncionario(new Horista("Filipe", "27/06/2003", 100, 40 ));
    }
}
