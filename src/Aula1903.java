import java.util.ArrayList;
import java.util.Scanner;

public class Aula1903 {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<String> tarefas = new ArrayList<>();


    public static void listaTarefas(){
        //Você foi contratado para desenvolver um programa que irá gerenciar uma lista de tarefas diárias de um usuário.
        // O programa deve permitir ao usuário adicionar novas tarefas, remover tarefas existentes, listar todas as tarefas pendentes.
        //1 - O programa deve usar um array para armazenar as tarefas do usuário.
        //2 - O usuário deve ser capaz de adicionar uma nova tarefa à lista
        //3 - O usuário deve ser capaz de remover uma tarefa existente da lista.
        //4 - O programa deve exibir todas as tarefas na lista
        //Crie um Menu para o usuário escolher a opção desejada e ele quando realizar a operação o sistema deve retornar ao menu principal

        System.out.println("==== Lista de tarefas ====");
        int opcao = 0;
        while (opcao != 4){
            System.out.println("\nEscolha a operação que deseja fazer: \n1 - Adicionar \n2 - Remover \n3 - Listar \n4 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case 1:
                    adicionarTarefa();
                    break;
                case 2:
                    removerTarefa();
                    break;
                case 3:
                    listarTarefas();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
    public static void adicionarTarefa(){
        System.out.println("Digite a tarefa que deseja adicionar: ");
        tarefas.add(scanner.nextLine());
        System.out.println("Tarefa adicionada!");
    }

    public static void removerTarefa(){
        System.out.println("Digite o número da tarefa que deseja remover: ");
        listarTarefas();
        tarefas.remove(scanner.nextInt() - 1);
        System.out.println("Tarefa removida!");
    }

    public static void listarTarefas(){
        System.out.println("Lista de tarefas: ");
        for(String tarefa : tarefas){
            System.out.println((tarefas.indexOf(tarefa) + 1) + " - " + tarefa);
        }
    }
}
