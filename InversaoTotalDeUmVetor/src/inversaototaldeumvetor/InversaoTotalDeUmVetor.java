/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inversaototaldeumvetor;

/**
 *
 * @author gposs
 */
public class InversaoTotalDeUmVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nomes[] = new String[10];
        String aux = "";

        for (int i = 0; i < 10; i++) {
            nomes[i] = Entrada.leiaString("Escreva um nome");
        }

//        for (int i = 9; i >= 0; i--) {
//            String aux = "";
//
//            System.out.println(nomes[i]);
//
//        }
        int j = 9;
        for (int i = 0; i < nomes.length / 2; i++) {
            aux = nomes[i];
            nomes[i] = nomes[j];
            nomes[j] = aux;
            j--;
        }
        System.exit(0);
    }

}
