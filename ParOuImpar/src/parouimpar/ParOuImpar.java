/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parouimpar;

/**
 *
 * @author gposs
 */
public class ParOuImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            int numero = Entrada.leiaInt("Escreva um numero");
            if (numero % 2 == 0) {
                System.out.println(numero + " é par");
            } else {
                System.out.println(numero + " é impar");
            }
        }
        System.exit(0);
    }
}
