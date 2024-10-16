package projetoone;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControlaCurso {

    private int serial = 1;
    private ArrayList<Curso> cursosList = new ArrayList();
    public ControlaProfessor controlaProfessores;
    public ControlaSala controlaSalas;

    public ControlaCurso(ControlaProfessor controlaProfessor, ControlaSala controlaSala) {
        this.controlaProfessores = controlaProfessor;
        this.controlaSalas = controlaSala;
    }

    public void adicionaCurso(Curso novoCurso) {
        novoCurso.setIdCurso(serial++);
        cursosList.add(novoCurso);
    }

    public ArrayList<Curso> getCursos() {
        return cursosList;
    }

    public Curso getCursoPorCodigo(int id) {
        for (Curso c : cursosList) {
            if (c.getIdCurso() == id) {
                return c;
            }
        }
        return null;
    }

    public String imprimeCursos() {
        String resultado = "";
        for (Curso curso : cursosList) {

            resultado += "Código: " + curso.getIdCurso() + "\n"
                    + "nome: " + curso.getNome() + "\n"
                    + "Inicio: " + curso.getDiaInicio() + "\n"
                    + "Fim do Curso: " + curso.getDiaFim() + "\n"
                    + "Professor: " + curso.getProfessor().getNomeProfessor() + "\n"
                    + "Predio: " + curso.getSala().getPredio() + " Sala: " + curso.getSala().getSala() + "\n\n";
        }
        return resultado;
    }

    public void alteraCursos(int codigo) {
        Boolean alteracao = null;
        for (Curso curso : cursosList) {
            if (curso.getIdCurso() == codigo) {
                JOptionPane.showMessageDialog(null, "Listagem do Curso para ser alterado\n"
                        + "Id do curso: " + curso.getIdCurso()
                        + "\nNome do curso: " + curso.getNome()
                        + "\nDia do inicio do curso: " + curso.getDiaInicio()
                        + "\nDia do final do curso: " + curso.getDiaFim()
                        + "\nNome do professor que leciona o curso: " + curso.getProfessor().getNomeProfessor()
                        + "\nPrédio: " + curso.getSala().getPredio() + " sala: " + curso.getSala().getSala());
                alteracao = Entrada.leiaBoolean("Deseja alterar o nome do curso?", "Sim", "Não");
                if (alteracao) {
                    String nomeAntigo = curso.getNome();
                    String nome = Entrada.leiaString("Para qual nome deseja alterar?");
                    curso.setNome(nome);
                    JOptionPane.showMessageDialog(null, "Nome trocado com sucesso!\n" + "Nome antigo: " + nomeAntigo + "\nNovo nome: " + curso.getNome());
                    alteracao = null;
                } else {
                    JOptionPane.showMessageDialog(null, "O nome do curso não sera alterado!");
                }

                alteracao = Entrada.leiaBoolean("Deseja alterar o dia de inicio/dia do fim do curso?", "Sim", "Não");
                if (alteracao) {
                    String dataInicioAntigo = curso.getDiaInicio();
                    String dataFimAntigo = curso.getDiaFim();
                    String dataInicio = Entrada.leiaString("Para qual data de inicio deseja alterar?");
                    curso.setDiaInicio(dataInicio);
                    String dataFim = Entrada.leiaString("Para qual data de fim deseja alterar?");
                    curso.setDiaInicio(dataFim);
                    JOptionPane.showMessageDialog(null, "Datas trocadas com sucesso!\n" + "Data de inicio antiga: " + dataInicioAntigo + " Data de fim antiga: " + dataFimAntigo + "\nNova data de incio: " + curso.getDiaInicio() + " Nova data de fim: " + curso.getDiaFim());
                    alteracao = null;
                } else {
                    JOptionPane.showMessageDialog(null, "As datas do curso não serão alteradas!");
                }
                int opcao = 0;
                while (opcao != 3) {
                    opcao = Entrada.leiaInt("Qual alterar?\n"
                            + "1 - Professor\n"
                            + "2 - Sala\n"
                            + "3 - Sair");
                    switch (opcao) {
                        case 1:
                            int codigoInscricao = Entrada.leiaInt("Digite o id do curso que deseja trocar:\n " + controlaProfessores.imprimeProfessor());
                            boolean professorEncontrado = false;
                            for (Professor professor : controlaProfessores.getProfessores()) {
                                if (professor.getIdProfessor() == codigoInscricao) {
                                    curso.setProfessor(professor);
                                    professorEncontrado = true;
                                    break;
                                }
                            }
                            if (!professorEncontrado) {
                                JOptionPane.showMessageDialog(null, "Professor não encontrado");
                            }

                            break;
                        case 2:
                            codigoInscricao = Entrada.leiaInt("Digite o id do aluno que deseja trocar:\n " + controlaSalas.imprimeSalas());
                            boolean salaEncontrada = false;
                            for (Sala sala : controlaSalas.getSalas()) {
                                if (sala.getIdSalaEPredio() == codigoInscricao) {
                                    curso.setSala(sala);
                                    salaEncontrada = true;
                                    break;
                                }
                            }
                            if (!salaEncontrada) {
                                JOptionPane.showMessageDialog(null, "Sala não encontrado");
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

    public void removerCurso(int codigo) {
        Curso cursoParaRemover = null;
        for (Curso curso : cursosList) {
            if (curso.getIdCurso() == codigo) {
                cursoParaRemover = curso;
            }
        }
        cursosList.remove(cursoParaRemover);
    }
}
