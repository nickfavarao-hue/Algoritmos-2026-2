// Nome: Henrique de Oliveira Favarão - RA: 12526211995
// Desenvolver um algoritmo para definir se uma pessoa está apta a votar no Brasil.
// Pesquise: Quais são as regras para se votar no Brasil?
// Identifique quais os dados de entrada necessários para resolver o problema.
// Identifique quais regras devem ser satisfeitas para definir que uma pessoa está apta a votar.
// Faça um programa que pede as informações necessárias e verifica se uma pessoa está apta a votar.

import java.util.Scanner;

public class DesafioEleitoral {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("----- Verificador de Aptidão Eleitoral -----");

        System.out.print("Qual a sua idade? ");
        int idade = entrada.nextInt();

        System.out.print("Você está regularmente inscrito na Justiça Eleitoral (S/N)? ");
        char inscrito = entrada.next().toUpperCase().charAt(0);

        System.out.print("Você é estrangeiro (S/N)? ");
        char estrangeiro = entrada.next().toUpperCase().charAt(0);

        System.out.print("Você é conscrito em serviço militar obrigatório (S/N)? ");
        char conscrito = entrada.next().toUpperCase().charAt(0);

        System.out.print("Você está com os direitos políticos suspensos (S/N)? ");
        char direitos = entrada.next().toUpperCase().charAt(0);

        System.out.print("Você é alfabetizado (S/N)? ");
        char alfabetizado = entrada.next().toUpperCase().charAt(0);

        System.out.println("\n--- Resultado ---");


        if (idade < 0) {
            System.out.println("Idade inválida.");
        }
        else if (idade < 16) {
            System.out.println("Inapto: menores de 16 anos não podem votar.");
        } 
        else if (estrangeiro == 'S') {
            System.out.println("Inapto: estrangeiros não podem se alistar nem votar.");
        } 
        else if (conscrito == 'S') {
            System.out.println("Inapto: conscritos no serviço militar obrigatório não podem votar.");
        } 
        else if (direitos == 'S') {
            System.out.println("Inapto: direitos políticos suspensos.");
        } 
        else if (inscrito != 'S') {
            System.out.println("Inapto: é preciso estar regularmente inscrito na Justiça Eleitoral.");
        }

        else {
            System.out.println("Status: você está apto a votar.");

            if (idade >= 18 && idade <= 69 && alfabetizado == 'S') {
                System.out.println("Categoria: voto obrigatório.");
            }
            else {
                System.out.println("Categoria: voto facultativo.");
            }
        }
        entrada.close();
    }
}