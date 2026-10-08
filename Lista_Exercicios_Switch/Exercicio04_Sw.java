// Nome: Henrique de Oliveira Favarão - RA: 12526211995
// Exercício 4: Um funcionário receberá aumento de acordo com seu plano de trabalho.
// Faça um algoritmo que leia:
// o plano de trabalho;
// e o salário atual de um funcionário;
// Calcule e imprima o seu novo salário.
// Plano | Aumento
//   A   |   10%
//   B   |   15%
//   C   |   20%

import java.util.Scanner;

public class Exercicio04_Sw {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu plano de trabalho (A, B ou C): ");
        String plano = entrada.next().toUpperCase();

        System.out.println("Digite seu salário atual: ");
        double salario = entrada.nextDouble();

        switch (plano) {
            case "A":
                System.out.printf("Seu novo salário é: R$%.2f.\n", salario + (salario * 0.1));
                break;
            case "B":
                System.out.printf("Seu novo salário é: R$%.2f.\n", salario + (salario * 0.15));
                break;
            case "C":
                System.out.printf("Seu novo salário é: R$%.2f.\n", salario + (salario * 0.2));
                break;

            default:
                System.out.println("O que digitou não corresponde a nenhum plano.");

        }
        entrada.close();
    }
}
