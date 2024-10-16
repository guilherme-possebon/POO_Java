
import javax.xml.stream.util.EventReaderDelegate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gposs
 */
public class Fibonacci {

    public static void main(String[] args) {
        int numeroMaixo = Entrada.leiaInt("Escreva um numero");

        if (numeroMaixo < 2) {
            System.out.println("Valor invalido");
        } else {
            int previous = 0;
            int current = 1;

            System.out.println(previous);
            System.out.println(current);

            for (int i = 0; i < numeroMaixo - 2; i++) {
                int next = previous + current;
                previous = current;
                current = next;

                System.out.println(current);
            }
        }

        System.exit(0);
    }
}
