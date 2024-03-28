package jogorpg;

public class Jogador {
    private int Vida;
    private int Ataque;

    public Jogador(int vida, int ataque){
        Vida = vida;
        Ataque = ataque;
    }

    public void atacar(Inimigo inimigo) {
        inimigo.dano(1);
    }

    public boolean estaVivo(){
        return Vida > 0;
    }
}
