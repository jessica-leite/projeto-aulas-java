package poo;

public class Main {
    public static void main(String[] args) {
        Suprimentos banana = new Suprimentos(24, "Banana", 1, 5);
        Suprimentos abacate = new Suprimentos(10, "Abacate", -1, -2);
        System.out.println("Quantidade " + banana.getDescricaoItem() + ": " + banana.getQuantidade());
        System.out.println("Preço banana: " + banana.getPrecoUnitario());
        System.out.println("Quantidade abacate: " + abacate.getQuantidade());
        System.out.println("Preço abacate: " + abacate.getPrecoUnitario());

        // Crie duas instâncias da classe e exiba o salário anual de cada instância.
        Colaborador colaborador1 = new Colaborador("Jessica", "Leite", 3000);

        System.out.println("Salário anual " + colaborador1.getNome() + " " + colaborador1.getSobrenome() +
                " : R$ " + colaborador1.getSalarioAnual());

        Colaborador colaborador2 = new Colaborador("Maria", "Silva", 2000);

        System.out.println("Salário anual " + colaborador2.getNome() + " " + colaborador2.getSobrenome() +
                " : R$ " + colaborador2.getSalarioAnual());

        // Então dê a cada empregado um aumento de 10% e exiba novamente o salário anual de cada colaborador.

        colaborador1.setSalario(colaborador1.getSalario() * 1.1);
        colaborador2.setSalario(colaborador2.getSalario() * 1.1);

        System.out.println("Salário anual " + colaborador1.getNome() + " " + colaborador1.getSobrenome() +
                " : R$ " + colaborador1.getSalarioAnual());

        System.out.println("Salário anual " + colaborador2.getNome() + " " + colaborador2.getSobrenome() +
                " : R$ " + colaborador2.getSalarioAnual());

    }
}
