// Nome: Henrique de Oliveira Favarão - RA: 12526211995
// Exercício 6: Faça um algoritmo que leia dez números inteiros e positivos
// – mostre o menor entre eles.

import java.util.Scanner;

public class Exercicio06_Wh {

    public static void main(String[] args) {
        int num;
        int menorNum = 0;
        int contador = 0;
        
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Digite um número inteiro positivo: ");
            num = entrada.nextInt();
            if (num >= 0) {
                contador++;

                if (contador == 1 || num < menorNum){
                    menorNum = num;
                }
            } 
            else {
                System.out.println("O número digitado não é inteiro positivo, tente novamente.");
            }
        }
        while (contador < 10);
        System.out.println("O menor dos números digitados é o " + menorNum);
        entrada.close();
    }
}
