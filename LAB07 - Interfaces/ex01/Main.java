package ex01;

import ex01.Classificador;
import ex01.Cliente;
import ex01.Produto;
import ex01.Servico;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Classificador cl = new Classificador();
        int max = 3;
        Produto[] produto = new Produto[max];
        Servico[] servico = new Servico[max];
        Cliente[] cliente = new Cliente[max];

        cliente[0] = new Cliente("Rafael");
        cliente[1] = new Cliente("Ana");
        cliente[2] = new Cliente("Max");

        System.out.println(" =============== Exercicio Interface ===============" );
        System.out.println(" Elementos não ordenados: " );
        for (int i = 0;i<max;i++){
            System.out.println("Cliente : "+ cliente[i].getNome());
            produto[i] = new Produto(random.nextInt(101));
            System.out.println("Codigo: "+ produto[i].getCodigo());
            servico[i] = new Servico(random.nextFloat(101.0F));
            System.out.println("Preco: "+ servico[i].getPreco());
            System.out.println(" ");
        }

        cl.ordena(produto);
        cl.ordena(servico);
        cl.ordena(cliente);

        System.out.println(" ");
        System.out.printf("Cliente em ordem :");
        for (int i = 0;i<max;i++){
            System.out.printf(" %s, ",cliente[i].getNome());
        }

        System.out.printf("\nCodigos em ordem :");
        for (int i = 0;i<max;i++){
            System.out.printf(" %d,",produto[i].getCodigo());
        }

        System.out.printf("\npreco em ordem :");
        for (int i = 0;i<max;i++){
            System.out.printf(" %f,",servico[i].getPreco());
        }
    }
}