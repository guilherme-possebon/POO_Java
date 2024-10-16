package projetoone;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControlaSala {

    private int serial = 1;
    private ArrayList<Sala> salasList = new ArrayList();

    public void addSala(Sala novaSala) {
        novaSala.setIdSalaEPredio(serial++);
        salasList.add(novaSala);
    }

    public ArrayList<Sala> getSalas() {
        return salasList;
    }

    public Sala getSalasPorCodigo(int codigo) {
        for (Sala sala : salasList) {
            if (sala.getIdSalaEPredio() == codigo) {
                return sala;
            }
        }
        return null;
    }

    public String imprimeSalas() {
        String resultado = "";
        for (Sala sala : salasList) {
            resultado += "Código: " + sala.getIdSalaEPredio() + "\n"
                    + "Predio: " + sala.getPredio() + "\n"
                    + "sala: " + sala.getSala() + "\n\n";
        }

        return resultado;
    }

    public void alteraSalas(int codigo) {
        Boolean alteracao = null;
        for (Sala sala : salasList) {
            if (sala.getIdSalaEPredio() == codigo) {

                JOptionPane.showMessageDialog(null, "Listagem do sala para ser alterada\n"
                        + "Numero do predio: " + sala.getPredio()
                        + "Numero da sala: " + sala.getSala()
                );

                alteracao = Entrada.leiaBoolean("Deseja alterar o numero do predio?", "Sim", "Não");
                if (alteracao) {
                    int numeroAntigoPredio = sala.getPredio();
                    int numeroNovoPredio = Entrada.leiaInt("Para qual numero deseja alterar?");
                    sala.setPredio(numeroNovoPredio);

                    JOptionPane.showMessageDialog(null, "Numero trocado com sucesso!\n"
                            + "Numero antigo: " + numeroAntigoPredio
                            + "\nNumero alterado para: " + sala.getPredio());

                    alteracao = null;
                } else {
                    JOptionPane.showMessageDialog(null, "O numero do predio não sera alterado!");
                }

                alteracao = Entrada.leiaBoolean("Deseja alterar o numero da sala?", "Sim", "Não");
                if (alteracao) {
                    int numeroAntigoSala = sala.getSala();
                    int numeroNovoSala = Entrada.leiaInt("Para qual numero deseja alterar?");
                    sala.setSala(numeroNovoSala);

                    JOptionPane.showMessageDialog(null, "Numero trocado com sucesso!\n"
                            + "Numero antigo: " + numeroAntigoSala
                            + "\nNumero alterado para: " + sala.getSala());

                    alteracao = null;
                } else {
                    JOptionPane.showMessageDialog(null, "O numero da sala não sera alterado!");
                }

            }
        }
    }

    public void removerSala(int codigo) {
        Sala salaParaRemover = null;
        for (Sala sala : salasList) {
            if (sala.getIdSalaEPredio() == codigo) {
                salaParaRemover = sala;
            }
        }
        salasList.remove(salaParaRemover);
    }
}
