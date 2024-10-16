/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercado;

import java.util.ArrayList;

/**
 *
 * @author gposs
 */
public class ControlaProduto {

    private ArrayList<Produto> produtos = new ArrayList<>();
    int serial = 1;

    public void addProduto(Produto novoProduto) {
        novoProduto.codigo = serial++;
        produtos.add(novoProduto);
    }

    public Produto getProdutoPorCodigo(int codigo) {
        for (Produto produto : produtos) {
            if (produto.codigo == codigo) {
                return produto;
            }
        }
        return null;
    }

    public ArrayList<Produto> getListaProdutos() {

        return produtos;

    }
}
