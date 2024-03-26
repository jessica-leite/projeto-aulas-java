package heracaparte1;

public class Pessoa {
    private String Nome;
    private int Idade;
    private Endereco endereco;

    public Pessoa(String nome, int idade, Endereco endereco){
        this.Nome = nome;
        this.Idade = idade;
        this.endereco = endereco;
    }

    public void mostrarDados(){
        System.out.println("Nome: " + this.Nome + "\nIdade: " + this.Idade);
    }
}
