
import java.util.Scanner;
public class vetores {
    public static void ex1(){
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[6];
        System.out.print("Digite 6 numeros inteiros: \n");
        valores[0] = sc.nextInt();
        valores[1] = sc.nextInt();
        valores[2] = sc.nextInt();
        valores[3] = sc.nextInt();
        valores[4] = sc.nextInt();
        valores[5] = sc.nextInt();

        System.out.println("Valores lidos:");
        System.out.println(valores[0]);
        System.out.println(valores[1]);
        System.out.println(valores[2]);
        System.out.println(valores[3]);
        System.out.println(valores[4]);
        System.out.println(valores[5]);

        sc.close();
    }

    public static void ex2(){
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[6];
        System.out.print("Digite 6 valores inteiros: \n");

        for (int i = 0; i<6; i++){
            valores[i] = sc.nextInt();
        }

        System.out.print("Os valores lidos são: \n");
        for (int i = 0; i<6;i++){
            System.out.print(valores[i]);
        }
        sc.close();
    }

    public static void ex3(){
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[6];
        System.out.print("Digite 6 valores inteiros: \n");

        for (int i = 0; i<6; i++){
            valores[i] = sc.nextInt();
        }

        System.out.print("Os valores lidos inversamente são: \n");
        for (int i = valores.length -1; i>=0;i--){
            System.out.print(valores[i]);
        }
        sc.close();
    }

    public static void ex4(){
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[6];
        System.out.print("Entre com o numero: \n");

        int count = 0;

        while (count < 6){
            int n = sc.nextInt();
            if (n % 2 == 0){
                valores[count] = n;
                count++;
            } else{
                System.out.print("Erro! O numero digitado não é par.\n");
            }
        }
        System.out.print("Os numeros pares digitados são:\n");
        for (int i = 0; i<6;i++){
            System.out.println(valores[i]);
        }
        sc.close();
    }

    public static void ex5(){
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[5];
        System.out.printf("Digite os valores: \n");
        for (int i = 0; i<5;i++){
            valores[i] = sc.nextInt();
        }
        int maior = valores[0];
        int menor = valores[0];
        int soma = valores[0];

        for (int i = 1; i<5; i++){

            if(valores[i] > maior){
                maior = valores[i];
            }
            if(valores[i] < menor){
                menor = valores[i];
            }
            soma += valores[i];
        }

        double media = (double) soma/5;

        System.out.printf("Os valores lidos são: \n");
        for (int i = 0; i < 5; i++){
            System.out.println(valores[i]);
        }
        System.out.printf("O maior valor é: %d\n", maior);
        System.out.printf("O menor valor é: %d\n", menor);
        System.out.printf("A media dos valores é: %f", media);

        sc.close();
    }

    public static void ex6(){
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[5];

        System.out.printf("Digite os valores: \n");
        for (int i = 0; i<5;i++){
            valores[i] = sc.nextInt();
        }

        int maior = valores[0];
        int menor = valores[0];
        int soma = valores[0];
        int indiceMaior = 0;
        int indiceMenor = 0;

        for (int i = 1; i<5; i++){

            if(valores[i] > maior){
                maior = valores[i];
                indiceMaior = i;
            }
            if(valores[i] < menor){
                menor = valores[i];
                indiceMenor = i;
            }
            soma += valores[i];
        }

        double media = (double) soma/5;

        System.out.printf("Os valores lidos são: \n");
        for (int i = 0; i < 5; i++){
            System.out.println(valores[i]);
        }
        System.out.printf("O maior valor é: %d e seu índice é: %d\n", maior, indiceMaior);
        System.out.printf("O menor valor é: %d e seu indice é: %d\n", menor,indiceMenor);
        System.out.printf("A media dos valores é: %.2f", media);

        sc.close();
    }

    public static void ex7(){
        Scanner sc = new Scanner(System.in);
        int[] notas = new int[5];

        System.out.print("Digite as 5 notas: \n");

        for(int i = 0; i<5; i++){
            notas[i] = sc.nextInt();
        }
        int maiorNota = notas[0];

        for(int i = 0; i<5; i++){
            maiorNota = notas[i];
        }

        for(int i = 0; i<5; i++){
            notas[i] = (notas[i]/maiorNota)*100;
        }

        System.out.print("Notas normalizadas: \n");

        for(int i = 0; i<5; i++){
            System.out.println("Aluno" + (i+1) + ":" + notas[i]);
        }
        sc.close();
    }

    public static void ex8(){
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[5];

        System.out.print("Digite um valor: \n");
        for(int i = 0; i<5; i++){
            valores[i] = sc.nextInt();
        }

        float media;
        int soma = valores[0];
        float variancia = valores[0];
        float desvio;

        for(int i = 0; i<5; i++){
            soma += valores[i];
        }
        media = soma/5;

        for(int i = 0;i<5;i++){
            variancia = ((valores[i] - media)*(valores[i] - media))/5;
        }
        desvio = (float) Math.sqrt(variancia);

        System.out.printf("A média é: %.2f e o desvio padrão é: %.2f\n", media, desvio);
        sc.close();
    }

    public static void ex9(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o numero de alunos:");
        int alunos = sc.nextInt();

        if(alunos > 100){
            System.out.println("Erro! Numero de alunos maior que o limite.");
        }

        for(int i = 0; i<alunos; i++){
            System.out.printf("Digite a nota do aluno %d: \n", (i+1));
        }

        int[] notas = new int[alunos];

        for(int i = 0; i<alunos; i++){
            notas[i] = sc.nextInt();
        }

        System.out.println("Relatório de notas: ");
        for(int i = 0; i<alunos; i++){
            System.out.println("A nota do aluno" + (i+1) + ":" + notas[i]);
        }
        sc.close();
    }

    public static void ex10(){
        Scanner sc = new Scanner(System.in);
        int[] vetA = new int[3];
        int[] vetB = new int[3];
        int[] vetC = new int[3];

        System.out.println("Digite 3 numeros inteiros: ");
        for(int i = 0; i<3; i++){
            vetA[i] = sc.nextInt();
        }
        System.out.println("Digite mais 3 numeros inteiros: ");
        for(int i = 0; i<3; i++){
            vetB[i] = sc.nextInt();
        }

        for(int i = 0; i<3; i++){
            vetC[i] = vetA[i] - vetB[i];
        }
        System.out.println("O vetor C é: ");
        for(int i = 0; i<3; i++){
            System.out.println(vetC[i]);
        }
        sc.close();
    }

    public static void ex11(){
        Scanner sc = new Scanner(System.in);

        int[] v = new int[5];
        int[] v1 = new int[5];
        int[] v2 = new int[5];

        for(int i = 0; i<5; i++){
            System.out.println("Digite o numero" + (i+1) + ":");
            v[i] = sc.nextInt();
            if(v[i] % 2 == 0){
                v2[i] = v[i];
            }
            else{
                v1[i] = v[i];
            }
        }
        System.out.println("Elementos utilizados do vetor v1:");
        for(int i = 0; i<5; i++){
            if(v1[i] != 0){
                System.out.println(v1[i]);
            }
        }
        System.out.println("Elementos utilizados do vetor v2:");
        for(int i = 0; i<5; i++){
            if(v2[i] != 0){
                System.out.println(v2[i]);
            }
        }
        sc.close();
    }

    public static void ex12(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de bolas azuis: ");
        int bolasAzuis = sc.nextInt();
        System.out.println("Digite a quantidade de bolas verdes: ");
        int bolasVerdes = sc.nextInt();
        System.out.println("Digite a quantidade de bolas amarelas: ");
        int bolasAmarelas = sc.nextInt();
        System.out.println("Digite a quantidade de bolas vermelhas: ");
        int bolasVermelhas = sc.nextInt();

        int bolasTotais = bolasAzuis + bolasVerdes + bolasAmarelas + bolasVermelhas;

        float probAzul = (float) bolasAzuis/bolasTotais;
        float probVerde = (float) bolasVerdes/bolasTotais;
        float probAmarela = (float) bolasAmarelas/bolasTotais;
        float probVermelha = (float) bolasVermelhas/bolasTotais;

        System.out.println("Probabilidade de ocorrencia de cada cor: ");
        System.out.printf("Azul: %.2f\n", probAzul);
        System.out.printf("Verde: %.2f\n", probVerde);
        System.out.printf("Amarela: %.2f\n", probAmarela);
        System.out.printf("Vermelha: %.2f\n", probVermelha);

        if(probAzul >= probVerde && probAzul >= probAmarela && probAzul >= probVermelha){
            System.out.printf("A maior probabilidade é a azul: %.2f\n", probAzul);
        }
        else if(probVerde >= probAmarela && probVerde >= probVermelha){
            System.out.printf("A maior probabilidade é a verde: %.2f\n", probVerde);
        }
        else if(probAmarela >= probVermelha){
            System.out.printf("A maior probabilidade é a amarela: %.2f\n", probAmarela);
        }
        else{
            System.out.printf("A maior probabilidade é a vermelha: %.2f\n", probVermelha);
        }
        sc.close();
    }

    public static void ex13(){
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];

        System.out.println("Digite 5 valores: ");
        for(int i = 0; i<5; i++){
            v[i] = sc.nextInt();
        }

        for(int i = 0; i<5; i++){
            if(v[i] < 0){
                v[i] = 0;
            }
        }
        System.out.println("O vetor final é: ");
        for(int i = 0; i<5; i++){
            System.out.println(v[i]);
        }
        sc.close();
    }

    public static void ex14(){
        Scanner sc = new Scanner(System.in);
        int[] matricula = new int[10];
        String[] classe_social = new String[1];
        float[] cra = new float[10];


        System.out.println("Digite a quantidade de alunos cadastrados: ");
        int alunos_cadastrados = sc.nextInt();

        for(int i = 0; i< alunos_cadastrados; i++){
            if(alunos_cadastrados > 10000){
                System.out.println("Erro! Limite máximo de alunos ultrapassado.");
            }
        }

        for(int i = 0; i<alunos_cadastrados; i++){
            System.out.println("Digite a matricula do aluno" + (i+1) + ":");
            matricula[i] = sc.nextInt();
            System.out.println("Digite a classe social do aluno" + (i+1) + ":");
            classe_social[i] = sc.next();
            System.out.println("Digite o cra do aluno" + (i+1) + ":");
            cra[i] = sc.nextFloat();
        }

        for(int i = 0; i<alunos_cadastrados; i++){
            System.out.printf("Alunos cadastrados: %d %s %.2f\n", matricula[i], classe_social[i], cra[i]);
        }
        sc.close();
    }

    public static void ex15(){
        Scanner sc = new Scanner(System.in);
        int[] v = new int[8];

        System.out.println("Digite 8 numeros inteiros: ");
        for(int i = 0; i<8; i++){
            v[i] = sc.nextInt();
        }
        int[] qnt_repeticoes = new int[8];
        boolean valor_igual = false;

        System.out.println("Valores iguais: ");
        for(int i = 0; i<8; i++){
            for(int j = 0; j<8; j++){
                if(v[i] == v[j]){
                    System.out.println(v[i]);
                    valor_igual = true;
                }
            }
        }
        if(!valor_igual){
            System.out.println("O vetor nao possui valores iguais");
        }
        sc.close();
    }

    public static void main (String[] args){
        ex15();
    }
}
