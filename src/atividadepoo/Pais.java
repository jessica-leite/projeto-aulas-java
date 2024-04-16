package atividadepoo;

public class Pais {
    private String Nome;
    private int Populacao;
    private int Dimensao;

    public Pais(String nome, int populacao, int dimensao){
        Nome = nome;
        Populacao = populacao;
        Dimensao = dimensao;
    };

    public Pais(){}

    public int GetDimensao() {
        return Dimensao;
    }

    public int GetPopulacao() {
        return Populacao;
    }

    public String GetNome() {
        return Nome;
    }
}
