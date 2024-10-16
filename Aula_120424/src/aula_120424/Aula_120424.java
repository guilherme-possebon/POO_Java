/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula_120424;

/**
 *
 * @author gposs
 */
public class Aula_120424 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1 = Entrada.leiaInt("Escreva um numero inteiro");
        int numero2 = Entrada.leiaInt("Escreva outro numero inteiro");

        int soma = numero1 + numero2;

        System.out.println("A soma dos numeros: " + soma);

        System.exit(0);
    }

}
