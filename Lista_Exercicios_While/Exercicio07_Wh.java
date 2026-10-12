// Nome: Henrique de Oliveira Favarão - RA: 12526211995
// Exercício 7: O IMC (índice de Massa Corporal) é uma medida do grau de obesidade de uma pessoa.
// - Faça um algoritmo que leia a altura e o peso de 10 pessoas.
// - Calcular o IMC de cada pessoa e verificar quantas pessoas estão com o IMC entre 18,5 e 24,9 que é considerado sem obesidade.
// IMC = peso / altura²

import java.util.Scanner;

public class Exercicio07_Wh {

    public static void main(String[] args) {
        double altura, peso;
        int contador = 0;
        int semObesidade = 0;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Digite sua altura: ");
            altura = entrada.nextDouble();
            System.out.println("Digite seu peso: ");
            peso = entrada.nextDouble();
            double imc = peso / Math.pow(altura, 2);
            contador++;
            if(imc>=18.5 && imc<=24.9){
               semObesidade++;
            }
        } 
        while (contador < 10);
        System.out.println(semObesidade + " pessoas estão com o IMC entre 18,5 e 24,9, que é considerado sem obesidade.");
        entrada.close();
    }
}
