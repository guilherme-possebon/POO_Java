/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosrandomicos;

/**
 *
 * @author gposs
 */
public class NumerosRandomicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double numerosRandomicos[] = new double[1000];
        int numerosInteiros[] = new int[1000];
        int max = 60;
        int min = 0;

        for (int i = 0; i < 6; i++) {
            numerosRandomicos[i] = Math.random() * 10;
            numerosInteiros[i] = (int) (Math.random() * (max - min) + min);
        }

        for (int i = 0; i < 6; i++) {
            System.out.println("Randomico " + numerosRandomicos[i]);
            System.out.println("Inteiro " + numerosInteiros[i]);
        }
    }

}
