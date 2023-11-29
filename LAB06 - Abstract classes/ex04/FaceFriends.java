package ex04;

import ex04.Amigo;
import ex04.Contato;
import ex04.Familia;
import ex04.Trabalho;

import java.util.Scanner;

public class FaceFriends {
    public static void main(String[] args) {
        int qtd,grau,i,id,valor;
        int verificacao = 0;
        String apelido,nome,email,aniversario,subtipo,parentesco,tipoTrabalho;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos contatos quer criar ");
        qtd = sc.nextInt();
        sc.nextLine();
        Contato[] contato = new Contato[qtd];
        do{
            valor = Menu();

            if(valor == 1){
                if(verificacao != qtd){
                    do{
                        do {
                            System.out.println("Digite o subtipo do contato: ");
                            subtipo = sc.nextLine();
                        } while(!subtipo.equals("ex04.Familia") && !subtipo.equals("ex04.Amigo") && !subtipo.equals("ex04.Trabalho"));

                        System.out.println("Digite o nome do contato: ");
                        nome = sc.nextLine();
                        System.out.println("Digite o apelido do contato: ");
                        apelido = sc.nextLine();
                        System.out.println("Digite o email do contato: ");
                        email = sc.nextLine();
                        System.out.println("Digite o aniversario do contato: ");
                        aniversario = sc.nextLine();

                        if (subtipo.equals("ex04.Familia")) {
                            System.out.println("Digite o parentesco do contato: ");
                            parentesco = sc.nextLine();
                            contato[verificacao] = new Familia(apelido, nome, email, aniversario, parentesco);
                            verificacao++;
                        } else if (subtipo.equals("ex04.Amigo")) {
                            System.out.println("Digite o grau de amizade do contato: ");
                            grau = sc.nextInt();
                            sc.nextLine();
                            contato[verificacao] = new Amigo(apelido, nome, email, aniversario, grau);
                            verificacao++;
                        } else if (subtipo.equals("ex04.Trabalho")) {
                            System.out.println("Digite o tipo de contato do contato: ");
                            tipoTrabalho = sc.nextLine();
                            contato[verificacao] = new Trabalho(apelido, nome, email, aniversario, tipoTrabalho);
                            verificacao++;
                        }
                    }while(qtd != verificacao);
                } else
                    System.out.println("Contatos preenchidos");
            }

            if(valor == 2){
                if(contato[0] != null){
                    for(i = 0; i<qtd;i++){
                        contato[i].imprimirContato();
                        System.out.println(" ");
                    }
                }else if(contato[0] == null){
                    System.out.println("Contatos não preenchidos");
                }
            }

            if(valor == 3) {
                if (contato[0] != null) {
                    for (i = 0; i < qtd; i++) {
                        if(contato[i] instanceof Familia) {
                            contato[i].imprimirContato();
                            System.out.println(" ");
                        }
                    }
                }else if(contato[0] == null){
                    System.out.println("Contatos não preenchidos");
                } else System.out.println("Não foram encontrados familiares");
            }

            if(valor == 4) {
                if (contato[0] != null) {
                    for (i = 0; i < qtd; i++) {
                        if(contato[i] instanceof Amigo) {
                            contato[i].imprimirContato();
                            System.out.println(" ");
                        }
                    }
                }else if(contato[0] == null){
                    System.out.println("Contatos não preenchidos");
                }else System.out.println("Não foram encontrados amigos");
            }

            if(valor == 5) {
                if (contato[0] != null) {
                    for (i = 0; i < qtd; i++) {
                        if(contato[i] instanceof Trabalho) {
                            contato[i].imprimirContato();
                            System.out.println(" ");
                        }
                    }
                }else if(contato[0] == null){
                    System.out.println("Contatos não preenchidos");
                }else System.out.println("Não foram encontrados amigos do trabalho");
            }

            if(valor == 6){
                if (contato[0] != null) {
                    for (i = 0; i < qtd; i++) {
                        if(contato[i] instanceof Amigo) {
                            if(((Amigo) contato[i]).grau == 1){
                                contato[i].imprimirContato();
                                System.out.println(" ");
                            }
                        }else if(contato[i] instanceof Familia) {
                            if (((Familia) contato[i]).parentesco.equals("Irmao")) {
                                contato[i].imprimirContato();
                                System.out.println(" ");
                            }
                        }else if(contato[i] instanceof Trabalho) {
                            contato[i].imprimirContato();
                            System.out.println(" ");
                        }
                    }
                }else if(contato[0] == null){
                    System.out.println("Contatos não preenchidos");
                }else System.out.println("Não foram encontrados os contatos especificados");
            }

            if(valor == 7) {
                System.out.println("Digite o ID do pessoa que voce quer procurar");
                id = sc.nextInt();
                sc.nextLine();
                if (contato[0] != null) {
                    for (i = 0; i < qtd; i++) {
                        if(id == i) {
                            contato[i].imprimirContato();
                            System.out.println(" ");
                        }
                    }
                }else if(contato[0] == null){
                    System.out.println("Contatos não preenchidos");
                }else System.out.println("Não foram encontrados amigos do trabalho");
            }
        }while(valor != 8 );

    }
    public static int Menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n1- Insira um contato");
        System.out.println("2- Imprima todos os contatos");
        System.out.println("3- Imprima somente os familiares");
        System.out.println("4- Imprima somente os amigos");
        System.out.println("5- Imprima somente os colegas de trabalho");
        System.out.println("6- Imprima os melhores amigos, os irmaos e os colegas de trabalhos");
        System.out.println("7- Imprima somente dados de um unico contato");
        System.out.println("8- Sair");
        return sc.nextInt();
    }
}