// Nome: Henrique de Oliveira Favarão - RA: 12526211995
// Exercício 8: Faça um programa que:
// – leia duas notas de 5 alunos
// – Calcule e mostre a média aritmética de cada um deles;
// - Para cada nota lida:
// – A entrada de cada nota deve ser validada!
// ou seja, o programa somente avança se a entrada da nota estiver entre 0 e 10.
// caso contrário, solicite-a novamente.
// – Utilize o do...while para validar as notas.

import java.util.Scanner;

public class Exercicio08_Wh {

    public static void main(String[] args) {
        double nota1, nota2;
        int contador = 0;
        Scanner entrada = new Scanner(System.in);

        while (contador < 5) {
            do {
                System.out.println("Digite sua primeira nota: ");
                nota1 = entrada.nextDouble();
                if (nota1 >= 0 && nota1 <= 10) {
                    System.out.println("Nota válida.\n");
                } else {
                    System.out.println("Nota inválida, digite novamente.\n");
                }
            } while (nota1 < 0 || nota1 > 10);

            do {
                System.out.println("Digite sua segunda nota: ");
                nota2 = entrada.nextDouble();
                if (nota2 >= 0 && nota2 <= 10) {
                    System.out.println("Nota válida.\n");
                } else {
                    System.out.println("Nota inválida, digite novamente.\n");
                }
            } while (nota2 < 0 || nota2 > 10);
            System.out.printf("Média aritmética: %.2f%n%n", (nota1 + nota2) / 2);
            contador++;
        }
        entrada.close();

    }
}
