package ex03;

import ex02.ContaEspecial;

import java.util.Scanner;

public class UsaBanco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ContaEspecial[] contaEsp = new ContaEspecial[3];

        int num,senha;
        float valor,limite;

        System.out.println("== Crie suas contas Especiais == ");
        for(int i = 0; i<2; i++) {
            System.out.printf("Digite o numero da conta [%d]: ",i+1);
            num = sc.nextInt();
            System.out.printf("Digite a senha da conta [%d]: ",i+1);
            senha = sc.nextInt();
            System.out.printf("Digite o débito inicial da conta [%d]: ",i+1);
            valor = sc.nextFloat();
            System.out.printf("Digite o limite da conta [%d]: ",i+1);
            limite = sc.nextFloat();
            contaEsp[i] = new ContaEspecial(valor,num,senha,limite);
            System.out.printf("Conta [%d] criada com sucesso\n",i+1);
        }

        System.out.println("== Fazer débitos nas contas == \n");

        for(int i = 0; i<2; i++) {
            System.out.printf("Debito na conta %d",i+1);
            System.out.printf("Digite a senha da conta [%d]: ",i+1);
            senha = sc.nextInt();
            System.out.println("Digite o débito que quer fazer: ");
            valor = sc.nextFloat();
            if(contaEsp[i].debitaValor(valor,senha) == false){
                System.out.println("Erro no débito");
            }
            else {
                System.out.println("Débito efetuado com sucesso");
                System.out.printf("O saldo atual é de : %f",contaEsp[i].getSaldo(senha));
            }
        }
    }
}