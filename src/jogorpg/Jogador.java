package jogorpg;

public class Jogador {
    private int Vida;
    private int Ataque;

    public Jogador(int vida, int ataque){
        Vida = vida;
        Ataque = ataque;
    }

    public void Atacar(Inimigo inimigo) {
        inimigo.Dano(Ataque);
    }

    public void Dano(int dano){
        Vida -= dano;
    }

    public boolean EstaVivo(){
        return Vida > 0;
    }
}
