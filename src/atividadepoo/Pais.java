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

    public int getDimensao() {
        return Dimensao;
    }

    public int getPopulacao() {
        return Populacao;
    }
}
