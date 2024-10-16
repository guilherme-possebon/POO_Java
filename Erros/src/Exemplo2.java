
/**
 *
 * @author artur
 */
public class Exemplo2 {

    public static void main(String[] args) {
        Forma f1 = new Forma("triangulo");
        f1.setCor("blue");

        Forma f2 = new Forma("triangulo");
        f2.setCor("blue");

        //tem que ser igual "true"
        System.out.println(f1.equals(f2));
    }
}
