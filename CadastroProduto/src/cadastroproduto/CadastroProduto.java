/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastroproduto;

/**
 *
 * @author gposs
 */
public class CadastroProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String produtos[] = new String[100];
        double precos[] = new double[100];
        int cont = 0;

        int opcao = 0;

        while (opcao != 6) {
            opcao = Entrada.leiaInt(""
                    + "[1] - Cadastrar produto\n"
                    + "[2] - Listar todos produtos\n"
                    + "[3] - Consultar um produto\n"
                    + "[4] - Atualizar um produto\n"
                    + "[5] - Excluir um produto\n"
                    + "[6] - SAIR");

            switch (opcao) {
                case 1:
                    System.out.println("CADASTRO DO PRODUTO");
                    produtos[cont] = Entrada.leiaString("Informe o nome do produto");
                    precos[cont] = Entrada.leiaDouble("Informe o preço do produto");
                    cont++;
                    System.out.println("Produto cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("LISTAGEM DE PRODUTOS");
                    for (int i = 0; i < cont; i++) {
                        System.out.println("Produto " + (i + 1) + " - " + produtos[i] + " " + "R$" + precos[i]);
                    }
                    break;
                case 3:
                    System.out.println("CONSULTA DE PRODUTO");
                    String nomeConsulta = Entrada.leiaString("Informe um nome de produto para consultar:");
                    boolean achei = false;
                    for (int i = 0; i < cont; i++) {
                        if (nomeConsulta.equalsIgnoreCase(produtos[i])) {
                            System.out.println("Produto - " + nomeConsulta + " - localizado!");
                            achei = true;
                        }
                    }
                    if (achei == false) {
                        System.out.println("Produto não localizado.");
                    }
                    break;
                case 4: {
                    int numeroDoProduto = 0;
                    for (int i = 0; i < cont; i++) {
                        System.out.println("-----------------------");
                        System.out.println("Produto " + (i + 1) + " - " + produtos[i] + " " + "R$" + precos[i]);
                    }
                    int opcaoUpdate = Entrada.leiaInt(""
                            + "[1] - Atualizar nome do produto\n"
                            + "[2] - Atualizar preço\n");
                    switch (opcaoUpdate) {
                        case 1:
                            numeroDoProduto = Entrada.leiaInt("Escreva o numero do produto que deseja atualizar (numero dos produtos irão aparecer no console)");
                            System.out.println("Nome do produto escolhido para ser atualizado: " + produtos[numeroDoProduto - 1]);
                            String nomeDoProdutoParaSubistituir = Entrada.leiaString("Escreva o nome do produto para substituir");
                            produtos[numeroDoProduto - 1] = nomeDoProdutoParaSubistituir;
                            break;
                        case 2:
                            numeroDoProduto = Entrada.leiaInt("Escreva o numero do produto que deseja atualizar (numero dos produtos irão aparecer no console)");
                            System.out.println("Preço do produto escolhido para ser atualizado: " + precos[numeroDoProduto - 1]);
                            double precoDoProdutoParaSubistituir = Entrada.leiaDouble("Escreva o preço do produto para substituir");
                            precos[numeroDoProduto - 1] = precoDoProdutoParaSubistituir;
                            break;
                        default:
                            throw new AssertionError();
                    }
                    System.out.println("Listagem dos produtos atualizados");
                    System.out.println("");
                    for (int i = 0; i < cont; i++) {
                        System.out.println("Produto " + (i + 1) + " - " + produtos[i] + " " + "R$" + precos[i]);
                    }
                    break;
                }
                case 5: {
                    for (int i = 0; i < cont; i++) {
                        System.out.println("-----------------------");
                        System.out.println("Produto " + (i + 1) + " - " + produtos[i] + " " + "R$" + precos[i]);
                    }
                    int numeroDoProduto = Entrada.leiaInt("Escreva o numero do produto que deseja DELETAR (numero dos produtos irão aparecer no console)");
                    System.out.println("Nome do produto escolhido para ser deletado: " + produtos[numeroDoProduto - 1]);
                    produtos[numeroDoProduto - 1] = "Produto deletado";
                    precos[numeroDoProduto - 1] = 0;
                    System.out.println("Listagem dos produtos atualizados");
                    System.out.println("");
                    for (int i = 0; i < cont; i++) {
                        System.out.println("Produto " + (i + 1) + " - " + produtos[i] + " " + "R$" + precos[i]);
                    }
                    break;
                }
                default:
                    break;
            }
        }

        System.exit(0);
    }

}
