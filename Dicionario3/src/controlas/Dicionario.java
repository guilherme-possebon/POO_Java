package controlas;

import dao.PalavraDAO;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Palavra;

/**
 *
 * @author artur
 */
public class Dicionario {

    private PalavraDAO dao = new PalavraDAO();

    public Dicionario() {

    }

    public String addPalavra(Palavra novoObjeto) {
        try {
            if (novoObjeto.nome.isEmpty() && novoObjeto.significado.isEmpty()) {
                return "Prencha todos os campos!";
            }
            if (consultarPalavraExata(novoObjeto.nome) == null) {

                dao.insert(novoObjeto);

                return "Palavra cadastrada com sucesso!";
            } else {
                return "Palavra com o nome " + novoObjeto.nome + " já existe!";
            }
        } catch (Exception ex) {
            Logger.getLogger(Dicionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Palavra consultarPalavraPorCodigo(int codigo) {
        return dao.consultarPalavraPorCodigo(codigo);
    }

    public Palavra consultarPalavraExata(String textoParaBuscar) {
        return dao.consultarPalavraExata(textoParaBuscar);
    }

    public ArrayList<Palavra> consultarPalavra(String textoParaBuscar) {
        return dao.consultarPalavra(textoParaBuscar);
    }

    public ArrayList<Palavra> getPalavras() {
        return dao.getPalavras();
    }

    public void removePalavra(Palavra palavraParaRemover) {
        palavras.remove(palavraParaRemover);
    }

    public void removePalavra(int index) {
        palavras.remove(index);
    }

    public void alteraPalavra(int codigo) {
        for (Palavra palavra : palavras) {
            if (palavra.getId() == codigo) {

            }
        }
    }

}
