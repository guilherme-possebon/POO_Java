/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lendopalavras;

/**
 *
 * @author gposs
 */
public class LendoPalavras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nrst = "";
//        String inputString = Entrada.leiaString("Escreva uma palavra");
        String inputString = "Palavra";

//        another way but harder to understand
//        for (int i = 0; i < inputString.length(); i++) {
//            char ch = inputString.charAt(i);
//            nrst = ch + nrst;
//        }
//        for (int j = 0; j < nrst.length(); j++) {
//            System.out.println(nrst.charAt(j));
//        }
        for (int i = inputString.length() - 1; i >= 0; i--) {
            System.out.println(inputString.charAt(i));
//            a better way
        }
        System.exit(0);
    }

}
