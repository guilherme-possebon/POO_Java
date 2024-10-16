/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gposs
 */
public class Start {

    public static void main(String[] args) {
        Pessoa artur = new Pessoa();

        artur.codigo = 1;
        artur.nome = "Artur";
        artur.sobrenome = "Tomasi";
        artur.nomeCompleto();

        Pessoa juca = new Pessoa();

        juca.codigo = 2;
        juca.nome = "Juca";
        juca.sobrenome = "Bala";
        juca.sexo = Pessoa.sexoMasculino;
        juca.nomeCompleto();

        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        conta1.nomeDoDono = "artur";
        conta1.depositar(1000);

        conta2.nomeDoDono = "Juca";
        conta2.depositar(1000);

        conta1.transferir(conta2, 100);

        conta1.saldoAtual();
        conta2.saldoAtual();

        conta2.sacar(500);
        conta2.saldoAtual();

        System.exit(0);
    }
}
