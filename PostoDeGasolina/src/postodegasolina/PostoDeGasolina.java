/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package postodegasolina;

import java.text.DecimalFormat;

/**
 *
 * @author gposs
 */
public class PostoDeGasolina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double quilometrosQueOUsuarioQuerPercorer = Entrada.leiaDouble("Digite o quanto voce quer percorrer com o seu veiculo (Em km) ");
        double autonomiaDoCarro = Entrada.leiaDouble("Digite a autonomia do seu veiculo (Em km/L) ");

        double valorParaPagar = ((quilometrosQueOUsuarioQuerPercorer / autonomiaDoCarro) * 5.5);
        DecimalFormat decimalFormatado = new DecimalFormat("#.##");
        String numeroFormatado = decimalFormatado.format(valorParaPagar);

        System.out.println("O valor que sera cobrado será de: " + numeroFormatado);

        System.exit(0);
    }

}
