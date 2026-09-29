// Henrique de Oliveira Favarão - 12526211995
// Crie um algoritmo que leia um número de 1 a 7.
// imprima o dia da semana correspondente;
// assuma que 1 corresponde ao Domingo.
import java.util.Scanner;

public class Exercicio1_Switch {
public static void main (String [] args){
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite um número de 1 a 7: ");
    
    int numero = entrada.nextInt();

    switch (numero) {
        case 1:
            System.out.println("Você digitou o número 1, logo, seu dia da semana é: Domingo.");
            break;
        case 2:
            System.out.println("Você digitou o número 2, logo, seu dia da semana é: Segunda.");
            break;
        case 3:
            System.out.println("Você digitou o número 3, logo, seu dia da semana é: Terça.");
            break;
        case 4:
            System.out.println("Você digitou o número 4, logo, seu dia da semana é: Quarta.");
            break;
        case 5:
            System.out.println("Você digitou o número 5, logo, seu dia da semana é: Quinta.");
            break;
        case 6:
            System.out.println("Você digitou o número 6, logo, seu dia da semana é: Sexta.");
            break;    
        case 7:
            System.out.println("Você digitou o número 7, logo, seu dia da semana é: Sábado.");
            break;
        default:
            System.out.println("O número digitado por você não corresponde a nenhum dia da semana.");
            
    }
    entrada.close();
    
}
}
