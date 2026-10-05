// Nome: Henrique de Oliveira Favarão - RA: 12526211995
// Exercício 11: Faça um algoritmo que receba a idade de um nadador e
// imprima a sua categoria seguindo as regras:
// Categoria | Idade
// infantilA | 5-7 anos
// infantilB | 8-10 anos
// juvenilA  | 11-13 anos
// juvenilB  | 14-17 anos
// sênior    | 18 anos ou mais

import java.util.Scanner;

public class Exercicio11_Ifelse {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        if(idade>=5 && idade<=7){
            System.out.println("Sua categoria: infantilA.");
        }
        else if(idade>=8 && idade<=10){
            System.out.println("Sua categoria: infantilB.");
        }
        else if(idade>=11 && idade<=13){
            System.out.println("Sua categoria: juvenilA.");
        }
        else if(idade>=14 && idade<=17){
            System.out.println("Sua categoria: juvenilB.");
        }
        else if(idade>=18){
            System.out.println("Sua categoria: sênior.");
        }
        else{
            System.out.println("Sua idade não é compatível com nenhuma categoria.");
       }
       entrada.close();
    }
}
