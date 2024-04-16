package atividadepoo;

import java.util.ArrayList;
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
        
        List<Pais> paises = new ArrayList<>() {
            {
                add(new Pais("Austrália", 25705081, 7692024));
                add(new Pais("Estados Federados da Micronésia", 103000, 702));
                add(new Pais("Ilhas Marshall", 55500, 181));
                add(new Pais("Fiji", 884887, 18274));
                add(new Pais("Ilhas Salomão", 667044, 28450));
                add(new Pais("Kiribati", 120100, 811));
                add(new Pais("Nauru", 10084, 21));
                add(new Pais("Nova Zelândia", 5014786, 268680));
                add(new Pais("Palau", 21000, 459));
                add(new Pais("Papua - Nova Guiné", 9008800, 462840));
                add(new Pais("Samoa", 199052, 2831));
                add(new Pais("Tonga", 100651, 747));
                add(new Pais("Tuvalu", 10640, 26));
                add(new Pais("Vanuatu", 304500, 12189));
            }
        };
        continente.AdicionarPaises(paises);
        System.out.println("==========Países: " + paises);

        System.out.println("\nContinente escolhido: " + continente.GetNome());
        System.out.println("\nDimensão total do continente: " + continente.GetDimensao());
        System.out.println("\nPopulação total do continente: " + continente.GetPopulacao());
        System.out.println("\nDensidade populacional: " + continente.GetDensidadePopulacional());
        System.out.println("\nPaís com maior população: " + continente.GetPaisMaiorPopulacao());
        System.out.println("\nPaís com menor populaçao: " + continente.GetPaisMenorPopulacao());
        System.out.println("\nPaís com maior dimensão territorial: " + continente.GetPaisMaiorDimensaoTerritorial());
        System.out.println("\nPaís com menor dimensão territorial: " + continente.GetPaisMenorDimensaoTerritorial());
        System.out.println("\nRazão territorial entre o maior e o menor país: " + continente.GetRazaoTerritorialMaiorEMenorPais());
    }
}
