// Nome: Henrique de Oliveira Favarão - RA: 12526211995
// Exercício 3: Ler dois valores inteiros, e, se forem iguais, mostrar “Números iguais”;
// caso contrário, apresentar a diferença do maior pelo menor.

import java.util.Scanner;

public class Exercicio03_Ifelse {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int x = entrada.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int y = entrada.nextInt();
        

        if (x == y) {
            System.out.println("Números iguais.");
        }
        
        else if (x > y) {
            int diferenca = x-y;
            System.out.println("Os números não são iguais, e a diferença do maior pelo menor é " + diferenca + ".");
        }
        
        else {
            int diferenca = y-x;
            System.out.println("Os números não são iguais, e a diferença do maior pelo menor é " + diferenca + ".");
        }
        entrada.close();
    }
}
