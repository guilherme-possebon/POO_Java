/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author artur
 */
public class Exemplo4 {

    public static void main(String[] args) {
        Forma f1 = new Forma("triangulo");
        f1.setCor("blue");

        Forma f2 = new Forma("retangulo");
        f2.setCor("amaralelo");

        //tem que ser igual "blue"
        System.out.println(f1.getCor());

        //tem que ser igual "amarelelo"
        System.out.println(f2.getCor());
    }
}
