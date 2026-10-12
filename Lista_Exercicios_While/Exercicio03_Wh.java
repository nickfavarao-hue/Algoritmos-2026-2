// Nome: Henrique de Oliveira Favarão - RA: 12526211995
// Exercício 3: Construir um algoritmo que leia um número inteiro e imprime a
// sequência:
// – 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024...
// – enquanto o valor da sequência for menor ou igual ao número lido.

import java.util.Scanner;

public class Exercicio03_Wh {

    public static void main(String[] args) {

        int limite;
        int sequencia = 1;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        limite = entrada.nextInt();

        while (sequencia <= limite) {

            System.out.println(sequencia + " ");
            sequencia = sequencia * 2;
        }
        entrada.close();
    }
}
