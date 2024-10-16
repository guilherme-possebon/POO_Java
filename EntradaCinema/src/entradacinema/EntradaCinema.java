/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entradacinema;

import java.util.Scanner;

/**
 *
 * @author gposs
 */
public class EntradaCinema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int contadorDeEspectadorEstudante = 0, contadorDeEspectadorNormal = 0;
        int cont = 0;

        while (cont < 5) {
            System.out.println("Informe a sua idade");
            int idade = leitor.nextInt();

            if (idade < 14) {
                System.out.println("Proibida a entrada por ser menor de 14, próximo\n");
            } else if (idade >= 14) {
                System.out.println("Qual o seu tipo de ingreço? (n - Normal / e - Estudante ) ");
                char classificacao = leitor.next().charAt(0);

                if (classificacao == 'n') {
                    contadorDeEspectadorNormal = contadorDeEspectadorNormal + 1;
                } else if (classificacao == 's') {
                    contadorDeEspectadorEstudante = contadorDeEspectadorEstudante + 1;
                }
                cont++;
            }
        }

        System.out.println("Numero de ingreços de estudantes:" + contadorDeEspectadorEstudante + "  valor de arrecadação: " + (contadorDeEspectadorEstudante * 12.5) + "\n");
        System.out.println("Numero de ingreços de normais:" + contadorDeEspectadorNormal + "  valor de arrecadação: " + (contadorDeEspectadorNormal * 25) + "\n");
        System.out.println("Numero total de espectadores: " + (contadorDeEspectadorEstudante + contadorDeEspectadorNormal) + " Valor total arrecadado: " + ((contadorDeEspectadorEstudante * 12.5) + (contadorDeEspectadorNormal * 25)));
    }

}
