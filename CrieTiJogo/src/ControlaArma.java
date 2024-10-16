
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gposs
 */
public class ControlaArma {

    private ArrayList<Arma> armas = new ArrayList<>();

    int serial = 1;

    public void addNovaArma(Arma novaArma) {
        novaArma.setId(serial++);
        armas.add(novaArma);
    }

    public ArrayList<Arma> getArmas() {
        return armas;
    }

    public String imprimeArma() {
        String b = "";
        for (Arma a : armas) {
            b += "Id arma: " + a.getId() + "\nnome: " + a.getNome() + "\nmunicao: " + a.getMunicao() + "\ndano: " + a.getDano() + "\npreco: " + a.getPreco() + "\n";
        }
        return b;
    }

    public Arma getArmaPorCodigo(int codigo) {
        for (Arma arma : armas) {
            if (arma.getId() == codigo) {
                return arma;
            }
        }
        return null;
    }

}
