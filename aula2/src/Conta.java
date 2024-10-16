/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gposs
 */
public class Conta {

    public int codigo;
    public String nomeDoDono;
    public double saldo;
    public double limite;
    public String tipoDeConta;

    public boolean sacar(double valor) {

        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void saldoAtual() {
        System.out.println("Saldo do " + nomeDoDono + " é de R$" + saldo);
    }

    public void imprimirNome() {
        System.out.println(nomeDoDono);
    }

    public void transferir(Conta destino, double valor) {
        if (sacar(valor)) {
            destino.depositar(valor);
        }
    }

}
