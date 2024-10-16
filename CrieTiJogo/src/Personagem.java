
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gposs
 */
public class Personagem {

    private int id;
    private String nome;
    private int vida;
    private double dinheiro;
    private ArrayList<Arma> armasDoInventario = new ArrayList<>();

    ;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public ArrayList<Arma> getArmas() {
        return armasDoInventario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(int vida) {

        this.vida = vida;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public void setArmasNoInventario(Arma armaNova) {
        armasDoInventario.add(armaNova);
    }

}
