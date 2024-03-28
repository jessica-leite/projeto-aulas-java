package jogorpg;

public class Inimigo {
    private int Vida;
    private  int Ataque;

    public Inimigo(){
        Vida = 10;
        Ataque = 1;
    }
    public void Dano(int dano) {
        Vida -= dano;
    }

    public void Atacar(Jogador jogador){
        jogador.Dano(Ataque);
    }

    public boolean estaVivo(){
        return Vida > 0;
    }
}
