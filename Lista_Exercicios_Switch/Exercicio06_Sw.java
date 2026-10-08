// Nome: Henrique de Oliveira Favarão - RA: 12526211995
// Exercício 6: Dado o cardápio de uma lanchonete:
// Faça um algoritmo que:
// – leia o código do produto e a quantidade;
// – calcule o valor a ser pago pelo cliente;
// – imprimir o valor a ser pago;
// – imprimir o nome do produto.

// Código | Produto          | Preço
//  100   | Cachorro Quente  | R$ 1,20
//  101   | Bauru Simples    | R$ 1,30
//  102   | Bauru com ovo    | R$ 1,50
//  103   | Hambúrguer       | R$ 1,20
//  104   | Cheeseburguer    | R$ 1,30
//  105   | Refrigerante     | R$ 1,00

import java.util.Scanner;

public class Exercicio06_Sw {

    public static void main(String[] args) {
        System.out.println("Cárdapio da Lanchonete\n");
        System.out.println("Código | Produto         | Preço");
        System.out.println("100    | Cachorro Quente | R$ 1,20");
        System.out.println("101    | Bauru Simples   | R$ 1,30");
        System.out.println("102    | Bauru com ovo   | R$ 1,50");
        System.out.println("103    | Hambúrguer      | R$ 1,20");
        System.out.println("104    | Cheeseburguer   | R$ 1,30");
        System.out.println("105    | Refrigerante    | R$ 1,00");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o código do produto: ");
        String codigo = entrada.next();

        System.out.println("Digite a quantidade que deseja do produto: ");
        int quantidade = entrada.nextInt();

        switch (codigo) {
            case "100":
                System.out.println("Nome do produto: Cachorro quente.");
                System.out.printf("Valor a ser pago: R$%.2f.\n", (1.2 * quantidade));
                break;
            case "101":
                System.out.println("Nome do produto: Bauru Simples.");
                System.out.printf("Valor a ser pago: R$%.2f.\n", (1.3 * quantidade));
                break;
            case "102":
                System.out.println("Nome do produto: Bauru com ovo.");
                System.out.printf("Valor a ser pago: R$%.2f.\n", (1.5 * quantidade));
                break;
            case "103":
                System.out.println("Nome do produto: Hambúrguer.");
                System.out.printf("Valor a ser pago: R$%.2f.\n", (1.2 * quantidade));
                break;
            case "104":
                System.out.println("Nome do produto: Cheeseburguer.");
                System.out.printf("Valor a ser pago: R$%.2f.\n", (1.3 * quantidade));
                break;
            case "105":
                System.out.println("Nome do produto: Refrigerante.");
                System.out.printf("Valor a ser pago: R$%.2f.\n", (1.0 * quantidade));
                break;

            default:
                System.out.println("O código digitado não corresponde a nenhum produto disponível.");
        }
        entrada.close();
    }
}
