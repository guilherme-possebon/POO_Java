package model;

/**
 *
 * @author artur
 */
public class Palavra {

    public int codigo;
    public String nome;
    public String significado;
    public int versao;

    public Palavra() {
    }

    public Palavra(String n, String s) {
        nome = n;
        significado = s;

        getNome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }

    public int getId() {
        return codigo;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Palavra p) {
            return codigo == p.codigo;
        }

        return false;
    }

}
