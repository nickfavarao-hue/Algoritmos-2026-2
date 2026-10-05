// Nome: Henrique de Oliveira Favarão - RA: 12526211995
// Exercício 9: A prefeitura do Rio de Janeiro abriu uma linha de crédito
// para os funcionários estatuários. O valor máximo da prestação não poderá ultrapassar 30% do salário bruto.
// Fazer um algoritmo que leia o salário bruto e o valor da prestação e informar se o
// empréstimo pode ou não ser concedido. Exemplo:
// Salário bruto: 1200,00
// Valor da prestação: 400,00
// Empréstimo não pode ser concedido!

import java.util.Scanner;

public class Exercicio9_Ifelse {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu salário bruto: ");
        double salario = entrada.nextDouble();

        System.out.println("Digite o valor da prestação: ");
        double prestacao = entrada.nextDouble();

        if(prestacao<=(salario*0.3)){
            System.out.println("O empréstimo pode ser concedido!");
        }
        else{
            System.out.println("O empréstimo não pode ser concedido!");
        }
        entrada.close();
    }
}
