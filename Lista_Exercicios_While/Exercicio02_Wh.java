// Nome: Henrique de Oliveira Favarão - RA: 12526211995
// Exercício 2: Faça um algoritmo que leia 10
// números inteiros e diga:
// – quantos são pares;
// – e quantos são ímpares.

import java.util.Scanner;

public class Exercicio02_Wh {

    public static void main(String[] args) {
        int contador = 0;
        int pares = 0;
        int impares = 0;
        int numero, resto;

        Scanner entrada = new Scanner(System.in);

        while (contador < 10) {
            contador++;
            System.out.println("Digite um número: ");
            numero = entrada.nextInt();
            resto = numero % 2;

            if (resto == 0) {
                pares++;

            }
            else {
                impares++;
            }
        }
        System.out.println("O total de pares é: " + pares + ".");
        System.out.println("O total de ímpares é: " + impares + ".");
        entrada.close();
    }
}
