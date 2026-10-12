// Nome: Henrique de Oliveira Favarão - RA: 12526211995
// Exercício 9: Dado o cardápio de uma
// lanchonete:
// Código | Produto          | Preço
//  100   | Cachorro Quente  | R$ 1,20
//  101   | Bauru Simples    | R$ 1,30
//  102   | Bauru com ovo    | R$ 1,50
//  103   | Hambúrguer       | R$ 1,20
//  104   | Cheeseburguer    | R$ 1,30
//  105   | Refrigerante     | R$ 1,00
// - Faça um algoritmo que leia o código do produto e a quantidade que o cliente deseja comprar.
// - O cliente pode comprar mais de um produto, pergunte se ele deseja continuar comprando.
// - Calcule o valor total a ser pago por cada produto e o valor total da compra.

import java.util.Scanner;

public class Exercicio09_Wh {

    public static void main(String[] args) {
        System.out.println("Cárdapio da Lanchonete");
        System.out.println("Código | Produto         | Preço");
        System.out.println("100    | Cachorro Quente | R$ 1,20");
        System.out.println("101    | Bauru Simples   | R$ 1,30");
        System.out.println("102    | Bauru com ovo   | R$ 1,50");
        System.out.println("103    | Hambúrguer      | R$ 1,20");
        System.out.println("104    | Cheeseburguer   | R$ 1,30");
        System.out.println("105    | Refrigerante    | R$ 1,00");
        String codigo;
        int quantidade;
        char querMais;
        double valorItem;
        double valorTotal = 0;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("\n\nDigite o código do produto: ");
            codigo = entrada.next();
            System.out.println("\nDigite a quantidade que deseja do produto: ");
            quantidade = entrada.nextInt();
            switch (codigo) {
                case "100":
                    valorItem = 1.2 * quantidade;
                    System.out.printf("%nCachorro Quente - Subtotal: R$%.2f.%n", valorItem);
                    valorTotal = valorTotal + valorItem;
                    break;
                case "101":
                    valorItem = 1.3 * quantidade;
                    System.out.printf("%nBauru Simples - Subtotal: R$%.2f.%n", valorItem);
                    valorTotal = valorTotal + valorItem;
                    break;
                case "102":
                    valorItem = 1.5 * quantidade;
                    System.out.printf("%nBauru com ovo - Subtotal: R$%.2f.%n", valorItem);
                    valorTotal = valorTotal + valorItem;
                    break;
                case "103":
                    valorItem = 1.2 * quantidade;
                    System.out.printf("%nHambúrguer - Subtotal: R$%.2f.%n", valorItem);
                    valorTotal = valorTotal + valorItem;
                    break;
                case "104":
                    valorItem = 1.3 * quantidade;
                    System.out.printf("%nCheeseburguer - Subtotal: R$%.2f.%n", valorItem);
                    valorTotal = valorTotal + valorItem;
                    break;
                case "105":
                    valorItem = 1.0 * quantidade;
                    System.out.printf("%nRefrigerante - Subtotal: R$%.2f.%n", valorItem);
                    valorTotal = valorTotal + valorItem;
                    break;

                default:
                    System.out.println("O código digitado não corresponde a nenhum produto disponível.");

            }
            do {
                System.out.println("\nVocê quer comprar mais algum produto (S/N)? ");
                querMais = entrada.next().toUpperCase().charAt(0);

                if (querMais != 'S' && querMais != 'N') {
                    System.out.println("Resposta inválida! Digite apenas S ou N.");
                }

            } while (querMais != 'S' && querMais != 'N');

        } while (querMais == 'S');

        System.out.printf("%nValor total a ser pago: R$%.2f.%n", valorTotal);
        entrada.close();
    }
}
