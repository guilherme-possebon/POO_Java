/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gposs
 */
public class Carro {

    public String modelo;
    public String cor;
    public String marca;
    public static final double velocidadeMaxima = 120;
    public double velocidade;
    public boolean ligado = false;

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Carro ligado!");
        } else {
            System.out.println("O carro já está ligado!");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Carro desligado!");
        } else {
            System.out.println("O carro já está desligado!");
        }
    }

    public void acelerar() {
        if (ligado) {
            if ((velocidade + 10) > velocidadeMaxima) {
                velocidade = velocidade + 10;
            } else {
                System.out.println("Motor no limite!");
            }
        } else {
            System.out.println("Carro não está ligado!");
        }
    }

    public void frear() {
        if (ligado) {
            if (velocidade > 0) {
                velocidade = velocidade - 10;
            } else {
                System.out.println("Carro parado!");
            }
        } else {
            System.out.println("Carro não está ligado!");
        }
    }

    public int getMarcha() {
        if (velocidade > 0 && velocidade <= 10) {
            return 1;
        } else if (velocidade > 10 && velocidade <= 20) {
            return 2;
        } else if (velocidade > 20 && velocidade <= 60) {
            return 3;
        } else if (velocidade > 60 && velocidade <= 80) {
            return 4;
        } else if (velocidade > 80) {
            return 5;
        } else {
            return 0;
        }
    }

    public void buzina() {
        System.out.println("bi bi");
    }
}
