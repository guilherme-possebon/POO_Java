/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maiusculoeminisculo;

/**
 *
 * @author gposs
 */
public class MaiusculoEMinisculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            String inputString = Entrada.leiaString("Escreva uma palavra");

            String upperCase = inputString.toUpperCase();
            String lowerCase = inputString.toLowerCase();

            System.out.println("A palavra: " + inputString + "\n A mesma palavra mas em caixa alta: " + upperCase + "\n A mesma palavra mas em caixa baixa: " + lowerCase);
        }
        System.exit(0);
    }

}
