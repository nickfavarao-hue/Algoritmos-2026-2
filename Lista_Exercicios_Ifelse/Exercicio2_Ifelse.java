// Nome: Henrique de Oliveira Favarão - RA: 12526211995
// Exercício 2: Faça um algoritmo que receba a idade de uma pessoa;
// sefor maior de idade imprima: “maior de idade”;
// senão imprima: “menor de idade”.

import java.util.Scanner;

public class Exercicio2_Ifelse {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade: ");

        int idade = entrada.nextInt();
        if (idade >= 18) {
            System.out.println("Maior de idade.");
        }
        
        else {
            System.out.println("Menor de idade.");
        }
        entrada.close();
    }
}
