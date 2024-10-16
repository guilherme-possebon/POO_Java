package mercado;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gposs
 */
public class Produto {

    public int codigo;
    public double valor;
    public String nome;
    public int quantidade;

    public Produto() {
    }

    public Produto(int codigo, String nome, double valor, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        if (quantidade > 0) {
            return "\n" + codigo + " - " + nome + " - " + valor + " - " + quantidade + " valor total = " + (valor * quantidade);
        }
        return "\n" + codigo + " - " + nome + " - " + valor;
    }

}
