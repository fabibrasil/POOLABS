package ex04;

class C1 {
    public int atributoPublico;
    protected int atributoProtegido;
    private int atributoPrivado;

    public C1(){
        System.out.println("Classe ex04.C1: chamada do construtor sem parâmetros");
    }

    public C1(int atributoPublico, int atributoProtegido, int atributoPrivado){
        this.atributoPublico = atributoPublico;
        this.atributoProtegido = atributoProtegido;
        this.atributoPrivado = atributoPrivado;
        System.out.println("Classe ex04.C1: chamada do construtor com parâmetros");
    }

    public void mostrarAtributos(){
        System.out.println("Atributo Publico: " + atributoPublico);
        System.out.println("Atributo Protegido: " + atributoProtegido);
        System.out.println("Atributo Privado: " + atributoPrivado);
    }
    public void mostrarAtributosSuper(){
        System.out.println("Atributo Publico (super): " + atributoPublico);
        System.out.println("Atributo Protegido (super): " + atributoProtegido);
        System.out.println("Atributo Privado (super): " + atributoPrivado);
    }
}

class C2 extends C1{
    public C2(){
        System.out.println("Classe ex04.C2: Chamada do construtor sem parâmetros");
    }
    public C2(int atributoPublico, int atributoProtegido, int atributoPrivado){
        super(atributoPublico, atributoProtegido, atributoPrivado);
        System.out.println("Classe ex04.C2: chamada do construtor com parâmetros");
    }
}

class C3 extends C2{
    public C3(){
        System.out.println("Classe ex04.C3: Chamada do construtor sem parâmetros");
    }
    public C3(int atributoPublico, int atributoProtegido, int atributoPrivado){
        super(atributoPublico, atributoProtegido, atributoPrivado);
        System.out.println("Classe ex04.C3: chamada do construtor com parâmetros");
    }
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("Método mostrar atributos da classe ex04.C3");
    }
    public void mostrarAtributosSuper(){
        super.mostrarAtributosSuper();
        System.out.println("Método da classe ex04.C3 de mostrar atributos super");
    }
}

public class main{
    public static void main(String[] args){
        C1 objetoC1 = new C1(1,2,3);
        C2 objetoC2 = new C2(4,5,6);
        C3 objetoC3 = new C3(7,8,9);

        System.out.println("Dados do objeto  ex04.C1: ");
        objetoC1.mostrarAtributos();
        objetoC1.mostrarAtributosSuper();
        System.out.println("Dados do objeto  ex04.C2: ");
        objetoC2.mostrarAtributos();
        objetoC2.mostrarAtributosSuper();
        System.out.println("Dados do objeto  ex04.C1: ");
        objetoC3.mostrarAtributos();
        objetoC3.mostrarAtributosSuper();
    }
}


