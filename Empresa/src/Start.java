
/*
 *
 * @author gposs
 */
public class Start {

    public static void main(String[] args) {

        // 1 cadastrar usuario
        // 2 dar aumento para usuario
        // 3 promover usuario
        // 4 listar os gastos da empresa
        // 5 litas funcionarios
        int menu = 0;

        Controladora controladora = new Controladora();

        while (menu != 6) {
            menu = Entrada.leiaInt("Digite uma opção: \n"
                    + "[1] - cadastrar usuario\n"
                    + "[2] - dar aumento para usuario\n"
                    + "[3] - promover usuario\n"
                    + "[4] - listar os gastos da empresa\n"
                    + "[5] - litas funcionarios\n"
                    + "[6] - sair"
            );

            switch (menu) {
                case 1:
                    String nome = Entrada.leiaString("Nome do usuario");
                    double salario = Entrada.leiaDouble("Digite o salario do usuario");
                    String cargo = Entrada.leiaString("Escreva o atual cargo do usuario");

                    Funcionario funcionario = new Funcionario();
                    funcionario.nome = nome;
                    funcionario.salario = salario;
                    funcionario.cargo = cargo;

                    controladora.addFuncionario(funcionario);
                    break;
                case 2:
                    String consulta = Entrada.leiaString("Escreva o nome do usuario para dar o aumento");
                    Funcionario f = controladora.usuraioEspecifico(consulta);
                    if (f != null) {
                        System.out.println("Usuario encontrado: " + f.nome);
                        boolean aplicar = Entrada.leiaBoolean("Deseja aplicar o aumento para esse usuario? Sim ou Não?", "Sim", "Não");
                        if (aplicar) {
                            f.aumentoSalario();
                        }
                    }
                    break;
                case 3:
                    consulta = Entrada.leiaString("Escreva o nome do usuario para dar a promoção");
                    f = controladora.usuraioEspecifico(consulta);
                    if (f != null) {
                        System.out.println("Usuario encontrado: " + f.nome);
                        boolean aplicar = Entrada.leiaBoolean("Deseja aplicar a promoção para esse usuario? Sim ou Não?", "Sim", "Não");
                        if (aplicar) {
                            f.promocao();
                        }
                    }
                    break;
                case 4:
                    boolean escolha = Entrada.leiaBoolean("Deseja consultar qual gasto?", "Mensal", "Anual");
                    if (escolha) {
                        controladora.imprimeGastosMensais();
                    } else if (!escolha) {
                        controladora.imprimeGastosAnuais();
                    }
                    break;
                case 5:
                    controladora.imprimeFuncionarios();
                    break;
            }
        }

        System.exit(0);
    }
}
