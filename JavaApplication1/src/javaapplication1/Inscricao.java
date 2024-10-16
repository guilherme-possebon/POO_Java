/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author Henrique Mena
 */
public class Inscricao {

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

    public void imprimeInscricoes(ArrayList<Inscricao> inscricoes, ArrayList<Curso> cursos) {

        for (Inscricao i : inscricoes) {
            System.out.println("Id da inscrição: " + i.getIdInscricao() + ", nome do aluno: " + i.getAluno().getNomeAluno());
            System.out.println("Curso em que o aluno foi inscrito: " + i.getCurso().imprimeCurso(cursos));

        }
    }

}
