package jogorpg;

public class Inimigo {
    private int vida;

    public Inimigo(){
        vida = 10;
    }
    public void dano(int dano) {
        this.vida -= dano;
    }
}
