package jogorpg;

import java.util.Scanner;

public class Jogo {
    private Jogador Jogador;
    private Inimigo Inimigo;

    public Jogo(){
        Jogador = new Jogador(1, 1);
        Inimigo = new Inimigo();
    }

    public void iniciarJogo(){
        int opcao = escolherPersonagem();
        while (opcao != 1 && opcao != 2){
            System.out.println("Opção inválida!");
            opcao = escolherPersonagem();
        }

        switch (opcao){
            case 1:
                System.out.println("Você escolheu o personagem Guerreiro");
                Jogador = new Guerreiro();
                break;
            case 2:
                System.out.println("Você escolheu o personagem Mago");
                Jogador = new Mago();
                break;
        }
        boolean estaoVivos = true;
        while (estaoVivos){
            Jogador.Atacar(Inimigo);
            Inimigo.Atacar(Jogador);
            estaoVivos = Jogador.EstaVivo() && Inimigo.EstaVivo();
        }

        if (Jogador.EstaVivo()){
            System.out.println("Parabéns! Você venceu!");
        } else {
            System.out.println("Poxa, você foi derrotado!");
        }
    }

    private int escolherPersonagem(){
        System.out.println("Escolha seu personagem: \n1 - Guerreiro \n2 - Mago");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
