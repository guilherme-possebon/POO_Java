package projetoone;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControlaProfessor {

    private int serial = 1;
    private ArrayList<Professor> professoresList = new ArrayList();

    public void adicionaProfessor(Professor novoProfessor) {
        novoProfessor.setIdProfessor(serial++);
        professoresList.add(novoProfessor);
    }

    public ArrayList<Professor> getProfessores() {
        return professoresList;
    }

    public Professor getProfessorPorCodigo(int id) {
        for (Professor p : professoresList) {
            if (p.getIdProfessor() == id) {
                return p;
            }
        }
        return null;
    }

    public String imprimeProfessor() {
        String resultado = "";
        for (Professor professor : professoresList) {
            resultado += "Código: " + professor.getIdProfessor() + " \n "
                    + "Nome: " + professor.getNomeProfessor() + "\n"
                    + "CPF Professor: " + professor.getCpfProfessor() + "\n\n";
        }
        return resultado;
    }

    public void alteraProfessor(int codigo) {
        Boolean alteracao = null;
        for (Professor professor : professoresList) {
            if (professor.getIdProfessor() == codigo) {

                JOptionPane.showMessageDialog(null, "Listagem do professor para ser alterado\n"
                        + "Nome do professor: " + professor.getNomeProfessor() + " CPF do professor: " + professor.getCpfProfessor());

                alteracao = Entrada.leiaBoolean("Deseja alterar o nome do professor?", "Sim", "Não");
                if (alteracao) {
                    String nomeAntigo = professor.getNomeProfessor();
                    String nomeNovo = Entrada.leiaString("Para qual nome deseja alterar?");
                    professor.setNomeProfessor(nomeNovo);

                    JOptionPane.showMessageDialog(null, "Nome trocado com sucesso!\n"
                            + "Nome antigo: " + nomeAntigo
                            + "\nNome alterado para: " + professor.getNomeProfessor());

                    alteracao = null;
                } else {
                    JOptionPane.showMessageDialog(null, "O nome do professor não sera alterado!");
                }

                alteracao = Entrada.leiaBoolean("Deseja alterar o CPF do professor?", "Sim", "Não");
                if (alteracao) {
                    String CPFAntigo = professor.getCpfProfessor();
                    String CPFNovo = Entrada.leiaString("Escreva o novo CPF");
                    professor.setCpfProfessor(CPFNovo);
                    JOptionPane.showMessageDialog(null, "CPF trocado com sucesso!\n"
                            + "CPF antigo: " + CPFAntigo
                            + "\nCPF alterado para: " + professor.getCpfProfessor());
                } else {
                    JOptionPane.showMessageDialog(null, "O nome do professor não sera alterado!");
                }
            }
        }
    }

    public void removerProfessor(int codigo) {
        Professor professorParaRemover = null;
        for (Professor professor : professoresList) {
            if (professor.getIdProfessor() == codigo) {
                professorParaRemover = professor;
            }
        }
        professoresList.remove(professorParaRemover);
    }
}
