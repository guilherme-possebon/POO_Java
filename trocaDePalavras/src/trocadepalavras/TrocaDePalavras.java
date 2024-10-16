/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trocadepalavras;

/**
 *
 * @author gposs
 */
public class TrocaDePalavras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inputString = Entrada.leiaString("Escreva uma palavra");

        char oldChar = Entrada.leiaChar("Escreva uma letra para ser trocada da palavra: " + inputString);
        char newChar = Entrada.leiaChar("Escreva a nova letra para ser trocada da palavra: " + inputString);

        System.out.println(inputString.replace(oldChar, newChar));

        System.exit(0);
    }

}
