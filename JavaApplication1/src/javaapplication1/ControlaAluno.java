package javaapplication1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ControlaAluno {

    private int serial = 1;
    private ArrayList<Aluno> alunos = new ArrayList();

    public void adicionaAluno(Aluno novoAluno) {
        novoAluno.setIdAluno(serial++);
        alunos.add(novoAluno);
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public Aluno getAlunoId(int id) {
        for (Aluno a : alunos) {
            if (a.getIdAluno() == id) {
                return a;
            }
        }
        return null;
    }

    public void gravaAlunos() {
        try {
            String linhas = "";

            for (Aluno alunoDentrodoArrayList : alunos) {
                linhas += alunoDentrodoArrayList.getIdAluno() + ";"
                        + alunoDentrodoArrayList.getNomeAluno() + ";"
                        + "\n";
            }

            Files.write(Path.of("Aluno.txt"), linhas.getBytes(),
                    StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void carregaAluno() {
        try {
            Path path = Path.of("Aluno.txt");

            if (Files.exists(path)) {
                List<String> linhas = Files.readAllLines(path);

                for (String linha : linhas) {
                    String atributos[] = linha.split(";");

                    Aluno novoAluno = new Aluno();
                    novoAluno.setIdAluno(Integer.valueOf(atributos[0]));
                    novoAluno.setNomeAluno(atributos[1]);

                    alunos.add(novoAluno);

                    if (novoAluno.getIdAluno() > serial) {
                        serial = novoAluno.getIdAluno();
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
