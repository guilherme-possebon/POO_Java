/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioradio;

/**
 *
 * @author pretto
 */
public class Radio {

    double estacao;
    private int volume;
    private boolean power;

    public void ligar() {
        power = true;
        estacao = 86.7;
        volume = 15;
    }

    public void desligar() {
        power = false;

    }

    public void avancarEstacao() {
        if (power == true) {
            estacao = estacao + 0.2;
        }
    }

    public void retrocederEstacao() {
        estacao = estacao - 0.2;
    }

    public double consultarEstacao() {
        return estacao;
    }

    public double consultarVolume() {
        return volume;
    }

}
