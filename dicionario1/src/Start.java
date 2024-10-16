
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gposs
 */
public class Start {

    public static void main(String[] args) {
        int menu = 0;

        Dicionario dicionario = new Dicionario();

        while (menu != 7) {
            menu = Entrada.leiaInt("Escreva o numero correspondente a opção\n\n"
                    + "[1] - Cadastrar palavra\n"
                    + "[2] - Consultar palavra exata\n"
                    + "[3] - Consultar palavra (Lista de todas as palavras parecidas)\n"
                    + "[4] - Imprimir dicionario inteiro\n"
                    + "[5] - Alterar palavra\n"
                    + "[6] - Deletar palavra\n"
                    + "[7] - Sair");

            switch (menu) {
                case 1:
                    dicionario.addPalavra();
                    break;
                case 2:

                    System.out.println("Consulta palavra especifica");
                    String palavraDigitada = Entrada.leiaString("Digite a palavra para ser consultada");

                    Palavra palavra = dicionario.consultarPalavraExata(palavraDigitada);

                    if (palavra != null) {
                        System.out.println("Id da palavra: " + palavra.id + " - " + palavra.palavra);
                        System.out.println("Significado: " + palavra.significado);
                        System.out.println("--------");
                    } else {
                        System.out.println("Palavra digitada não encontrada");
                    }
                    break;
                case 3:

                    System.out.println("Consulta de todas as palavras");

                    palavraDigitada = Entrada.leiaString("Digite a palavra para ser consultada");

                    ArrayList<Palavra> palavrasFiltradas = dicionario.consultarPalavra(palavraDigitada);

                    if (!palavrasFiltradas.isEmpty()) {
                        System.out.println("Foram encontradas " + palavrasFiltradas.size() + " palavras");
                        for (Palavra p : palavrasFiltradas) {
                            System.out.println("--------");
                            System.out.println("Id da palavra: " + p.id + " - " + p.palavra);
                            System.out.println("Significado: " + p.significado);
                            System.out.println("--------");
                        }
                    } else {
                        System.out.println("Nenhuma palavra foi encontrada");
                    }
                    break;

                case 4:
                    System.out.println("Dicionario");
                    dicionario.imprimirDicionario();
                    break;
                case 5:
                    System.out.println("Alterar palavra");
                    int codigo = Entrada.leiaInt("Digite o código da palavra que deseja alterar: ");
                    for (Palavra p : dicionario.palavraArray) {
                        System.out.println("--------");
                        System.out.println("Id da palavra: " + p.id + " - " + p.palavra);
                        System.out.println("Significado: " + p.significado);
                        System.out.println("--------");
                    }
                    dicionario.alteraPalvara(codigo);
                    break;
                case 6:
                    System.out.println("Remove palavra");
                    for (Palavra p : dicionario.palavraArray) {
                        System.out.println("--------");
                        System.out.println("Id da palavra: " + p.id + " - " + p.palavra);
                        System.out.println("Significado: " + p.significado);
                        System.out.println("--------");
                    }
                    codigo = Entrada.leiaInt("Digite o código da palavra que deseja remover: ");
                    dicionario.removerPalavra(codigo);
                    break;
                case 7:
                    System.out.println("Saindo...");
                    dicionario.gravaPalavras();
                    menu = 7;
                    break;
                default:
                    System.out.println("Numero digitado invalido");
            }
        }

        System.exit(0);
    }

}
