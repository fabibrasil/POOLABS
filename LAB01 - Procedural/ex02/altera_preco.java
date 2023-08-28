import java.util.Scanner;
public class altera_preco {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[4];
        float[] precos = new float[4];
        int[] qtd_estoque = new int[4];

        for (int i = 0; i<4; i++){
            System.out.printf("Digite o nome do produto: \n", (i + 1));
            nomes[i] = sc.next();

            System.out.printf("Informe o preço do produto: \n", (i+1));
            precos[i] = sc.nextFloat();

            System.out.printf("Informe a quantidade em estoque do produto: \n", (i+1));
            qtd_estoque[i] = sc.nextInt();
            sc.nextLine();
        }

        precos[0] = altera_preco(precos[0],10);
        precos[2] = altera_preco(precos[0],10);
        System.out.printf("Aumentando o preço dos produtos 1 e 3 em 10%: %.2f %.2f \n",precos[0],precos[2]);

        precos[1] = altera_preco(precos[1],-5);
        System.out.printf("Reduzindo o preço do produto 2 em 5%: %.2f\n", precos[1]);

        precos[3] = altera_preco(precos[3],50);
        System.out.printf("Alterando o preço do produto 4: %.2f\n", precos[3]);

        System.out.printf("Produtos cadastrados: \n");

        for (int i = 0; i<4; i++){
            System.out.printf("Produto: %s\n", nomes[i]);
            System.out.printf("Preço: %.2f\n", precos[i]);
            System.out.printf("Estoque: %d", qtd_estoque[i]);
        }
         System.out.printf("Erro.");
         sc.close();
    }

    public static float altera_preco(float precos, float porcentagem){
        float num = 1 + (porcentagem/100);
        return precos*num;
    }
        
}
