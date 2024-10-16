/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mercado;

import java.util.ArrayList;

/**
 *
 * @author gposs
 */
public class Start {

    public static void main(String[] args) {
        int menu = 0;

        ControlaProduto controlaProduto = new ControlaProduto();
        ControlaCompras controlaCompra = new ControlaCompras(controlaProduto);

        while (menu != 5) {
            menu = Entrada.leiaInt("Digite uma das opções: \n\n"
                    + "[1] - Adicionar produto\n"
                    + "[2] - Lista dos produtos\n"
                    + "[3] - Realizar compra\n"
                    + "[4] - Listar as compras por data\n"
                    + "[5] - Sair");

            switch (menu) {
                case 1:
                    // add produto
                    Produto produto = new Produto();
                    produto.nome = Entrada.leiaString("Digite o nome do produto");
                    produto.valor = Entrada.leiaDouble("Digite o valor do produto");
                    controlaProduto.addProduto(produto);

                    break;
                case 2:
                    // Lista dos produtos

                    ArrayList<Produto> produtosLista = controlaProduto.getListaProdutos();
                    for (Produto p : produtosLista) {
                        System.out.println("Nome do produto: " + p.nome + "\n valor do produto: " + p.valor + "\n Codigo do produto: " + p.codigo);
                    }
                    break;
                case 3:
                    // Realizar compra
                    controlaCompra.novaCompra();
                    break;
                case 4:
                    // Listar as compras por data
                    ArrayList<SectionEntry> section = controlaCompra.novaCompra();
                    for (int i = 0; i < section.size(); i++) {
                        System.out.println("------------------------");
                        System.out.println(section.get(i));
                        System.out.println("------------------------");
                    }
                    break;
                case 5:
                    System.out.println("Desligando sistema");
                    break;
            }
        }
        System.exit(0);
    }

}
