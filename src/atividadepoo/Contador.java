package atividadepoo;

public class Contador {
    //1) Escreva em Java uma classe Contador, que encapsule um valor usado para contagem de
    //itens ou eventos. A classe deve oferecer métodos que devem:
    //a) Zerar;
    //b) Incrementar;
    //c) Retornar o valor do contador.

    private int Contador;

    public void Zerar(){
        this.Contador = 0;
    }

    public void Incrementar(int numero){
        this.Contador += numero;
    }

    public int GetValorContador(){
        return this.Contador;
    }
}
