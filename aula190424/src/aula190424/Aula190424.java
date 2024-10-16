/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula190424;

/**
 *
 * @author gposs
 */
public class Aula190424 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroMegassena[] = new int[6];

        numeroMegassena[0] = 10;

        numeroMegassena[0] = Entrada.leiaInt();

        int numeroMegassena2[] = {10, 20, 30, 40, 50, 60};

        System.out.println("Mega sena = posição 0: " + numeroMegassena[0]);

        for (int i = 0; i < 6; i++) {
            System.out.println(numeroMegassena2[i]);
        }

        System.exit(0);
    }

}
