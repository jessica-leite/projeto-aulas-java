import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Atividade2.solicitarNomeIdade();
    }

    public static void atividadeInt(){
        escreva("Digite o valor da sua hora: ");
        double valor_hora = lerDouble();
        escreva("Digite a quantidade de horas trabalhadas no mês: ");
        double quantidade_horas = lerDouble();

        double salario_bruto = quantidade_horas * valor_hora;
        escreva("Salário bruto: R$ " + salario_bruto);

        double imposto_renda = calcularIR(salario_bruto);
        escreva("(-) IR: R$ " + imposto_renda);

        double inss = salario_bruto * 0.1;
        escreva("(-) INSS (10%): R$ " + inss);

        double fgts = salario_bruto * 0.11;
        escreva("FGTS (11%): R$ " + fgts);

        double sindicato = salario_bruto * 0.03;
        escreva("Sindicato: R$ " + sindicato);

        double total_descontos = imposto_renda + inss + sindicato;
        escreva("Total de descontos: R$ " + total_descontos);


        double salario_liquido = salario_bruto - total_descontos;
        escreva("Salário líquido: R$ " + salario_liquido);
    }
    public static double calcularIR(double salarioBruto){
        double resultado;
        if (salarioBruto <= 900){
            resultado = 0.0;
        }else if (salarioBruto <= 1500) {
            resultado = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            resultado = salarioBruto * 0.1;
        } else {
            resultado = salarioBruto * 0.2;
        }

        return resultado;
    }

    public static void aprovadoReprovado(){
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
    public static void verificarIgual10(){
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

        //System.out.println("Digite um número para saber se é par ou ímpar: ");
        //fazer lógica par ou ímpar;
    }

    public static void cadastrarUsuario(){
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

        //final int numero = 74;  final == const

    }
}