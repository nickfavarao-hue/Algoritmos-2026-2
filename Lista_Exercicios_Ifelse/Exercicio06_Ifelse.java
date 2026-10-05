// Nome: Henrique de Oliveira Favarão - RA: 12526211995
// Exercício 6: Faça um algoritmo que leia a altura e o sexo de uma pessoa: – calcule e mostre seu peso ideal. 
// – usar as formulas a seguir para calcular o peso ideal:
// para o sexo masculino: (72,7 x altura) - 58 
// para o sexo feminino: (62,1 x altura) - 44,7

import java.util.Scanner;

public class Exercicio06_Ifelse {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        double altura = entrada.nextDouble();

        System.out.println("Digite seu sexo (masculino ou feminino): ");
        String sexo = entrada.next();

        if (sexo.equalsIgnoreCase("masculino")){
            double pesoM = (72.7 * altura)-58;
            System.out.printf("Seu peso ideal é: %.2fkg.\n", pesoM);
        }
        else{
            double pesoF = (62.1 * altura)-44.7;
            System.out.printf("Seu peso ideal é: %.2fkg.\n", pesoF);
        }
        entrada.close();
    }

}
