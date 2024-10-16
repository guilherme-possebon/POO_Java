/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gposs
 */
public class Funcionario {

    public String nome;
    public String nomeEmpresa;
    public double salario;
    public String cargo;

    public void aumentoSalario() {
        double aumento = Entrada.leiaDouble("Digite o valor que tera de aumento");
        salario += aumento;
    }

    public void promocao() {
        aumentoSalario();
        cargo = Entrada.leiaString("Digite o novo cargo");
    }

}
