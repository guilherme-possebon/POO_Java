package projetoone;

import java.util.ArrayList;

public class Curso {

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    private int idCurso = 1;
    private String nomeCurso;
    private String diaInicio;
    private String diaFim;
    private Professor professor;
    private Sala sala;

    public Curso(String nomeCurso, String diaInicio, String diaFim, Professor professor, Sala sala) {
        this.idCurso = idCurso++;
        this.nomeCurso = nomeCurso;
        this.diaFim = diaFim;
        this.diaInicio = diaInicio;
        this.professor = professor;
        this.sala = sala;

    }

    public Curso() {
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setNome(String nome) {
        this.nomeCurso = nome;
    }

    public String getNome() {
        return this.nomeCurso;
    }

    public void setDiaInicio(String diaInicio) {
        this.diaInicio = diaInicio;
    }

    public String getDiaInicio() {
        return this.diaInicio;
    }

    public void setDiaFim(String diaFim) {
        this.diaFim = diaFim;
    }

    public String getDiaFim() {
        return this.diaFim;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Codigo Curso: " + getIdCurso() + "\n"
                + "Nome do Curso: " + getNome() + "\n"
                + "Data de Inicio: " + getDiaInicio() + "\n"
                + "Data do Termino: " + getDiaFim() + "\n"
                + "Professor: " + getProfessor() + "\n"
                + "Salas: " + getSala();

    }

    public String imprimeCurso(ArrayList<Curso> cursos) {

        String infoCurso = "";
        for (Curso c : cursos) {
            infoCurso = "\nId do curso: " + c.getIdCurso() + " - nome do curso: " + c.getNome() + "\n"
                    + "Dia de inicio do curso: " + c.getDiaInicio() + ", dia de finalização do curso: " + c.getDiaFim() + "\n"
                    + "Id do professor: " + c.getProfessor().getIdProfessor() + " - nome do(s) professore(s) do curso: " + c.getProfessor().getNomeProfessor() + " - CPF do professor: " + c.getProfessor().getCpfProfessor() + "\n"
                    + "Id da predio/sala: " + c.getSala().getIdSalaEPredio() + " - numero do prédio: " + c.getSala().getPredio() + " - numero da sala: " + c.getSala().getSala() + "\n\n";
        }
        return infoCurso;
    }
}
