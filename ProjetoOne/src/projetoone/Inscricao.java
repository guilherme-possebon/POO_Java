package projetoone;

import java.util.ArrayList;

public class Inscricao {

    public void setIdInscricao(int idInscricao) {
        this.idInscricao = idInscricao;
    }

    private int idInscricao = 1;
    private Aluno aluno;
    private Curso curso;

    public Inscricao(Aluno aluno, Curso curso) {
        this.idInscricao = idInscricao++;
        this.aluno = aluno;
        this.curso = curso;

    }

    public Inscricao() {
    }

    public int getIdInscricao() {
        return idInscricao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Inscricao {Codigo Inscricao = " + idInscricao + ", Aluno = " + aluno + ", Curso = " + curso + "}";
    }

    public void imprimeInscricoes(ArrayList<Inscricao> inscricoes, ArrayList<Curso> cursos) {

        for (Inscricao i : inscricoes) {
            System.out.println("Id da inscrição: " + i.getIdInscricao() + ", nome do aluno: " + i.getAluno().getNomeAluno());
            System.out.println("Curso em que o aluno foi inscrito: " + i.getCurso().imprimeCurso(cursos));

        }
    }

}
