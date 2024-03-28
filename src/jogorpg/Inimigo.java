package jogorpg;

public class Inimigo {
    private int Vida;
    private  int Ataque;

    public Inimigo(){
        Vida = 20;
        Ataque = 2;
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
}
