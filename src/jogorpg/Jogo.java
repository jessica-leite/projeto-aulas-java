package jogorpg;

import java.util.Scanner;

public class Jogo {
    public Jogo(){

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
                break;
            case 2:
                System.out.println("Você escolheu o personagem Mago");
                break;
        }
    }

    private int escolherPersonagem(){
        System.out.println("Escolha seu personagem: \n1 - Guerreiro \n2 - Mago");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
