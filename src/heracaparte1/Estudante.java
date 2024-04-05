package heracaparte1;

public class Estudante extends Pessoa{
    private int matricula;

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public Estudante(String nome, int idade, int matricula){
        super(nome, idade);
        this.matricula = matricula;
    }

    public void mostrarDados2(){
        super.mostrarDados();
        System.out.println("Matrícula: " + matricula);
    }
}
