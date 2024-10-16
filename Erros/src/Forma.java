
/**
 *
 * @author artur
 */
public class Forma {

    private String nome;
    private String cor;
    private String areaQuadrada;

    public Forma(String areaQuadrada) {
        setAreaQuadrada(areaQuadrada);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAreaQuadrada() {
        return areaQuadrada;
    }

    public void setAreaQuadrada(String areaQuadrada) {
        this.areaQuadrada = areaQuadrada;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Forma forma) {
            return forma.nome.equals(nome) && forma.cor.equals(cor);
        }
        return false;
    }

}
