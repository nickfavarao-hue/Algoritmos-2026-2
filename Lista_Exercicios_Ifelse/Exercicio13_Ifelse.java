// Nome: Henrique de Oliveira Favarão - RA: 12526211995
// Exercício 13: Criar uma calculadora de operações básicas:
// soma, subtração, multiplicação e divisão.
// o algoritmo deve ler dois números e o sinal correspondente à operação desejada;
// utilize o tipo char para ler a operação;
// no final deve ser impresso o resultado.
// Restrições: 
// - se o sinal digitado não corresponder a uma operação...
// apresentar a mensagem Sinal Inválido e finalizar.
// - para a operação de divisão verificar se o divisor é válido (maior que zero)!
// caso seja menor ou igual a zero, informar a mensagem "Impossível dividir!!"

import java.util.Scanner;

public class Exercicio13_Ifelse {

    public static void main(String[] args) {
        System.out.println("-----Calculadora de Operações Básicas-----");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double x = entrada.nextDouble();

        System.out.println("Digite outro número: ");
        double y = entrada.nextDouble();

        System.out.println("Operações: [+] Soma  [-] Subtração  [*] Multiplicação  [/] Divisão");
        System.out.print("Digite o sinal correspondente: ");
        char sinal = entrada.next().charAt(0);

        if(sinal == '+'){
            double soma = x+y;
            System.out.println("A soma dos dois números é igual a: "+ soma +".");
        }
        else if(sinal == '-'){
            double subtracao = x-y;
            System.out.println("A subtração dos dois números é igual a: "+ subtracao +".");
        }
        else if(sinal == '*'){
            double multiplicacao = x*y;
            System.out.println("A multiplicação dos dois números é igual a: "+ multiplicacao +".");
        }
        else if(sinal == '/'){
            if(y<=0){
                System.out.println("Impossível dividir!");
            }
            else{
                double divisao = x/y;
                System.out.println("A divisão dos dois números é igual a: " + divisao +".");
            }
            
        }
        else{
            System.out.println("Sinal inválido.");
        }
        entrada.close();
    }
}
