import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        aprovado_reprovado();
    }

    public static void aprovado_reprovado(){
        escreva("Digite sua nota final:");
        double nota = lerDouble();
        if(nota >= 7){
            escreva("Aprovado!");
        } else if (nota >= 6) {
            escreva("Recuperação!");
            escreva("Digite sua nota de recuperação: ");
            double nota_recuperacao = lerDouble();
            if (nota_recuperacao >= 5){
                escreva("Aprovado!");
            } else{
                escreva("Reprovado!");
            }
        } else {
            escreva("Reprovado!");
        }
    }

    public  static double lerDouble(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
    public static void escreva(String frase){
        System.out.println(frase);
    }
    public static void aula_07_03(){
        int numero  = 8;
        if(numero == 10){
            System.out.println("O valor é igual a 10!");
        }else{
            System.out.println("O valor é diferente de 10");
        }


        Scanner leitura = new Scanner(System.in);
        System.out.println("Qual a sua idade?");
        int idade = leitura.nextInt();

        if(idade >=18){
            System.out.println("Bem vindo ao sistema!");
        }else{
            System.out.println("Ops, você não pode acessar o sistema!");
        }

        System.out.println("Digite um número para saber se é par ou ímpar: ");
        int par_impar = leitura.nextInt();

        if(idade >=18){
            System.out.println("Bem vindo ao sistema!");
        }else{
            System.out.println("Ops, você não pode acessar o sistema!");
        }
    }

    public static void aula_05_03(){
        System.out.println("===========Cadastro===========");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá usuário, qual sua idade? ");
        int idade = scanner.nextInt();
        System.out.println("legal, e qual seu nome? ");
        scanner.nextLine();
        String palavra = scanner.nextLine();
        System.out.println("ok, e qual sua altura? ");
        float altura = scanner.nextFloat();
        System.out.printf("Uau! "+ palavra + " sua idade é " + idade + " e sua altura é " + altura);

        final int numero = 74;  // final == const

    }
}