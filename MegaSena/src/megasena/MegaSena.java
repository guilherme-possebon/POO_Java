/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package megasena;

/**
 *
 * @author gposs
 */
public class MegaSena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numerosSorteados[] = new int[6];
        int acertos = 0;

        // gerar os números
        int min = 0;
        int max = 60;
        for (int i = 0; i < 6; i++) {
            numerosSorteados[i] = (int) (Math.random() * (max - min) + min);
        }

        // ler chutes do usuário
        for (int i = 0; i < 6; i++) {
            int chute = Entrada.leiaInt("Chute um número entre 0 e 60");

            // para cada número chutado, comparar com os sorteados
            // versão 1
//            if (chute == numerosSorteados[0]
//                    || chute == numerosSorteados[1]
//                    || chute == numerosSorteados[2]
//                    || chute == numerosSorteados[3]
//                    || chute == numerosSorteados[4]
//                    || chute == numerosSorteados[5]) {
//                acertos++;
//            }
            // versão 2
            for (int j = 0; j < 6; j++) {
                if (chute == numerosSorteados[j]) {
                    acertos++;
                }
            }

        }

        System.out.println("Número de acertos: " + acertos);
        System.out.println("Números sorteados: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(numerosSorteados[i] + " - ");
        }

        System.exit(0);
    }

//    public static void main(String[] args) {
//        int numerosDoUsuario[] = new int[6];
//        int numerosAleatorios[] = new int[6];
//        int countTimes = 0;
//        for (int i = 0; i < 6; i++) {
//            numerosDoUsuario[i] = Entrada.leiaInt("Escreva um numero entre 0 a 60");
//            numerosAleatorios[i] = (int) (Math.random() * 60);
//        }
//
//        int count = 0;
//
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 6; j++) {
//                if (numerosDoUsuario[i] == numerosAleatorios[j]) {
//                    count++;
//                    countTimes++;
//                }
//            }
//        }
//
//        if (count == 6) {
//            System.out.println("Voce acertou todos os seis numeros" + countTimes);
//        } else {
//            System.out.println("Voce acertou: " + count + " numero(s)");
//        }
//        for (int i = 0; i < 6; i++) {
//            System.out.println(numerosAleatorios[i]);
//        }
//
//        System.exit(0);
//    }
}
