/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author gposs
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char opcao = '1';
        double num1 = 0;
        double num2 = 0;

        while (opcao != 'x') {

            opcao = Entrada.leiaChar("CALCULADORA - Versão 2\n\n"
                    + "[1] - Somar\n"
                    + "[2] - Subtrair\n"
                    + "[3] - Multiplicar\n"
                    + "[4] - Dividir\n\n"
                    + "[x] - exit");

            if (opcao != 'x' && (opcao == '1' || opcao == '2' || opcao == '3' || opcao == '4')) {
                num1 = Entrada.leiaDouble("Escreva o primeiro numero");
                num2 = Entrada.leiaDouble("Escreva o segundo numero");

                switch (opcao) {
                    case '1':
                        JOptionPane.showMessageDialog(null, "O resultado da soma é: " + (num1 + num2),
                                "Resultado", JOptionPane.INFORMATION_MESSAGE
                        );
                        break;
                    case '2':
                        JOptionPane.showMessageDialog(null, "O resultado da subtração é: " + (num1 - num2),
                                "Resultado", JOptionPane.INFORMATION_MESSAGE
                        );
                        break;
                    case '3':
                        JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " + (num1 * num2),
                                "Resultado", JOptionPane.INFORMATION_MESSAGE
                        );
                        break;
                    case '4':
                        JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + (num1 / num2),
                                "Resultado", JOptionPane.INFORMATION_MESSAGE
                        );
                        break;
                }

            }
        }

        System.exit(0);

    }

}
