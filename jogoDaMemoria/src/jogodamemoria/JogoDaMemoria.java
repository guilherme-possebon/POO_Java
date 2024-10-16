/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogodamemoria;

import java.util.Random;

/**
 *
 * @author gposs
 */
public class JogoDaMemoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char simbolos[][] = new char[3][4];
        char simbolosCodificado[][] = new char[3][4];
        simbolos[0][0] = '1';
        simbolos[0][1] = '2';
        simbolos[0][2] = '3';
        simbolos[0][3] = '4';
        simbolos[1][0] = '5';
        simbolos[1][1] = '6';
        simbolos[1][2] = '1';
        simbolos[1][3] = '2';
        simbolos[2][0] = '3';
        simbolos[2][1] = '4';
        simbolos[2][2] = '5';
        simbolos[2][3] = '6';

        char flatSimbolos[] = new char[12];

        int index = 0;
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                flatSimbolos[index++] = simbolos[linha][coluna];
            }
        }

        sorteadorDeLugar(flatSimbolos);

        System.out.println("Jogo da memoria: ");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                simbolosCodificado[linha][coluna] = '*';
            }
        }
        index = 0;
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                simbolos[linha][coluna] = flatSimbolos[index++];
            }
        }
        System.out.print("    1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("4");
        System.out.println("");
        System.out.print("    -");
        System.out.print(" -");
        System.out.print(" -");
        System.out.print(" -");
        System.out.println("");
        for (int linha = 0; linha < 3; linha++) {
            switch (linha) {
                case 0:
                    System.out.print("A ");
                    System.out.print("| ");
                    break;
                case 1:
                    System.out.print("B ");
                    System.out.print("| ");
                    break;
                case 2:
                    System.out.print("C ");
                    System.out.print("| ");
                    break;

            }

            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.print(simbolosCodificado[linha][coluna] + " ");
            }
            System.out.println("");
        }

        boolean jogoTerminou = false;
        while (!jogoTerminou) {
            System.out.println("DEVVVVV ");
            for (int linha = 0; linha < 3; linha++) {
                for (int coluna = 0; coluna < 4; coluna++) {
                    System.out.print(simbolos[linha][coluna] + " ");
                }
                System.out.println("");
            }
            String posicaoEscolhidaDoUsuario = Entrada.leiaString("Escolha uma posição");
            System.out.println("Posição escolhida: " + posicaoEscolhidaDoUsuario);
            int numeroEscolhido = Entrada.leiaInt("Agora escreva um numero para tentar acertar");

            switchPosicao(posicaoEscolhidaDoUsuario, simbolosCodificado, simbolos, numeroEscolhido);
        }
        System.out.println("Parabens, voce finalizou o jogo!!!");
        System.exit(0);
    }

    public static void sorteadorDeLugar(char[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static boolean switchPosicao(String posicaoString, char[][] simbolosCodificado, char[][] simbolos, int numeroEscolhido) {
        int contidadeDeAcertos = 0;
        boolean jogoTerminou = false;
        switch (posicaoString) {
            // ----------A----------
            case "A1":
                System.out.println();
                System.out.println(numeroEscolhido);
                int test = simbolos[0][0];
                if (simbolos[0][0] == numeroEscolhido) {
                    System.out.println("Acertou o numero dessa posição!!");
                    System.out.println(simbolos[0][0]);
                    contidadeDeAcertos++;
                } else {
                    System.out.println("Errouuuuuuu, tente novamente");
                }
                break;
            case "A2":
                if (simbolos[0][1] == numeroEscolhido) {
                    System.out.println("Acertou o numero dessa posição!!");
                    System.out.println(simbolos[0][1]);
                    contidadeDeAcertos++;
                } else {
                    System.out.println("Errouuuuuuu, tente novamente");
                }
                break;
            case "A3":
                if (simbolos[0][2] == numeroEscolhido) {
                    System.out.println("Acertou o numero dessa posição!!");
                    System.out.println(simbolos[0][2]);
                    contidadeDeAcertos++;
                } else {
                    System.out.println("Errouuuuuuu, tente novamente");
                }
                break;
            case "A4":
                if (simbolos[0][3] == numeroEscolhido) {
                    System.out.println("Acertou o numero dessa posição!!");
                    System.out.println(simbolos[0][3]);
                    contidadeDeAcertos++;
                } else {
                    System.out.println("Errouuuuuuu, tente novamente");
                }
                break;
            // ----------B----------
            case "B1":
                if (simbolos[1][0] == numeroEscolhido) {
                    System.out.println("Acertou o numero dessa posição!!");
                    System.out.println(simbolos[1][0]);
                    contidadeDeAcertos++;
                } else {
                    System.out.println("Errouuuuuuu, tente novamente");
                }
                break;
            case "B2":
                if (simbolos[1][1] == numeroEscolhido) {
                    System.out.println("Acertou o numero dessa posição!!");
                    System.out.println(simbolos[1][1]);
                    contidadeDeAcertos++;
                } else {
                    System.out.println("Errouuuuuuu, tente novamente");
                }
                break;
            case "B3":
                if (simbolos[1][2] == numeroEscolhido) {
                    System.out.println("Acertou o numero dessa posição!!");
                    System.out.println(simbolos[1][2]);
                    contidadeDeAcertos++;
                } else {
                    System.out.println("Errouuuuuuu, tente novamente");
                }
                break;
            case "B4":
                if (simbolos[1][3] == numeroEscolhido) {
                    System.out.println("Acertou o numero dessa posição!!");
                    System.out.println(simbolos[1][3]);
                    contidadeDeAcertos++;
                } else {
                    System.out.println("Errouuuuuuu, tente novamente");
                }
                break;
            // ----------C----------
            case "C1":
                if (simbolos[2][0] == numeroEscolhido) {
                    System.out.println("Acertou o numero dessa posição!!");
                    System.out.println(simbolos[2][0]);
                    contidadeDeAcertos++;
                } else {
                    System.out.println("Errouuuuuuu, tente novamente");
                }
                break;
            case "C2":
                if (simbolos[2][1] == numeroEscolhido) {
                    System.out.println("Acertou o numero dessa posição!!");
                    System.out.println(simbolos[2][1]);
                    contidadeDeAcertos++;
                } else {
                    System.out.println("Errouuuuuuu, tente novamente");
                }
                break;
            case "C3":
                if (simbolos[2][2] == numeroEscolhido) {
                    System.out.println("Acertou o numero dessa posição!!");
                    System.out.println(simbolos[2][2]);
                    contidadeDeAcertos++;
                } else {
                    System.out.println("Errouuuuuuu, tente novamente");
                }
                break;
            case "C4":
                if (simbolos[2][3] == numeroEscolhido) {
                    System.out.println("Acertou o numero dessa posição!!");
                    System.out.println(simbolos[2][3]);
                    contidadeDeAcertos++;
                } else {
                    System.out.println("Errouuuuuuu, tente novamente");
                }
                break;
            default:
                System.out.println("Posição inválida!");
                break;
        }
        if (contidadeDeAcertos == 12) {
            jogoTerminou = true;
        }

        return jogoTerminou;
    }
}
