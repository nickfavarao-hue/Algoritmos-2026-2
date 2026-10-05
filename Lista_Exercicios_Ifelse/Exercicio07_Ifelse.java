// Nome: Henrique de Oliveira Favarão - RA: 12526211995
// Exercício 7: A empresa XSoftware concedeu um bônus de 20% do valor do salário a todos os funcionários 
// com tempos de trabalho na empresa igual ou superior a cinco anos e de 10% aos demais funcionários.
// Faça um algoritmo que leia o salário e a quantidade de anos de cada funcionário, calcule e imprima o valor do bônus.

import java.util.Scanner;

public class Exercicio07_Ifelse {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        double salario = entrada.nextDouble();

        System.out.println("Digite a quantidade de anos que está na empresa: ");
        int anos = entrada.nextInt();

        if(anos>=5){
            double bonus1 = salario*0.2;
            System.out.printf("O valor do bônus é igual a: R$%.2f.\n", bonus1);
        }
        else{
            double bonus2 = salario*0.1;
            System.out.printf("O valor do bônus é igual a: R$%.2f.\n", bonus2);
        }
        entrada.close();
    }
}
