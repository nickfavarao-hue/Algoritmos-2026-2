// Nome: Henrique de Oliveira Favarão - RA: 12526211995
// Exercício 8: Faça um algoritmo que verifique a validade de uma senha fornecida pelo usuário.
// Sabendo que a senha é R10p5: imprimir mensagem de "acesso concedido" ou "acesso negado".
// • Para comparar duas Strings utilizar o método equals();
// Ele retorna um valor booleano! Exemplo:
// if(senha.equals("R10p5"))

import java.util.Scanner;

public class Exercicio08_Ifelse {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua senha: ");
        String senha = entrada.next();

        if (senha.equals("R10p5")) {
            System.out.println("Acesso concedido.");
        }
        else {
            System.out.println("Acesso negado.");
        }
        entrada.close();
    }
}
