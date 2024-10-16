package javaapplication1;

import java.util.ArrayList;

public class ControlaProfessor {

    private int serial = 1;
    private ArrayList<Professor> professores = new ArrayList();

    public void adicionaProfessor(Professor novoProfessor) {
        novoProfessor.setIdProfessor(serial++);
        professores.add(novoProfessor);
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public Professor getProfessorId(int id) {
        for (Professor p : professores) {
            if (p.getIdProfessor() == id) {
                return p;
            }
        }
        return null;
    }
}
