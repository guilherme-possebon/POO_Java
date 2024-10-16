package projetoone;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControlaInscricao {

    private int serial = 1;
    private ArrayList<Inscricao> inscricaoList = new ArrayList();
    private ControlaCurso controlaCursos;
    private ControlaAluno controlaAlunos;

    public ControlaInscricao(ControlaCurso controlaCurso, ControlaAluno controlaAluno) {
        this.controlaAlunos = controlaAluno;
        this.controlaCursos = controlaCurso;
    }

    public void adicionaInscricao(Inscricao novaInscricao) {
        novaInscricao.setIdInscricao(serial++);
        inscricaoList.add(novaInscricao);
    }

    public ArrayList<Inscricao> getInscricoes() {
        return inscricaoList;
    }

    public Inscricao getInscricaoPorCodigo(int codigo) {
        for (Inscricao inscricao : inscricaoList) {
            if (inscricao.getIdInscricao() == codigo) {
                return inscricao;
            }
        }
        return null;
    }

    public String imprimeInscricoes() {
        String resultado = "";
        for (Inscricao inscricao : inscricaoList) {
            resultado += "Código: " + inscricao.getIdInscricao() + "\n"
                    + "Curso: " + inscricao.getCurso() + "\n"
                    + "Aluno: " + inscricao.getAluno() + "\n\n";
        }
        return resultado;

    }

    public void alteraInscricao(int codigo) {
        for (Inscricao inscricao : inscricaoList) {
            if (inscricao.getIdInscricao() == codigo) {
                int opcao = 0;
                while (opcao != 3) {
                    opcao = Entrada.leiaInt("Qual alterar?\n"
                            + "1 - Cursos\n"
                            + "2 - Alunos\n"
                            + "3 - Sair");
                    switch (opcao) {
                        case 1:
                            int codigoInscricao = Entrada.leiaInt("Digite o id do curso que deseja trocar:\n " + controlaCursos.imprimeCursos());
                            boolean cursoEncontrado = false;
                            for (Curso curso : controlaCursos.getCursos()) {
                                if (curso.getIdCurso() == codigoInscricao) {
                                    inscricao.setCurso(curso);
                                    cursoEncontrado = true;
                                    break;
                                }
                            }
                            if (!cursoEncontrado) {
                                JOptionPane.showMessageDialog(null, "Curso não encontrado");
                            }

                            break;
                        case 2:
                            codigoInscricao = Entrada.leiaInt("Digite o id do aluno que deseja trocar:\n " + controlaAlunos.imprimeAlunos());
                            boolean alunoEncontrado = false;
                            for (Aluno aluno : controlaAlunos.getAlunos()) {
                                if (aluno.getIdAluno() == codigoInscricao) {
                                    inscricao.setAluno(aluno);
                                    alunoEncontrado = true;
                                    break;
                                }
                            }
                            if (!alunoEncontrado) {
                                JOptionPane.showMessageDialog(null, "Aluno não encontrado");
                            }

                            break;
                        case 3:
                            System.out.println("Saindo da alteracao da inscricao");
                            break;
                        default:
                            throw new AssertionError();
                    }

                }
            }
        }
    }

    public void removeInscricao(int codigo) {
        Inscricao inscricaoParaRemover = null;
        for (Inscricao inscricao : inscricaoList) {
            if (inscricao.getIdInscricao() == codigo) {
                inscricaoParaRemover = inscricao;
            }
        }
        inscricaoList.remove(inscricaoParaRemover);
    }
}
