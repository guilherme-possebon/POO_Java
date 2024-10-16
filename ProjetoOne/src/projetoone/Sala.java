package projetoone;

import java.util.ArrayList;

public class Sala {

    private int idSalaEPredio = 1;
    private int predio;
    private int sala;

    public Sala(int predio, int sala) {
        this.idSalaEPredio = idSalaEPredio++;
        this.predio = predio;
        this.sala = sala;

    }

    public void setIdSalaEPredio(int idSalaEPredio) {
        this.idSalaEPredio = idSalaEPredio;
    }

    public Sala() {
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

    @Override
    public String toString() {
        return "{Predio = " + predio + ", Sala = " + sala + "}";
    }

    public void imprimeSalas(ArrayList<Sala> salas) {

        for (Sala s : salas) {

            System.out.println("Id da predio/sala: " + s.getIdSalaEPredio() + " - numero do prédio: " + s.getPredio() + " - numero da sala: " + s.getSala());
        }
    }
}
