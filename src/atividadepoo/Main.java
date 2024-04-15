package atividadepoo;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== Atividade 1 =====");
        Contador contador = new Contador();
        System.out.println("\nExibindo valor inicial do contador: " + contador.GetValorContador());

        System.out.print("\nIncrementando o valor 15 ao contador e exibindo o valor atualizado: ");
        contador.Incrementar(15);
        System.out.println(contador.GetValorContador());

        System.out.print("\nZerando contador e exibindo o valor atualizado: ");
        contador.Zerar();
        System.out.println(contador.GetValorContador());
    }
}
