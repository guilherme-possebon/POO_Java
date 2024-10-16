/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idademaiormenor;

import java.util.Date;

/**
 *
 * @author gposs
 */
public class IdadeMaiorMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade1 = 23; 
        int idade2 = 23;
        float numeroFloat = 1.5f;
        double salario = 1412.50;
        char letra = 'a';
        String nome = "Juca";
        boolean ativo = true;
        
        System.out.println("Data atual" + new Date() );
        
        if (idade1 > idade2) {
            System.out.println("Idade 1 é maior");
        } else if (idade2 > idade1) {
            System.out.println("Idade 2 é maior");
        }else {
            System.out.println("Idades são iguais");
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("oi");
        }
        
    }

}
