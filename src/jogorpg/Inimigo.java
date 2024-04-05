package jogorpg;

public class Inimigo {
    private int Vida;
    private  int Ataque;

    public Inimigo(int vida, int ataque){
        Vida = vida;
        Ataque = ataque;
    }
    public void Dano(int dano) {
        Vida -= dano;
    }

    public void Atacar(Jogador jogador){
        jogador.Dano(Ataque);
    }

    public boolean EstaVivo(){
        return Vida > 0;
    }

    public int getVida() {
        return Math.max(Vida, 0);
    }
}
