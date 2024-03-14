import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Atividade3 {

    public static void adivinharNumero(){
        //8 - Implemente um jogo no qual o programa escolhe um número aleatório entre 1 e 100, e o jogador deve tentar adivinhá-lo.
        // O programa deve fornecer dicas do tipo "maior" ou "menor" conforme necessário.
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = (int)(Math.random() * 10 + 1);
        int numeroEscolhido = 0;
        System.out.println("Tente adivinhar o número sorteado!");

        while (numeroAleatorio != numeroEscolhido){
            System.out.println("Digite seu palpite: ");
            numeroEscolhido = scanner.nextInt();
            if(numeroAleatorio > numeroEscolhido){
                System.out.println("Tente um número maior!");
            } else if (numeroAleatorio < numeroEscolhido) {
                System.out.println("Tente um número menor!");
            }
        }
        System.out.println("Parabéns, você acertou!");
    }
    public static void converterTemperatura(){
        System.out.println("Olá! ");
        //9 -  Escreva um programa que converta a temperatura de Celsius para Fahrenheit ou vice-versa,
        // solicitando ao usuário qual conversão deseja fazer.
        // O programa deve continuar executando até que o usuário decida sair.
        Scanner scanner = new Scanner(System.in);
        int continuar = 1;
        while (continuar == 1){
            System.out.println("Digite a temperatura: ");
            double temperatura = scanner.nextDouble();
            System.out.println("Qual conversão deseja fazer? \n 1 - Para Celsius \n 2 - Para Fahrenheit");
            int conversao = scanner.nextInt();
            double temperaturaConvertida = 0;
            if (conversao == 1){
                temperaturaConvertida = (temperatura - 32) * 5/9;
            } else {
                temperaturaConvertida = (temperatura * 9/5) + 32;
            }
            System.out.println("Temperatura convertida: " + temperaturaConvertida);
            System.out.println("Deseja fazer mais alguma conversão? \n1 - sim \n2 - não");
            continuar = scanner.nextInt();
        }
    }
    public static void listaCompras(){
        //10 - Desenvolva um programa que permita ao usuário inserir itens em uma lista de compras.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Olá! ");
        int adicionarItem = 1;
        String listaCompras = "";
        String separador = "";
        while(adicionarItem == 1){
            System.out.println("Digite o item que deseja inserir na lista de compras: ");
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
