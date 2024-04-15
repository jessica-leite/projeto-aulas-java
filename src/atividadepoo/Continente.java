package atividadepoo;

import java.util.LinkedList;
import java.util.List;

public class Continente {
    //2) Escreva em Java uma classe Continente. Um continente possui um nome e é composto
    //por um conjunto de países. Forneça os membros de classe a seguir:
    //a) Construtor que inicialize o nome do continente;
    //b) Um método que permita adicionar países aos continentes;
    //c) Um método que retorne a dimensão total do continente;
    //d) Um método que retorne a população total do continente;
    //e) Um método que retorne a densidade populacional do continente;
    //f) Um método que retorne o país com maior população no continente;
    //g) Um método que retorne o país com menor população no continente;
    //h) Um método que retorne o país de maior dimensão territorial no continente;
    //i) Um método que retorne o país de menor dimensão territorial no continente;
    //j) Um método que retorne a razão territorial do maior pais em relação ao menor país.

    private String Nome;
    private double Dimensao;
    private int Populacao;
    private double DensidadePopulacional;

    private List<Pais> Paises = new LinkedList<>() {
    };

    public Continente(String nome){
     Nome = nome;
    }

    public void AdicionarPais(String nome, int populacao, double dimensao){
        Paises.add(new Pais(nome, populacao, dimensao));
    }

    public void AdicionarPaises(List<Pais> paises){
        Paises.addAll(paises);

        for (Pais pais : paises)
             {
                 Dimensao += pais.getDimensao();
                 Populacao += pais.getPopulacao();
             };
    }

    public double GetDimensao(){
        return Dimensao;
    }

    public int GetPopulacao(){
        return Populacao;
    }

    public double GetDensidadePopulacional(){
        return Populacao / Dimensao;
    }

    public Pais GetPaisMaiorPopulacao(){
        return null;
    }

    public Pais GetPaisMenorPopulacao(){
        return null;
    }

    public Pais GetPaisMaiorDimensaoTerritorial(){
        return null;
    }

    public Pais GetPaisMenorDimensaoTerritorial(){
        return null;
    }

    public double GetRazaoTerritorialMaiorEMenorPais(){
        return 0;
    }
}

