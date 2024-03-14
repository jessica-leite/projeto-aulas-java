import java.util.Scanner;

public class Atividade3 {

    public static void listaCompras(){
        //10 - Desenvolva um programa que permita ao usuário inserir itens em uma lista de compras.
        System.out.print("Olá! ");
        int adicionarItem = 1;
        String listaCompras = "";
        String separador = "";
        while(adicionarItem != 2){
            System.out.println("Digite o item que deseja inserir na lista de compras: ");
            Scanner scanner = new Scanner(System.in);
            listaCompras += separador + scanner.nextLine();
            separador = ", ";

            // O programa deve exibir a lista de compras atualizada após cada inserção e perguntar se o usuário deseja adicionar mais itens.
            // O programa deve continuar executando até que o usuário decida sair.
            System.out.println("Lista atualizada: " + listaCompras);
            System.out.println("Deseja adicionar mais itens? \n1 - Sim \n2 - Não");
             adicionarItem = scanner.nextInt();
        }
    }
}
