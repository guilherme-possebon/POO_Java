/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioradio;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author pretto
 */
public class ExercicioRadio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("BEM-VINDO AO RÁDIO MÁGICO");

        Radio meuRadio = new Radio();

        meuRadio.ligar();

        System.out.println("Estação atual: " + meuRadio.consultarEstacao());

        meuRadio.avancarEstacao();

        System.out.println("Estação atual: " + meuRadio.consultarEstacao());

        meuRadio.avancarEstacao();

        System.out.println("Estação atual: " + meuRadio.consultarEstacao());

        Radio meuRadio2 = new Radio();
        meuRadio2.ligar();
        System.out.println("Estação atual: " + meuRadio2.consultarEstacao());

        ArrayList<Radio> radios = new ArrayList();

        for (int i = 0; i < 10; i++) {
            Radio radinho = new Radio();
            radios.add(radinho);
        }

        radios.get(0).ligar();

        JOptionPane.showMessageDialog(null, "opaaaaaaa");
        
        
        
        
    }

}
