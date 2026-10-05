// Nome: Henrique de Oliveira Favarão - RA: 12526211995
// Exercício 10: Faça um algoritmo para encontrar o maior número entre 3 números inteiros.
// O algoritmo deve ler três inteiros:
// se forem todos iguais, imprimir: “os números são iguais”;
// caso contrário, imprimir o maior dos 3 números.

import java.util.Scanner;

public class Exercicio10_Ifelse {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n1 = entrada.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int n2 = entrada.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int n3 = entrada.nextInt();
        
        if(n1==n2 && n1==n3){
            System.out.println("Os números são iguais.");
        }
        else if(n1>=n2 && n1>=n3){
            System.out.println("O maior dos 3 números é o " + n1 +".");
        }
        else if (n2>=n1 && n2>=n3){
            System.out.println("O maior dos 3 números é o " + n2 +".");
        }
        else{
            System.out.println("O maior dos 3 números é o " + n3 +".");
        }
        entrada.close();
    }
}
