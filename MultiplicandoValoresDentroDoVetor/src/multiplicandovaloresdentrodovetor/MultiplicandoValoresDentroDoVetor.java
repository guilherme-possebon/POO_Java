/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicandovaloresdentrodovetor;

/**
 *
 * @author gposs
 */
public class MultiplicandoValoresDentroDoVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numbers[] = new int[10];
        int multiplyedNumbers[] = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = Entrada.leiaInt("Escreva 10 numeros");
        }
        int numberToBeUsedToMultiplyAllTheNumberInNumbersArray = Entrada.leiaInt("Escreva um numero para multiplicar todos os 10 numeros anteriores");
        for (int i = 0; i < 10; i++) {

            multiplyedNumbers[i] = numbers[i] * numberToBeUsedToMultiplyAllTheNumberInNumbersArray;

            System.out.println(multiplyedNumbers[i]);
        }

        System.exit(0);
    }

}
