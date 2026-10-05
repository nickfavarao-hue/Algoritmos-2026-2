// Nome: Henrique de Oliveira Favarão - RA: 12526211995
// Exercício 12: Ler o salário de uma pessoa e calcular e imprimir o desconto do
// INSS (calculado!!) de acordo com a tabela a seguir:
// <= R$600,00                | Isento
// > R$600,00 e <= R$1200,00  | 20%
// > R$1200,00 e <= R$2000,00 | 25%
// > R$2000,00                | 30%

import java.util.Scanner;

public class Exercicio12_Ifelse {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        double salario = entrada.nextDouble();

        if (salario <= 600) {
            System.out.println("Você está isento do desconto do INSS.");
        } else if (salario > 600 && salario <= 1200) {
            double desconto1 = salario * 0.2;
            System.out.printf("O desconto do INSS é igual a: R$%.2f.\n", desconto1);
        } else if (salario > 1200 && salario <= 2000) {
            double desconto2 = salario * 0.25;
            System.out.printf("O desconto do INSS é igual a: R$%.2f.\n", desconto2);
        } else {
            double desconto3 = salario * 0.3;
            System.out.printf("O desconto do INSS é igual a: R$%.2f.\n", desconto3);
        }
        entrada.close();
    }
}
