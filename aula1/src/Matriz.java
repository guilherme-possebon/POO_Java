/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gposs
 */
public class Matriz {

    public static void main(String[] args) {
        int vetor[] = new int[15];
        boolean cheio = false;
        int i = 0;

        while (!cheio) {
            int num = Entrada.leiaInt("Escreva um numero maior de 70 " + i);
            if (num >= 70) {
                vetor[i++] = num;
                if (i == 15) {
                    cheio = true;
                }
            }
        }

        int matriz[][] = new int[3][5];

        int index = 0;
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print(matriz[linha][coluna] = vetor[index++]);
                System.out.print("");
            }
            System.out.println("");
        }

        System.exit(0);
    }
}
