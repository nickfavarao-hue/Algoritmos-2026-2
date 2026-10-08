// Nome: Henrique de Oliveira Favarão - RA: 12526211995
// Exercício 5: Faça um algoritmo que receba dois números;
// – execute as operações listadas a seguir ...
// – de acordo com a escolha do usuário.
// Opção | Mensagem
//   M   | média entre os números digitados
//   S   | diferença do maior pelo menor
//   P   | produto entre os números digitados
//   D   | divisão do primeiro pelo segundo

import java.util.Scanner;

public class Exercicio05_Sw {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double num1 = entrada.nextDouble();

        System.out.println("\nDigite outro número: ");
        double num2 = entrada.nextDouble();

        System.out.println("\nOperações disponíveis: \n[M] média entre os números digitados\n[S] diferença do maior pelo menor\n[P] produto entre os números digitados\n[D] divisão do primeiro pelo segundo");
        System.out.println("\nDigite uma das operações desejadas (M, S, P ou D): ");
        String operacao = entrada.next().toUpperCase();

        switch (operacao){
            case "M":
                double media = (num1+num2)/2;
                System.out.println("A média entre os números digitados é igual a " + media + ".");
                break;
            case "S":
                if (num1>num2){
                    double diferenca = num1 - num2;
                    System.out.println("A diferença do maior pelo menor é igual a " + diferenca + ".");
                }
                else{
                    double diferenca = num2 - num1;
                    System.out.println("A diferença do maior pelo menor é igual a " + diferenca + ".");
                }
                break;
            case "P":
                double multiplicacao = num1*num2;
                System.out.println("O produto entre os números digitados é igual a " + multiplicacao + ".");
                break;
            case "D":
                if (num2==0){
                    System.out.println("Impossível dividir o primeiro pelo segundo.");
                }
                else{
                    double divisao = num1/num2;
                    System.out.println("A divisão do primeiro pelo segundo é igual a "+ divisao + ".");
                }
                break;

            default:
                System.out.println("O que digitou não corresponde a nenhuma operação.");
        }
        entrada.close();
    }
}
