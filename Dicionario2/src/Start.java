
import controlas.Dicionario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Palavra;
import util.Entrada;

/**
 *
 * @author artur
 */
public class Start {

    public static void main(String[] args) {
        Dicionario aurelio = new Dicionario();

        while (true) {
            int opcao = Entrada.leiaInt("Menu \n "
                    + "[1] - Cadastrar Palavra \n"
                    + "[2] - Consultar Palavra Exata\n"
                    + "[3] - Consultar Palavra (Pedaço)\n"
                    + "[4] - Imprimir Dicionario \n"
                    + "[5] - Alterar\n"
                    + "[6] - Remover\n"
                    + "[7] - Sair"
            );

            if (opcao == 1) {
                Palavra novaPalavra = new Palavra();
                novaPalavra.nome = Entrada.leiaString("Nome: ");
                novaPalavra.significado = Entrada.leiaString("Significado: ");

                aurelio.addPalavra(novaPalavra);
            } else if (opcao == 2) {
                String nomeDigitadoPeloUsuario = Entrada.leiaString("Qual palavar você quer consultar?");

                Palavra palavaEncontrada = aurelio.consultarPalavraExata(nomeDigitadoPeloUsuario);

                if (palavaEncontrada != null) {
                    System.out.println("Código " + palavaEncontrada.codigo);
                    System.out.println("Palvara: " + palavaEncontrada.nome);
                    System.out.println("Significado: " + palavaEncontrada.significado);
                } else {
                    System.out.println("Palavra não encontrada no dicionário");
                }
            } else if (opcao == 3) {
                String nomeDigitadoPeloUsuario = Entrada.leiaString("Qual \"pedaço\"palavra você quer consultar?");

                ArrayList<Palavra> palavrasFiltradas = aurelio.consultarPalavra(nomeDigitadoPeloUsuario);

                if (!palavrasFiltradas.isEmpty()) {
                    System.out.println("Foram encontradas " + palavrasFiltradas.size() + "!");

                    for (Palavra palavraFiltrada : palavrasFiltradas) {
                        System.out.println("--------------------------------------------");
                        System.out.println("Código " + palavraFiltrada.codigo);
                        System.out.println("Palvara: " + palavraFiltrada.nome);
                        System.out.println("Significado: " + palavraFiltrada.significado);
                        System.out.println("--------------------------------------------");
                    }
                } else {
                    System.out.println("Não foi encontrada nenhuma palavra!");
                }
            } else if (opcao == 4) {
                aurelio.imprimeDicionario();
            } else if (opcao == 5) {
                String nomeDigitadoPeloUsuario = Entrada.leiaString("Qual palavar você quer alterar?");

                Palavra palavaEncontrada = aurelio.consultarPalavraExata(nomeDigitadoPeloUsuario);

                if (palavaEncontrada != null) {
                    aurelio.removerPalavra(palavaEncontrada);

                    JOptionPane.showMessageDialog(null, "Palavra removida com sucesso!");
                } else {
                    System.out.println("Palavra não encontrada no dicionário");
                }
            } else if (opcao == 6) {

            } else if (opcao == 7) {
                aurelio.gravaPalavras();
                System.out.println("Tchau!");
                System.exit(0);
            }

        }
    }
}
