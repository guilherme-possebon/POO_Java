package javaapplication1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ControlaCurso {

    private int serial = 0;
    private ArrayList<Curso> cursos = new ArrayList();
    public ControlaProfessor controlaProfessores;
    public ControlaSala controlaSalas;

    /*public void adicionaCurso (Curso novoCurso)
    {
        novoCurso.setIdCurso(serial++);
        cursos.add(novoCurso);
    }*/
    public void novoCurso(Professor professorSelecionado, Sala salaSelecionada, String nomeCurso, String dataInicio, String dataFim) {
        Curso novoCurso = new Curso();
        novoCurso.setIdCurso(serial++);
        novoCurso.setDiaInicio(dataInicio);
        novoCurso.setDiaFim(dataFim);
        novoCurso.setProfessor(professorSelecionado);
        novoCurso.setSala(salaSelecionada);
        int opcao = 0;
        String nomes = "";

        while (opcao != 3) {

            opcao = Entrada.leiaInt("MENU\n"
                    + "[1] Selecionar Professor\n"
                    + "[2] Selecionar Sala\n"
                    + "[3] VOLTAR");

            switch (opcao) {
                case 1: {

                    for (Professor professor : controlaProfessores.getProfessores()) {
                        nomes += professor.getIdProfessor() + " - " + professor.getNomeProfessor();
                    }

                    Professor professor = null;

                    while (professor == null) {
                        int codigo = Entrada.leiaInt("Qual o código do professor que deseja adicionar");
                        professor = controlaProfessores.getProfessorId(codigo);
                        if (professor == null) {
                            JOptionPane.showMessageDialog(null, "Professor " + professor.getNomeProfessor() + " adicionado ao curso!");
                        }
                    }

                    break;
                }
                case 2: {

                    for (Sala sala : controlaSalas.getSalas()) {
                        nomes += sala.getIdSalaEPredio() + " - " + sala.getSala() + " - " + sala.getPredio();
                    }

                    Sala sala = null;

                    while (sala == null) {
                        int codigo = Entrada.leiaInt("Qual o código da sala/predio que deseja adicionar");
                        sala = controlaSalas.getSalasPorCodigo(codigo);
                        if (sala == null) {
                            JOptionPane.showMessageDialog(null, "Sala " + sala.getSala() + " predio " + sala.getPredio() + " adicionado ao curso!");
                        }
                    }

                    break;
                }
                case 3:
                    break;
            }

        }
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public Curso getCursoId(int id) {
        for (Curso c : cursos) {
            if (c.getIdCurso() == id) {
                return c;
            }
        }
        return null;
    }

    public void gravaCurso() {
        try {
            String linhas = "";

            for (Curso cursoDentrodoArrayList : cursos) {
                linhas += cursoDentrodoArrayList.getIdCurso() + ";"
                        + cursoDentrodoArrayList.getNome() + ";"
                        + cursoDentrodoArrayList.getDiaInicio() + ";"
                        + cursoDentrodoArrayList.getDiaFim() + ";"
                        + cursoDentrodoArrayList.getProfessor() + ";"
                        + cursoDentrodoArrayList.getSala() + ";"
                        + "\n";
            }

            Files.write(Path.of("Curso.txt"), linhas.getBytes(),
                    StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

//    public void carregaCurso() {
//        try {
//            Path path = Path.of("Curso.txt");
//
//            if (Files.exists(path)) {
//                List<String> linhas = Files.readAllLines(path);
//
//                for (String linha : linhas) {
//                    String atributos[] = linha.split(";");
//
//                    Curso novoCurso = new Curso();
//                    novoCurso.setIdCurso(Integer.valueOf(atributos[0]));
//                    novoCurso.setNome(atributos[1]);
//                    novoCurso.setDiaInicio(atributos[2]);
//                    novoCurso.setDiaFim(atributos[3]);
//                    novoCurso.setProfessor(atributos[4]);
//                    novoCurso.setSala(atributos[5]);
//
//                    cursos.add(novoCurso);
//
//                    if (novoCurso.getIdCurso() > serial) {
//                        serial = novoCurso.getIdCurso();
//                    }
//                }
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
