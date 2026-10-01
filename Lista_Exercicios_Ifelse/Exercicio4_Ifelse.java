// Nome: Henrique de Oliveira Favarão - RA: 12526211995
// Exercício 4: Ler dois números (ponto flutuante) e apresentá-los em ordem decrescente.
// supor que não sejam iguais.

import java.util.Scanner;

public class Exercicio4_Ifelse {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double x = entrada.nextDouble();

        System.out.println("Digite outro número: ");
        double y = entrada.nextDouble();

        if (x > y) {
            System.out.println("Os números digitados em ordem decrescente são: " + x + "; " + y);
        }
        
        else{
            System.out.println("Os números digitados em ordem decrescente são: " + y + "; " + x);
        }
        entrada.close();
    }
}
