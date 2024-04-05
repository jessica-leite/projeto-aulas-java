import java.util.ArrayList;
import java.util.Scanner;

public class Aula1803 {
    public static void listaTarefas(){
        //Você foi contratado para desenvolver um programa que irá gerenciar uma lista de tarefas diárias de um usuário.
        // O programa deve permitir ao usuário adicionar novas tarefas, remover tarefas existentes, listar todas as tarefas pendentes.
        //1 - O programa deve usar um array para armazenar as tarefas do usuário.
        //2 - O usuário deve ser capaz de adicionar uma nova tarefa à lista
        //3 - O usuário deve ser capaz de remover uma tarefa existente da lista.
        //4 - O programa deve exibir todas as tarefas na lista
        //Crie um Menu para o usuário escolher a opção desejada e ele quando realizar a operação o sistema deve retornar ao menu principal

        System.out.println("==== Lista de tarefas ====");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        int opcao = 0;
        while (opcao != 4){
            System.out.println("\nEscolha a operação que deseja fazer: \n1 - Adicionar \n2 - Remover \n3 - Listar \n4 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Digite a tarefa que deseja adicionar: ");
                    tarefas.add(scanner.nextLine());
                    System.out.println("Tarefa adicionada!");
                    break;
                case 2:
                    System.out.println("Digite o número da tarefa que deseja remover: ");
                    for(String tarefa : tarefas){
                        System.out.println((tarefas.indexOf(tarefa) + 1) + " - " + tarefa);
                    }
                    tarefas.remove(scanner.nextInt() - 1);
                    System.out.println("Tarefa removida!");
                    break;
                case 3:
                    System.out.println("Lista de tarefas: ");
                    for(String tarefa : tarefas){
                        System.out.println((tarefas.indexOf(tarefa) + 1) + " - " + tarefa);
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

    }

    //com o equalsIgnoreCase ignora diferença minúsculas e maiúsculas
    //.toUpperCase() .toLowerCase()
    //System.out.println("Nomes "+ nomes);
    //        nomes1.addAll(nomes);
    //        System.out.println("Nomes1 "+ nomes1);
    //coloquei assim e dá para ver os dois
}
