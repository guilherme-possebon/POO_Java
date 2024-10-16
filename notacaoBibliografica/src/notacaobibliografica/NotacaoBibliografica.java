/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notacaobibliografica;

/**
 *
 * @author gposs
 */
public class NotacaoBibliografica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcao = 0;
        String inputString = Entrada.leiaString("Escreva um nome de um autor");
        String[] words = inputString.split("\\s+");

        while (opcao != 6) {

            opcao = Entrada.leiaInt(""
                    + "[1] - Exibir notação bibliográfica\n"
                    + "[2] - Exibir somente primeiro nome\n"
                    + "[3] - Exibir somente último sobrenome\n"
                    + "[4] - Exibir somente as iniciais\n"
                    + "[5] - Ler outro nome\n"
                    + "[6] - Sair");

            switch (opcao) {
                case 1:
                    System.out.println("Exibir notação bibliográfica");
                    String restOfName = "";
                    for (int i = 0; i < words.length - 1; i++) {
                        restOfName += words[i];
                        if (i < words.length - 1) {
                            restOfName += " ";
                        }
                    }
                    System.out.println("Notação bibliográfica: " + words[words.length - 1].toUpperCase() + ", " + restOfName);
                    break;
                case 2:
                    System.out.println("Exibir somente primeiro nome");
                    System.out.println("Notação bibliográfica: " + words[0]);
                    break;
                case 3:
                    System.out.println("Exibir somente último sobrenome");
                    System.out.println("Notação bibliográfica: " + words[words.length - 1]);
                    break;
                case 4:
                    System.out.println("Exibir somente as iniciais");
                    String initials = "";
                    for (int i = 0; i < words.length; i++) {
                        char firstLetter = words[i].charAt(0);
                        initials += firstLetter;
                    }
                    System.out.println("As iniciais são: " + initials);
                    break;
                case 5:
                    inputString = Entrada.leiaString("Escreva um nome de um autor");
                    words = inputString.split("\\s+");
                    break;
                default:
                    break;
            }
        }

        System.exit(0);
    }

}
