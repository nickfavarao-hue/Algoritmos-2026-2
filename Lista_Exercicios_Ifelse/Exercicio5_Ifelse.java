// Nome: Henrique de Oliveira Favarão - RA: 12526211995
// Exercício 5: Faça um algoritmo para ler um número inteiro.
// – verifique se o número está no intervalo entre 50 (inclusive) e 100 (inclusive);
// – se estiver:
// imprimir "Pertence ao intervalo";
// – senão:
// imprimir "Não pertence ao intervalo"

import java.util.Scanner;

public class Exercicio5_Ifelse {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int x = entrada.nextInt();

        if(x>=50 && x<=100){
            System.out.println("Pertence ao intervalo.");
        }
        else{
            System.out.println("Não pertence ao intervalo.");
        }
        entrada.close();
    }
}
