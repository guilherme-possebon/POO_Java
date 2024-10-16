/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nomesqueestaonaposicaopar;

/**
 *
 * @author gposs
 */
public class NomesQueEstaoNaPosicaoPar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String names[] = new String[15];

        for (int i = 0; i < names.length; i++) {
            names[i] = Entrada.leiaString("Escreva o nome numero: " + (i + 1));
        }

        for (int i = 0; i < names.length; i++) {
            if ((i + 1) % 2 == 0) {
                System.out.println(names[i]);
            }
        }

        System.exit(0);
    }

}
