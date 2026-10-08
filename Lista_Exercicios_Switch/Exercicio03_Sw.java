// Nome: Henrique de Oliveira Favarão - RA: 12526211995
// Exercício 3: Faça um algoritmo que leia o período em que um aluno estuda:
// M - Matutino;
// V - Vespertino;
// N - Noturno.
// Escreva uma das opções a seguir:
// Opção | Saudação
//   M   | bom dia
//   V   | boa tarde
//   N   | boa noite

import java.util.Scanner;

public class Exercicio03_Sw {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o período em que você estuda: M - Matutino; V - Vespertino; N - Noturno.");
        String periodo = entrada.next().toUpperCase(); // perguntar pro guilherme se pode deixar assim, pois se não digitar só a letra, mas tiver m v ou n, ele dá a mensagem

        switch (periodo) {
            case "M":
                System.out.println("Bom dia!");
                break;
            case "V":
                System.out.println("Boa tarde!");
                break;
            case "N":
                System.out.println("Boa noite!");
                break;

            default:
                System.out.println("O que você digitou não corresponde a nenhum período.");
        }
        entrada.close();
    }
}
