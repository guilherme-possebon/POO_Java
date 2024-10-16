/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gposs
 */
public class Pessoa {
    // Atributo vai dentro da classe

    public static final char sexoMasculino = 'M';
    public static final char sexoFeminino = 'F';
    public int codigo;
    public String nome;
    public String sobrenome;
    public int idade;
    public char sexo;

    // metodo
    public void nomeCompleto() {
        System.out.println(nome + " " + sobrenome);
    }
}
