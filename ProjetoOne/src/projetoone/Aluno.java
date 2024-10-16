package projetoone;

import java.util.ArrayList;

public class Aluno {

    private int idAluno = 1;
    private String nomeAluno;

    public Aluno(String nome) {
        this.idAluno = idAluno++;
        this.nomeAluno = nome;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public Aluno() {
    }

    public int getIdAluno() {
        return idAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    @Override
    public String toString() {
        return "{Código Aluno = " + idAluno + ", Nome do Aluno = " + nomeAluno + '}';
    }

    public void imprimeAluno(ArrayList<Aluno> alunos) {

        for (Aluno a : alunos) {

            System.out.println("Id do aluno: " + a.getIdAluno() + " - nome do aluno: " + a.getNomeAluno());
        }
    }

}
