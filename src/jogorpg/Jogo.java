package jogorpg;

import java.util.Scanner;

public class Jogo {
    private Jogador Jogador;
    private Inimigo Inimigo;

    public Jogo(Jogador jogador, Inimigo inimigo){
        Jogador = jogador;
        Inimigo = inimigo;
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
                Jogador = new Guerreiro(20, 2);
                break;
            case 2:
                System.out.println("Você escolheu o personagem Mago");
                Jogador = new Mago(20, 1);
                break;
        }

        boolean estaoVivos = true;
        while (estaoVivos){
            Jogador.Atacar(Inimigo);
            Inimigo.Atacar(Jogador);
            System.out.println("\nSua vida está em: " + Jogador.getVida());
            System.out.println("A vida do inimigo está em: " + Inimigo.getVida());
            estaoVivos = Jogador.EstaVivo() && Inimigo.EstaVivo();
        }

        if (Jogador.EstaVivo()){
            System.out.println("\nParabéns! Você venceu!");
        } else {
            System.out.println("\nPoxa, você foi derrotado!");
        }
    }

    private int escolherPersonagem(){
        System.out.println("\nEscolha seu personagem: \n1 - Guerreiro \n2 - Mago");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
