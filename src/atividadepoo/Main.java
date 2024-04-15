package atividadepoo;

import java.util.LinkedList;
import java.util.List;

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

        System.out.println("\n===== Atividade 2 =====");
        Continente continente = new Continente("Oceania");
        
        List<Pais> paises = new LinkedList<>(){
            {
                new Pais("Austrália", 25705081, 7692024);
                new Pais("Estados Federados da Micronésia", 103000, 702);
                new Pais("Ilhas Marshall", 55500,181.4);
                new Pais("Fiji", 884887, 18274);
                new Pais("Ilhas Salomão", 667044, 28450);
                new Pais("Kiribati", 120100, 811);
                new Pais("Nauru", 10084, 21);
                new Pais("Nova Zelândia", 5014786, 268680);
                new Pais("Palau", 21000, 459);
                new Pais("Papua - Nova Guiné", 9008800, 462840);
                new Pais("Samoa", 199052, 2831);
                new Pais("Tonga", 100651, 747);
                new Pais("Tuvalu", 10640, 26);
                new Pais("Vanuatu", 304500, 12189);
            }
        };
        continente.AdicionarPaises(paises);
    }
}
