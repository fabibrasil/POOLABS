package ex03;

class Estudante{
    private String nome;
    private String endereco;

    public Estudante(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public void print(boolean sameLine){
        if (sameLine){
            System.out.print("Nome: " + nome + "; Endereço: " + endereco);
        }
        else{
            System.out.println("Nome: " + nome);
            System.out.println("Endereço: " + endereco);
        }
    }
}

class EstudanteGraduacao extends Estudante {
    private String tituloTCC;

    public EstudanteGraduacao(String nome, String endereco, String tituloTCC) {
        super(nome, endereco);
        this.tituloTCC = tituloTCC;
    }

    public void print(boolean sameLine) {
        super.print(sameLine);
        if (sameLine) {
            System.out.print("; Título do TCC: " + tituloTCC);
        } else {
            System.out.println("Título do TCC: " + tituloTCC);
        }
    }
}

class EstudantePosGrad extends Estudante {
    private String linhaDePesquisa;
    private String formacao;

    public EstudantePosGrad(String nome, String endereco, String linhaDePesquisa, String formacao) {
        super(nome, endereco);
        this.linhaDePesquisa = linhaDePesquisa;
        this.formacao = formacao;
    }

    public void print(boolean sameLine) {
        super.print(sameLine);
        if (sameLine) {
            System.out.print("; Linha de Pesquisa: " + linhaDePesquisa + "; Formação: " + formacao);
        } else {
            System.out.println("Linhda de Pesquisa: " + linhaDePesquisa);
            System.out.println("Formação: " + formacao);
        }
    }
}

class EstudanteMestrado extends EstudantePosGrad {
    private String tipo;
    private String tituloDissertacao;

    public EstudanteMestrado(String nome, String endereco, String linhaDePesquisa, String formacao, String tipo, String tituloDissertacao) {
        super(nome, endereco, linhaDePesquisa, formacao);
        this.tipo = tipo;
        this.tituloDissertacao = tituloDissertacao;
    }

    public void print(boolean sameLine) {
        super.print(sameLine);
        if (sameLine) {
            System.out.print("; Tipo: " + tipo + "; Título da Dissertação: " + tituloDissertacao);
        } else {
            System.out.println("Tipo: " + tipo);
            System.out.println("Título da Dissertação: " + tituloDissertacao);
        }
    }
}

class EstudanteDoutorado extends EstudantePosGrad{
    private String tituloTese;
    public EstudanteDoutorado(String nome, String endereco, String linhaDePesquisa, String formacao, String tituloTese) {
        super(nome, endereco, linhaDePesquisa, formacao);
        this.tituloTese = tituloTese;
    }
    public void print(boolean sameLine){
        if(sameLine){
            System.out.print("; Título da Tese: " + tituloTese);
        } else{
            System.out.println("Título da Tese: " + tituloTese);
        }
    }
}



public class Universidade {
    private String nome;
    private String dataFundacao;
    private Estudante[] alunos;
    private int numAlunos;

    public Universidade(String nome, String dataFundacao) {
        this.nome = nome;
        this.dataFundacao = dataFundacao;


        this.alunos = new Estudante[100];
        this.numAlunos = 0;
    }
}

/*letra (e): sim, é possível utilizar o método print(boolean) em um vetor de referências da classe ex03.Estudante com polimorfismo.
Isso ocorre, porque a classe ex03.Estudante define esse método e as subclasses sobrescrevem esse método para fornecer uma
implementação específica.
 */
