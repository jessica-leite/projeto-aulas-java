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
    private int Dimensao;
    private int Populacao;

    private List<Pais> Paises = new LinkedList<>() {
    };

    public Continente(String nome){
     Nome = nome;
    }

    public String GetNome() {
        return Nome;
    }

    public double GetDimensao() {
        return Dimensao;
    }

    public int GetPopulacao() {
        return Populacao;
    }

    public void AdicionarPais(String nome, int populacao, int dimensao){
        Paises.add(new Pais(nome, populacao, dimensao));
        Dimensao += dimensao;
        Populacao += populacao;
    }

    public void AdicionarPaises(List<Pais> paises){
        Paises.addAll(paises);

        for (Pais pais : Paises)
             {
                 Dimensao += pais.GetDimensao();
                 Populacao += pais.GetPopulacao();
             }
    }

    public double GetDensidadePopulacional(){
        return Populacao / Dimensao;
    }

    public Pais GetPaisMaiorPopulacao(){
        Pais paisMaiorPopulacao = new Pais();
        for(Pais pais : Paises){
            if(pais.GetPopulacao() > paisMaiorPopulacao.GetPopulacao()){
                paisMaiorPopulacao = pais;
            }
        }
        return paisMaiorPopulacao;
    }

    public Pais GetPaisMenorPopulacao(){
        Pais paisMenorPopulacao = Paises.getFirst();
        for(Pais pais : Paises){
            if(pais.GetPopulacao() < paisMenorPopulacao.GetPopulacao()){
                paisMenorPopulacao = pais;
            }
        }
        return paisMenorPopulacao;
    }

    public Pais GetPaisMaiorDimensaoTerritorial(){
        Pais paisMaiorDimensaoTerritorial = new Pais();
        for(Pais pais : Paises){
            if(pais.GetPopulacao() > paisMaiorDimensaoTerritorial.GetDimensao()){
                paisMaiorDimensaoTerritorial = pais;
            }
        }
        return paisMaiorDimensaoTerritorial;
    }

    public Pais GetPaisMenorDimensaoTerritorial(){
        Pais paisMenorDimensaoTerritorial = Paises.getFirst();
        for(Pais pais : Paises){
            if(pais.GetPopulacao() < paisMenorDimensaoTerritorial.GetDimensao()){
                paisMenorDimensaoTerritorial = pais;
            }
        }
        return paisMenorDimensaoTerritorial;
    }

    public double GetRazaoTerritorialMaiorEMenorPais(){
        Pais paisMaiorDimensaoTerritorial = GetPaisMaiorDimensaoTerritorial();
        Pais paisMenorDimensaoTerritorial = GetPaisMenorDimensaoTerritorial();
        double razao = paisMaiorDimensaoTerritorial.GetDimensao() / paisMenorDimensaoTerritorial.GetDimensao();
        return razao;
    }
}

