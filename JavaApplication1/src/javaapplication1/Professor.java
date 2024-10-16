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
public class Professor {

    private int idProfessor = 1;
    private String nomeProfessor;
    private String cpfProfessor;

    public Professor(String nomeProfessor, String cpfProfessor) {
        this.idProfessor = idProfessor++;
        this.nomeProfessor = nomeProfessor;
        this.cpfProfessor = cpfProfessor;
    }

    public Professor() 
    {
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor)
    {
        this.idProfessor = idProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getCpfProfessor() {
        return cpfProfessor;
    }

    public void setCpfProfessor(String cpfProfessor) {
        this.cpfProfessor = cpfProfessor;
    }

    public void imprimeProfessor(ArrayList<Professor> professores) {

        for (Professor p : professores) {

            System.out.println("Id do professor: " + p.getIdProfessor() + " - nome do(s) professore(s) do curso: " + p.getNomeProfessor() + " - CPF do professor: " + p.getCpfProfessor());
            System.out.println("----------------------");
        }
    }

}
