/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula190424pt2;

/**
 *
 * @author gposs
 */
public class Aula190424pt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idades[] = new int[10];

        for (int i = 0; i < 10; i++) {
            idades[i] = Entrada.leiaInt("Escreva a sua idade");
        }

        for (int j = 0; j < 10; j++) {
            System.out.println("Todas as idades escritas anteriormente são: " + idades[j]);
        }

        System.exit(0);
    }

}
