package poo;

public class Colaborador {
    //2 - A fim de representar colaboradores em uma firma, crie uma classe chamada Colaborador que inclui
    // as três informações a seguir como atributos:
    //
    //• um primeiro nome,
    //• um sobrenome
    //• um salário mensal.
    private String Nome;
    private String Sobrenome;
    private double Salario;

    //Sua classe deve ter um construtor que inicializa os três atributos.
    public Colaborador(String nome, String sobrenome, double salario){
        setNome(nome);
        setSobrenome(sobrenome);
        setSalario(salario);
    }
    // Forneça um método set e get para cada atributo.

    public String getNome() {
        return this.Nome;
    }

    public String getSobrenome() {
        return this.Sobrenome;
    }

    public double getSalario() {
        return this.Salario;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.Sobrenome = sobrenome;
    }

    // Se o salário mensal não for positivo, configure-o como 0.0.
    public void setSalario(double salario) {
        this.Salario = Math.max(salario, 0);
    }

    public double getSalarioAnual(){
        return this.getSalario() * 12;
    }
}
