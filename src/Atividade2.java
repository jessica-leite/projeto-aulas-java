import java.util.Scanner;

public class Atividade2 {

    public static  void verificarNumeroInteiro(){
        //5.Escreva um programa em Java que solicita ao usuário um número inteiro.
        System.out.println("Digite um número inteiro: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        // Com base nesse número, o programa deve realizar as seguintes ações:
        //1. Se o número for positivo, armazene-o em uma variável e exiba uma mensagem indicando que é positivo.
        if (numero > 0){
            System.out.println("O número " + numero + " é positivo!");
        }
        //2. Se o número for negativo, armazene o valor absoluto em uma variável e exiba uma mensagem indicando que é negativo.
        if(numero < 0){
            System.out.println("O número " + numero + " é negativo!");
        }
        //3. Utilize um bloco switch para verificar se o número é par ou ímpar. Exiba uma mensagem correspondente.
        switch (numero%2){
            case 0:
                System.out.println("O número é par!");
                break;
            case 1:
            case -1:
                System.out.println("O número é ímpar!");
                break;
        }
    }

    public static void simularPedidos() {
        //6 -Desenvolva um programa em Java para simular um sistema de pedidos de uma loja online. O programa deve:
        // 1. Solicitar ao usuário que insira o valor total de sua compra.
        System.out.print("Olá, digite o valor total de sua compra: R$ ");
        Scanner scanner = new Scanner(System.in);
        double totalCompra = scanner.nextDouble();

        //2. Com base nesse valor, aplicar descontos conforme as seguintes regras:
        //Se o valor for maior que R$ 200, aplique um desconto de 10%.
        //Se o valor estiver entre R$ 100 e R$ 200, aplique um desconto de 5%.
        //Caso contrário, não aplique desconto.
        double desconto = 0.0;
        if(totalCompra > 200){
            desconto = totalCompra * 0.1;
        } else if (totalCompra >= 100) {
            desconto = totalCompra * 0.05;
        }

        //3. Exiba o valor final a ser pago pelo usuário após o desconto.
        System.out.print("Valor final após desconto: R$ " + (totalCompra - desconto));

        //Além disso, implemente um menu utilizando um switch para permitir ao usuário escolher o método de pagamento:
        //Opção 1: Cartão de crédito
        //Opção 2: Boleto bancário
        //Opção 3: Transferência bancária
        System.out.println("\nEscolha a forma de pagamento: \n1: Cartão de crédito \n2: Boleto bancário \n3: Transferência bancária");
        int formaPagamento = scanner.nextInt();
        switch (formaPagamento){
            case 1:
                System.out.print("Você escolheu pagar com cartão de crédito.");
                break;
            case 2:
                System.out.print("Você escolheu pagar com boleto bancário.");
                break;
            case 3:
                System.out.print("Você escolheu pagar com transferência bancária.");
                break;
            default:
                System.out.print("Opção inválida!");
        }
    }
}
