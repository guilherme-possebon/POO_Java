/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gposs
 */
public class JogoDaVelha {

    public static void main(String[] args) {
        char jogoDaVelha[][] = new char[3][3];
        boolean vencedor = false;
        boolean trocaDeVez = false;
        boolean caracterDoJogador = false;

        int cont = 0;

        char pos1;
        char pos2;

        int vertical = -1;
        int horizontal = -1;

        String player1 = Entrada.leiaString("Escreva o nome do primeiro jogador");
        String player2 = Entrada.leiaString("Escreva o nome do segundo jogador");

        while (!vencedor && cont < 9) {
            printBoard(jogoDaVelha);

            if (!trocaDeVez) {
                pos1 = Entrada.leiaChar(player1 + " escreva a letra que representa a linha que deseja selecionar (A, B, C)");
                pos2 = Entrada.leiaChar(player1 + " escreva o numero que representa a coluna que deseja selecionar (1, 2, 3)");
                vertical = pos1 - 'A';
                horizontal = pos2 - '1';
                caracterDoJogador = false;
            } else {
                pos1 = Entrada.leiaChar(player2 + " escreva a letra que representa a linha que deseja selecionar (A, B, C)");
                pos2 = Entrada.leiaChar(player2 + " escreva o numero que representa a coluna que deseja selecionar (1, 2, 3)");
                vertical = pos1 - 'A';
                horizontal = pos2 - '1';
                caracterDoJogador = true;
            }
            if (vertical >= 0 && vertical < 3 && horizontal >= 0 && horizontal < 3) {
                if (jogoDaVelha[vertical][horizontal] == '\0') {
                    jogoDaVelha[vertical][horizontal] = caracterDoJogador ? 'O' : 'X';
                    trocaDeVez = !trocaDeVez;
                    cont++;
                } else {
                    System.out.println("Posição já ocupada. Tente novamente.");
                }
            } else {
                System.out.println("Posição inválida. Tente novamente.");
            }
            vencedor = checkWinner(jogoDaVelha);
        }
        printBoard(jogoDaVelha);
        System.out.println("O Jogo terminou");
        System.exit(0);
    }

    public static void printBoard(char[][] board) {
        System.out.print("  1 2 3\n");
        System.out.print("  -----\n");
        for (int linha = 0; linha < 3; linha++) {
            switch (linha) {
                case 0:
                    System.out.print("A");
                    break;
                case 1:
                    System.out.print("B");
                    break;
                case 2:
                    System.out.print("C");
                    break;
            }
            System.out.print("|");
            for (int coluna = 0; coluna < 3; coluna++) {
                char value = board[linha][coluna];
                if (value == '\0') {
                    System.out.print(" ");
                } else {
                    System.out.print(value);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static boolean checkWinner(char[][] board) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '\0' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
            if (board[0][i] != '\0' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return true;
            }
        }
        if (board[0][0] != '\0' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        } else if (board[0][2] != '\0' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }
        return false;
    }
}
