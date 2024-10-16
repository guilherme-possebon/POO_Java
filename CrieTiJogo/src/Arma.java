/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gposs
 */
public class Arma {

    private int id;
    private String nome;
    private int municao;
    private int dano;
    private double preco;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getMunicao() {
        return municao;
    }

    public int getDano() {
        return dano;
    }

    public double getPreco() {
        return preco;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMunicao(int municao) {
        this.municao = municao;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Id arma: " + id + ", nome: " + nome + ", municao: " + municao + ", dano: " + dano + ", preco: " + preco + "\n";
    }

}
