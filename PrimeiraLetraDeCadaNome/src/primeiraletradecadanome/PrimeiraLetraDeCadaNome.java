/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeiraletradecadanome;

/**
 *
 * @author gposs
 */
public class PrimeiraLetraDeCadaNome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nomes[] = new String[10];

        for (int i = 0; i < 10; i++) {
            nomes[i] = Entrada.leiaString("Escreva um nome");
        }

        for (int i = 0; i < 10; i++) {
            String nome = nomes[i];

            System.out.println(nome.charAt(0));
        }

        System.exit(0);
    }

}
