/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encervetorcomnumerosacimade50;

import java.util.ArrayList;

/**
 *
 * @author gposs
 */
public class EncerVetorComNumerosAcimaDe50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        boolean arrayIsFull = true;
        int cont = 0;

        while (arrayIsFull) {
            int numberToBeRead = Entrada.leiaInt("Escreva um numero maior que 50");
            if (numberToBeRead >= 50) {
                numbers.add(numberToBeRead);
                System.out.println("adicionado");
            }

            if (numbers.size() == 10) {
                arrayIsFull = false;
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Numeros que são acima de 50: " + numbers.get(i));
        }
        System.exit(0);
    }

}
