
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gposs
 */
public class Controladora {

    public ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void addFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public Funcionario usuraioEspecifico(String nome) {

        for (Funcionario f : funcionarios) {
            if (f.nome.equalsIgnoreCase(nome)) {
                return f;
            }
        }

        return null;
    }

    public void imprimeFuncionarios() {
        if (funcionarios.size() == 1) {
            for (Funcionario f : funcionarios) {
                System.out.println("--------");
                System.out.println(f.nome);
                System.out.println(f.salario);
                System.out.println(f.cargo);
                System.out.println("--------");
            }
        } else {
            for (Funcionario f : funcionarios) {
                System.out.println(f.nome);
                System.out.println(f.salario);
                System.out.println(f.cargo);
                System.out.println("--------");
            }
        }
    }

    public void imprimeGastosMensais() {
        double soma = 0;

        for (Funcionario f : funcionarios) {
            soma += f.salario;
        }
        System.out.println(soma);
    }

    public void imprimeGastosAnuais() {
        double soma = 0;

        for (Funcionario f : funcionarios) {
            soma += f.salario * 13;
        }
        System.out.println(soma);
    }
}
