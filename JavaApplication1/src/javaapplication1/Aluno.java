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
public class Aluno {

    private int idAluno = 1;
    private String nomeAluno;

    public Aluno(String nome) {
        this.idAluno = idAluno++;
        this.nomeAluno = nome;
    }

    public void setIdAluno(int idAluno)
    {
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

    public void imprimeAluno(ArrayList<Aluno> alunos) {

        for (Aluno a : alunos) {

            System.out.println("Id do aluno: " + a.getIdAluno() + " - nome do aluno: " + a.getNomeAluno());
            System.out.println("----------------------");
        }
    }

}
