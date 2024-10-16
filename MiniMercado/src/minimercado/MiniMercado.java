/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minimercado;

/**
 *
 * @author gposs
 */
public class MiniMercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String nomeProd = Entrada.leiaString("Escreva o nome de uma produto do mercado").toLowerCase();
            int count = 0;

            for (int j = 0; j < nomeProd.length(); j++) {
                if (nomeProd.charAt(j) == 'a') {
                    count++;
                }
            }

            System.out.println("A letra '" + 'a' + "' aparece " + count + " vezes no produto: " + nomeProd);
        }
        System.exit(0);
    }

}
