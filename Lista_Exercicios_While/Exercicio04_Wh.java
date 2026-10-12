// Nome: Henrique de Oliveira Favarão - RA: 12526211995
// Exercício 4: Faça um algoritmo que imprima a metade de cada número de 10 a 20.
// – Exemplo:
// a metade de 10 é 5.0
// a metade de 11 é 5.5
// a metade de 12 é 6.0
// ...
// a metade de 18 é 9.0
// a metade de 19 é 9.5
// a metade de 20 é 10.0

public class Exercicio04_Wh {

    public static void main(String[] args) {

        int numero = 10;

        do {
            double metade = numero / 2.0;
            System.out.println("A metade de " + numero + " é " + metade);
            numero++;
        } 
        while (numero <= 20);

    }

}
