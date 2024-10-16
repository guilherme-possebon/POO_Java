/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetordinamico;

/**
 *
 * @author gposs
 */
public class VetorDinamico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int capacidade = 10;
        String nomes[] = new String[capacidade];
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = Entrada.leiaString("Escreva um nome");
        }
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome lido: " + nomes[i]);
        }

        System.exit(0);
    }

}
