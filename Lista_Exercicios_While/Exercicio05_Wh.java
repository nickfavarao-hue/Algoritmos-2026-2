// Nome: Henrique de Oliveira Favarão - RA: 12526211995
// Exercício 5: Faça um algoritmo que imprima a tabuada do 5.

public class Exercicio05_Wh {

    public static void main(String[] args) {
        int num = 1;
        do {
            int mult = num * 5;
            System.out.println("5 x "+num + " = "+ mult);
            num++;
        }
        while (num<=10);
    }
}
