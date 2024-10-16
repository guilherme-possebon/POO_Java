/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercado;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author gposs
 */
public class ControlaCompras {

    public ArrayList<Compra> compras = new ArrayList();
    public ControlaProduto controlaProduto;
    ArrayList<SectionEntry> sections = new ArrayList();

    public ControlaCompras(ControlaProduto instanciaControlaProduto) {
        controlaProduto = instanciaControlaProduto;
    }

    public ArrayList<SectionEntry> novaCompra() {
        LocalDateTime data = LocalDateTime.now();
        System.out.println(data);

        Compra c = new Compra();

        int menu = -2;
        while (menu != 0) {

            ArrayList<Produto> produtosLista = controlaProduto.getListaProdutos();

            menu = Entrada.leiaInt("Digite o numero desejado:\n\n"
                    + produtosLista
                    + "\nDigite 0 para poder sair (Não ira finalizar a compra)"
                    + "\nDigite -1 para finalizar a compra"
            );
            boolean continuar = false;
            if (menu == -1) {
                continuar = true;
            }

            if (menu == 0) {
                break;
            }

            for (Produto p : produtosLista) {
                if (menu == p.codigo) {
                    int quantidade = Entrada.leiaInt("Digite a quantidade que deseja comprar de " + p.nome);
                    System.out.println("Produto selecionado:");
                    System.out.println("Codigo: " + p.codigo);
                    System.out.println("Nome: " + p.nome);
                    System.out.println("Valor: " + p.valor);

                    boolean produtoRepetido = false;
                    for (Produto cProdutos : c.produtos) {
                        if (cProdutos.codigo == p.codigo) {
                            cProdutos.quantidade += quantidade;
                            p.quantidade = cProdutos.quantidade;
                            produtoRepetido = true;
                            break;
                        }
                    }
                    if (!produtoRepetido) {
                        c.produtos.add(new Produto(p.codigo, p.nome, p.valor, quantidade));
                        p.quantidade = quantidade;
                    }
                    System.out.println("Quantidade: " + p.quantidade);

                    continuar = Entrada.leiaBoolean("Deseja finalizar a compra?", "Sim", "Não");

                    if (continuar == true) {
                        break;
                    }
                }
            }

            if (continuar) {
                if (!c.produtos.isEmpty()) {
                    c.codigoCompra = compras.size() + 1;
                    c.data = data;
                    compras.add(c);
                    SectionEntry sectionEntry = new SectionEntry(c.codigoCompra, c.data, c.produtos);
                    sections.add(sectionEntry);
                    System.out.println("Compra concluída: " + sectionEntry);
                } else {
                    System.out.println("Nenhum produto adicionado à compra.");
                }

                System.out.println(sections);
                menu = 0;
            }
        }
        return sections;
    }

}
