/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trocadevalores;

/**
 *
 * @author gposs
 */
public class TrocaDeValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String colors[] = new String[10];

        for (int i = 0; i < colors.length; i++) {
            colors[i] = Entrada.leiaString("Escreva a cor numero: " + (i + 1));
        }
        for (int i = 0; i < colors.length - 1; i += 2) {
            String temp = colors[i];
            colors[i] = colors[i + 1];
            colors[i + 1] = temp;
        }

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[++i]);
        }
        System.exit(0);
    }

}
