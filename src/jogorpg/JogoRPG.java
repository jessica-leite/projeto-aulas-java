package jogorpg;

public class JogoRPG {
    public static void main(String[] args) {
        Jogador jogador = new Jogador(1, 1);
        Inimigo inimigo = new Inimigo(15,2);
        Jogo jogo = new Jogo(jogador, inimigo);
        jogo.iniciarJogo();
    }
}
