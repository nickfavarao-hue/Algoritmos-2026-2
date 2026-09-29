import java.util.Scanner;

public class ExemploCadastro {
public static void main (String [] args){
    Scanner entrada = new Scanner(System.in);

    System.out.println("======Menu de opções======");
    System.out.println("Opção 1. Cadastrar Produtos");
    System.out.println("Opção 2. Listar Produtos");
    System.out.println("Opção 3. Sair do Sistema");
    System.out.println("======Escolha uma opção======");

    int menu = entrada.nextInt();

    switch (menu) {
        case 1:
            System.out.println("Você escolheu a opção 1, que é cadastrar produtos.");
            break;
        case 2:
            System.out.println("Você escolheu a opção 2, que é listar produtos.");
            break;
        case 3:
            System.out.println("Você escolheu a opção 3, que é sair do sistema.");
            break;
        default:
            System.out.println("Item de menu inválido.");
            
    }
    entrada.close();
    
}
}
