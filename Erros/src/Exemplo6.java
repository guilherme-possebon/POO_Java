
import java.util.ArrayList;

/**
 *
 * @author artur
 */
public class Exemplo6 {

    public static void main(String[] args) {
        ArrayList<Carro> carros = new Exemplo6().getCarros();

        for (Carro carro : carros) {
            System.out.println(carro.getMarca() + " - " + carro.getModelo());
        }
    }

    private ArrayList<Carro> carros = new ArrayList<>();

    public Exemplo6() {
        Carro carro = new Carro();
        carro.setCor("Azul");
        carro.setMarca("Fiat");
        carro.setModelo("Uno");

        carros.add(carro);
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }

}
