package ex02;

import java.util.ArrayList;

abstract class FormaBidimencional{
    public abstract double obterArea();
    public String descricao(){
        return "ex02.Forma Bidimensional";
    }
}

abstract class FormaTridimencional{
    public abstract double obterArea();
    public abstract double obterVolume();
    public String descricao(){
        return "ex02.Forma Tridimensional";
    }
}

class Circulo extends FormaBidimencional{
    private double raio;
    public Circulo(double raio){
        this.raio = raio;
    }
    public double obterArea(){
        return Math.PI*raio*raio;
    }
    public String descricao(){
        return "ex02.Circulo";
    }
}

class Quadrado extends FormaBidimencional{
    private double lado;
    public Quadrado(double lado){
        this.lado = lado;
    }
    public double obterArea(){
        return lado*lado;
    }
    public String descricao(){
        return "ex02.Quadrado";
    }
}

class Triangulo extends FormaBidimencional{
    private double base;
    private double altura;
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double obterArea(){
        return (base*altura)/2;
    }
    public String descricao(){
        return "Triângulo";
    }
}

class Esfera extends FormaTridimencional{
    private double raio;
    public Esfera(double raio){
        this.raio = raio;
    }

    public double obterArea() {
        return 4*Math.PI*raio*raio;
    }
    public double obterVolume(){
        return (4.0/3.0)*Math.PI*raio*raio*raio;
    }
    public String descricao(){
        return "ex02.Esfera";
    }
}

class Cubo extends FormaTridimencional{
    private double lado;
    public Cubo(double lado){
        this.lado = lado;
    }

    public double obterArea() {
        return 6*lado*lado;
    }
    public double obterVolume(){
        return lado*lado*lado;
    }
    public String descricao(){
        return "ex02.Cubo";
    }
}

class Tetraedro extends FormaTridimencional{
    private double aresta;
    public Tetraedro(double aresta){
        this.aresta = aresta;
    }

    public double obterArea() {
        return Math.sqrt(3)*aresta*aresta;
    }
    public double obterVolume(){
        return (Math.sqrt(2)/12)*aresta*aresta*aresta;
    }
    public String descricao(){
        return "ex02.Tetraedro";
    }
}
public class Forma {
    public static void main(String[] args){
        ArrayList<Object> Forma = new ArrayList<>();
        Forma.add(new Circulo(3));
        Forma.add(new Quadrado(4));
        Forma.add(new Triangulo(5,6));
        Forma.add(new Esfera(2.5));
        Forma.add(new Cubo(5.0));
        Forma.add(new Tetraedro(6.0));

        for(Object forma : Forma){
            if(forma instanceof FormaBidimencional){
                FormaBidimencional formaBidimencional = (FormaBidimencional) forma;
                System.out.println(formaBidimencional.descricao() + ":Área = " + formaBidimencional.obterArea());
            } else if (forma instanceof FormaTridimencional) {
                FormaTridimencional formaTridimencional = (FormaTridimencional) forma;
                System.out.println(formaTridimencional.descricao() + ":Área = " + formaTridimencional.obterArea() + ", Volume = " + formaTridimencional.obterVolume());
            }
        }
    }
}
