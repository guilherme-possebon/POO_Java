/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nomemaiornomemenor;

/**
 *
 * @author gposs
 */
public class NomeMaiorNomeMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Sem array
        String nome;
        String maiorNome = "";
        String menorNome = "";

        for (int i = 0; i < 10; i++) {
            nome = Entrada.leiaString("Escreva um nome");

            if (nome.length() > maiorNome.length()) {
                maiorNome = nome;
            }

            if (nome.length() < menorNome.length()) {
                menorNome = nome;
            }
        }

//        Com array
//        String nomes[] = new String[10];
//
//        for (int i = 0; i < nomes.length; i++) {
//            nomes[i] = Entrada.leiaString("Escreva o nome numero: " + (i + 1));
//        }
//        String nomeMaior = "";
//        String nomeMenor = nomes[0];
//        for (String nome : nomes) {
//            if (nome.length() > nomeMaior.length()) {
//                nomeMaior = nome;
//            }
//
//            if (nome.length() < nomeMenor.length()) {
//                nomeMenor = nome;
//            }
//
//        }
//        System.out.println(" Nome maior: " + nomeMaior + " Numero de letras do nome maior: " + nomeMaior.length());
//        System.out.println(" Nome menor: " + nomeMenor + " Numero de letras do nome menor: " + nomeMenor.length());
        System.exit(0);
    }
}
