
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gposs
 */
public class Dicionario {

    private int serial = 0;

    ArrayList<Palavra> palavraArray = new ArrayList<>();

    public Dicionario() {
        carregaPalavras();
    }

    public void addPalavra() {
        Palavra palavra = new Palavra();
        palavra.palavra = Entrada.leiaString("Escreva uma palavra");

        if (containsIgnoreCase(palavra.palavra)) {
            System.out.println("Não é possivel adicionar a mesma palavra duas vezes");
        } else {
            palavra.id = ++serial;
            palavra.significado = Entrada.leiaString("Escreva o significado da palavra: " + palavra.palavra);
            palavraArray.add(palavra);
        }

    }

    public boolean containsIgnoreCase(String searchString) {
        for (Palavra p : palavraArray) {
            if (p.palavra.equalsIgnoreCase(searchString)) {
                return true;
            }
        }
        return false;
    }

    public Palavra consultarPalavraExata(String palavraDigitada) {

        for (Palavra p : palavraArray) {
            if (p.palavra.equalsIgnoreCase(palavraDigitada)) {
                return p;
            }
        }

        return null;
    }

    public ArrayList<Palavra> consultarPalavra(String palavraDigitada) {
        ArrayList<Palavra> palavrasFiltradas = new ArrayList<>();
        for (Palavra p : palavraArray) {
            if (p.palavra.toLowerCase().contains(palavraDigitada)) {
                palavrasFiltradas.add(p);
            }
        }

        return palavrasFiltradas;
    }

    public void imprimirDicionario() {

        for (Palavra p : palavraArray) {
            System.out.println("Id da palavra: " + p.id + " - " + p.palavra);
            System.out.println("Significado " + p.significado);
            System.out.println("--------");

        }

    }

    public void alteraPalvara(int codigo) {
        Palavra palavraParaAlterar = null;
        for (Palavra palavra : palavraArray) {
            if (palavra.id == codigo) {
                palavraParaAlterar = palavra;
            }
        }
        String alteracao = Entrada.leiaString("Palavra selecionada para alteração: " + palavraParaAlterar.palavra + ", agora digite a alteração");
        palavraParaAlterar.palavra = alteracao;

        boolean escolha = Entrada.leiaBoolean("Você deseja alterar o significado também?", "Sim", "Não");
        if (escolha) {
            String alteracaoSignificado = Entrada.leiaString("Significado que será alterado: " + palavraParaAlterar.significado + ", agora digite a alteração");
            palavraParaAlterar.significado = alteracaoSignificado;
        }

    }

    public void gravaPalavras() {
        try {
            String linhas = "";

            for (Palavra palavra : palavraArray) {
                linhas += palavra.id + ";" + palavra.palavra + ";" + palavra.significado + ";" + "\n";

            }
            Files.write(Path.of("C:\\Users\\gposs\\Documents\\NetBeansProjects\\dicionario\\database\\dicionario.txt"),
                    linhas.getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING
            );

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void removerPalavra(int codigo) {
        Palavra palavraParaRemover = null;
        for (Palavra palavra : palavraArray) {
            if (palavra.id == codigo) {
                palavraParaRemover = palavra;
            }
        }
        palavraArray.remove(palavraParaRemover);
    }

    public void carregaPalavras() {
        try {
            Path path = Path.of("C:\\Users\\gposs\\Documents\\NetBeansProjects\\dicionario\\database\\dicionario.txt");
            if (Files.exists(path)) {
                List<String> linhas = Files.readAllLines(path);
                for (String linha : linhas) {
                    String atributos[] = linha.split(";");
                    Palavra novaPalavra = new Palavra();
                    novaPalavra.id = Integer.parseInt(atributos[0]);
                    novaPalavra.palavra = atributos[1];
                    novaPalavra.significado = atributos[2];

                    palavraArray.add(novaPalavra);

                    serial = Math.max(serial, novaPalavra.id);
//                    if (novaPalavra.id > serial) {
//                        serial = novaPalavra.id;
//                    }
                }
                serial = linhas.size();
            }
//            path = Path.of("C:\\Users\\gposs\\Documents\\NetBeansProjects\\Dicionario2\\database\\dicionario_count.txt");
//            if (Files.exists(path)) {
//                serial = Integer.valueOf(Files.readAllLines(path).get(0));
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
