
import telas.TelaPrincipal;
import util.ConexaoDB;

/**
 *
 * @author artur
 */
public class Start {

    public static void main(String[] args) {

        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setLocationRelativeTo(null);
        telaPrincipal.setVisible(true);
        ConexaoDB.getInstance();
    }
}
