
/**
 *
 * @author art
 */
public class Exemplo5 {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setCor("Azul");
        carro.setMarca("Fiat");
        carro.setModelo("Uno");
        carro.setPotencia(1.0);
        carro.setQuantidadePortas(2);
        carro.setVelocidadeMaxima(120);

        carro.ligar();
        carro.acelerar();
        carro.acelerar(30);
        carro.frear();
        carro.frear(30);
        carro.desligar();
    }
}
