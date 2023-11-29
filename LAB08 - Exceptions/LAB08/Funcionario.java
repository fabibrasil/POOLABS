package LAB08;

public class Funcionario {
    private String nome, CPF;
    private float salario, tetoSalarial;

    public Funcionario(String nome, String CPF, float salario) {
        this.nome = nome;
        this.CPF = CPF;
        this.salario = salario;
        this.tetoSalarial = 40000F;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getTetoSalarial() {
        return tetoSalarial;
    }

    public void setTetoSalarial(float tetoSalarial) {
        this.tetoSalarial = tetoSalarial;
    }

    public float aumentaSalario(float porcentagem){
        float aux = ((porcentagem/100) * this.salario) + this.salario;

        if(aux > this.tetoSalarial){
            throw new RuntimeException("Salario maior que o teto.");
        }

        else if(aux < 0){
            throw new RuntimeException("Salario negativo.");
        }

        else if(aux < this.salario){
            throw new RuntimeException("Não houve aumento.");
        }

        else{
            this.setSalario(aux);
        }

        return this.getSalario();
    }

    @Override
    public String toString() {
        return "Funcionarios{" + "nome=" + nome + ", CPF=" + CPF + ", salario=" + salario + '}';
    }
}
