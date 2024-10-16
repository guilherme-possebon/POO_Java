package projetoone;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControlaAluno {

    private int serial = 1;
    private ArrayList<Aluno> alunosList = new ArrayList();

    public void adicionaAluno(Aluno novoAluno) {
        novoAluno.setIdAluno(serial++);
        alunosList.add(novoAluno);
    }

    public ArrayList<Aluno> getAlunos() {
        return alunosList;
    }

    public Aluno getAlunoPorCodigo(int id) {
        for (Aluno a : alunosList) {
            if (a.getIdAluno() == id) {
                return a;
            }
        }
        return null;
    }

    public String imprimeAlunos() {
        String resultado = "";
        for (Aluno aluno : alunosList) {
            resultado += aluno.getIdAluno() + " - " + aluno.getNomeAluno() + "\n\n";
        }
        return resultado;
    }

    public void alteraAlunos(int codigo) {
        Boolean alteracao = null;
        for (Aluno aluno : alunosList) {
            if (aluno.getIdAluno() == codigo) {

                JOptionPane.showMessageDialog(null, "Listagem do aluno para ser alterado\n"
                        + "Nome do aluno: " + aluno.getNomeAluno());

                alteracao = Entrada.leiaBoolean("Deseja alterar o nome do aluno?", "Sim", "Não");
                if (alteracao) {
                    String nomeAntigo = aluno.getNomeAluno();
                    String nomeNovo = Entrada.leiaString("Para qual nome deseja alterar?");
                    aluno.setNomeAluno(nomeNovo);

                    JOptionPane.showMessageDialog(null, "Nome trocado com sucesso!\n"
                            + "Nome antigo: " + nomeAntigo
                            + "\nNome alterado para: " + aluno.getNomeAluno());

                    alteracao = null;
                } else {
                    JOptionPane.showMessageDialog(null, "O nome do aluno não sera alterado!");
                }

            }
        }
    }

    public void removerAluno(int codigo) {
        Aluno alunoParaRemover = null;
        for (Aluno aluno : alunosList) {
            if (aluno.getIdAluno() == codigo) {
                alunoParaRemover = aluno;
            }
        }
        alunosList.remove(alunoParaRemover);
    }

}
