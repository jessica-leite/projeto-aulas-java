package jogorpg;

import java.util.Scanner;

public class Jogo {
    public Jogo(){

    }

    public void iniciarJogo(){
        int opcao = escolherPersonagem();

        switch (opcao){
            case 1: break;
            case 2: break;
            default: System.out.println("Opção inválida!");
            escolherPersonagem();
        }
    }

    private int escolherPersonagem(){
        System.out.println("Escolha seu personagem: \n1 - Guerreiro \n2 - Mago");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
