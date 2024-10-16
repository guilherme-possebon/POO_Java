/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sextou;

/**
 *
 * @author gposs
 */
public class Sextou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont = 0;
        for (int i = 0; i < 10; i++) {
            String nome = Entrada.leiaString("Escreva um nome");
            if (nome.equalsIgnoreCase("Juca")) {
                cont++;
            }
        }

        System.out.println("Numero de vezes que o nome Juca foi escrito: " + cont);

        System.exit(0);
    }

}
