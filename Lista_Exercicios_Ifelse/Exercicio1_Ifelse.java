// Nome: Henrique de Oliveira Favarão - RA: 12526211995
// Exercício 1: Faça um algoritmo que leia um número inteiro.
// Se o número for maior que 20: calcular e imprimir a metade dele.

import java.util.Scanner;
public class Exercicio1_Ifelse {

    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite um número inteiro: ");

        double numero = entrada.nextInt();
        if (numero>20){
                double metade = numero/2;
                System.out.println("A metade desse número é: " + metade);
        }
    entrada.close();
        }
}
