/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gposs
 */
public class Media {

    public static void main(String[] args) {
        int A = Entrada.leiaInt("Escreva o primeiro valor");
        int B = Entrada.leiaInt("Escreva o segundo valor");
        int C = Entrada.leiaInt("Escreva o terceiro valor");

        int resultado = (A + B) / C;

        if (resultado > 10) {
            System.out.println("O resultado foi maior que 10");
        } else if (resultado < 10) {
            System.out.println("O resultado foi menor que 10");
        }
        System.exit(0);
    }
}
