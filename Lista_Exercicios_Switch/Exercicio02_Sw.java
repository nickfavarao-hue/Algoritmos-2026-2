// Nome: Henrique de Oliveira Favarão - RA: 12526211995
// Exercício 2: Faça um algoritmo que leia um inteiro entre 1 e 12;
// imprima o nome do mês por extenso.

import java.util.Scanner;

public class Exercicio02_Sw {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 12: ");
        int numero = entrada.nextInt();

        switch (numero) {
            case 1:
                System.out.println("O número equivale ao mês de janeiro.");
                break;
            case 2:
                System.out.println("O número equivale ao mês de fevereiro.");
                break;
            case 3:
                System.out.println("O número equivale ao mês de março.");
                break;
            case 4:
                System.out.println("O número equivale ao mês de abril.");
                break;
            case 5:
                System.out.println("O número equivale ao mês de maio.");
                break;
            case 6:
                System.out.println("O número equivale ao mês de junho");
                break;
            case 7:
                System.out.println("O número equivale ao mês de julho.");
                break;
            case 8:
                System.out.println("O número equivale ao mês de agosto");
                break;
            case 9:
                System.out.println("O número equivale ao mês de setembro.");
                break;
            case 10:
                System.out.println("O número equivale ao mês de outubro.");
                break;
            case 11:
                System.out.println("O número equivale ao mês de novembro.");
                break;
            case 12:
                System.out.println("O número equivale ao mês de dezembro.");
                break;

            default:
                System.out.println("O número não equivale a nenhum mês.");
        }
        entrada.close();
    }
}
