package controlas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import model.Palavra;

/**
 *
 * @author artur
 */
public class Dicionario {

    private ArrayList<Palavra> palavras = new ArrayList();
    private int serial = 0;

    public Dicionario() {
        carregaPalavras();
    }

    public int getProximoSerial() {
        return ++serial;
    }

    public int getCodigo() {
        return
    }

    public void addPalavra(Palavra novoObjeto) {
        if (consultarPalavraExata(novoObjeto.nome) == null) {
            novoObjeto.codigo = getProximoSerial();
            palavras.add(novoObjeto);

            System.out.println("Palavra cadastrada com sucesso!");
        } else {
            System.out.println("Palavra com o nome " + novoObjeto.nome + " já existe!");
        }
    }

    public Palavra consultarPalavraPorCodigo(int codigo) {
        for (Palavra palvaraDentroDoArray : palavras) {
            if (palvaraDentroDoArray.codigo == codigo) {
                return palvaraDentroDoArray;
            }
        }

        return null;
    }

    public Palavra consultarPalavraExata(String textoParaBuscar) {
        for (Palavra palvaraDentroDoArray : palavras) {
            if (palvaraDentroDoArray.nome.equals(textoParaBuscar)) {
                return palvaraDentroDoArray;
            }
        }

        return null;
    }

    public ArrayList<Palavra> consultarPalavra(String textoParaBuscar) {
        ArrayList<Palavra> palavrasFiltradas = new ArrayList();

        for (Palavra palvaraDentroDoArray : palavras) {
            if (palvaraDentroDoArray.nome.toLowerCase().contains(textoParaBuscar.toLowerCase())
                    || palvaraDentroDoArray.significado.contains(textoParaBuscar)) {
                palavrasFiltradas.add(palvaraDentroDoArray);
            }
        }

        return palavrasFiltradas;
    }

    public ArrayList<Palavra> getPalavras() {
        return palavras;
    }

    public void imprimeDicionario() {
        for (Palavra p : palavras) {
            System.out.println(p.codigo + " " + p.nome + " " + p.significado);
            System.out.println("----------------");
        }
    }

    public void gravaPalavras() {
        try {
            String linhas = "";

            for (Palavra palavra : palavras) {
                linhas += palavra.codigo + ";" + palavra.nome + ";" + palavra.significado + ";" + "\n";

            }
            Files.write(Path.of("C:\\Users\\gposs\\Documents\\NetBeansProjects\\Dicionario2\\database\\dicionario.txt"),
                    linhas.getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING
            );

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void removerPalavra(Palavra palavra) {
        Palavra palavraParaRemover = null;
        Palavra mensagemDoDelete = null;
        mensagemDoDelete.nome = "Palavra deletada";
        mensagemDoDelete.significado = "Significado deletado";
        for (Palavra palavra : palavras) {
            if (palavra.codigo == codigo) {
                palavraParaRemover = palavra;
            }
        }
        palavras.remove(palavraParaRemover);
        palavras.add(mensagemDoDelete);
    }

    public void alteraPalavra(int codigo) {

    }

    public void carregaPalavras() {
        try {
            Path path = Path.of("C:\\Users\\gposs\\Documents\\NetBeansProjects\\Dicionario2\\database\\dicionario.txt");
            if (Files.exists(path)) {
                List<String> linhas = Files.readAllLines(path);
                for (String linha : linhas) {
                    String atributos[] = linha.split(";");
                    Palavra novaPalavra = new Palavra();
                    novaPalavra.codigo = Integer.parseInt(atributos[0]);
                    novaPalavra.nome = atributos[1];
                    novaPalavra.significado = atributos[2];

                    palavras.add(novaPalavra);

                    serial = Math.max(serial, novaPalavra.codigo);
                    if (novaPalavra.codigo > serial) {
                        serial = novaPalavra.codigo;
                    }
                }
                serial = linhas.size();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
