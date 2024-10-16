/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author Henrique Mena
 */
public class Sala {

    private int idSalaEPredio = 1;
    private int predio;
    private int sala;

    public Sala(int predio, int sala) {
        this.idSalaEPredio = idSalaEPredio++;
        this.predio = predio;
        this.sala = sala;

    }

    public void setIdSalaEPredio(int idSalaEPredio)
    {
        this.idSalaEPredio = idSalaEPredio;
    }

    public Sala() 
    {
    }

    public int getIdSalaEPredio() {
        return idSalaEPredio;
    }

    public int getPredio() {
        return predio;
    }

    public void setPredio(int predio) {
        this.predio = predio;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public void imprimeSalas(ArrayList<Sala> salas) {

        for (Sala s : salas) {

            System.out.println("Id da sala/predio: " + s.getIdSalaEPredio() + " - numero do prédio: " + s.getPredio() + " - numero da sala: " + s.getSala());
            System.out.println("----------------------");
        }
    }
}
