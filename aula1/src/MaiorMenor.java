/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gposs
 */
public class MaiorMenor {

    public static void main(String[] args) {
        int MaiorMenor[] = new int[10];
        int atual = 0;

        int maiorIndex = 0;
        int menorIndex = 0;

        for (int i = 0; i < MaiorMenor.length; i++) {
            MaiorMenor[i] = Entrada.leiaInt("Escreva um valor " + i);
        }

        for (int i = 0; i < MaiorMenor.length; i++) {

            if (MaiorMenor[i] > MaiorMenor[maiorIndex]) {
                maiorIndex = i;
            }

            if (MaiorMenor[i] < MaiorMenor[menorIndex]) {
                menorIndex = i;
            }

        }

        System.out.println("Maior numero foi: " + MaiorMenor[maiorIndex] + " e o index que tem esse valor é: " + maiorIndex);
        System.out.println("Menor numero foi: " + MaiorMenor[menorIndex] + " e o index que tem esse valor é: " + menorIndex);

        System.exit(0);
    }
}
