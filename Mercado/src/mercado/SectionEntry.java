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
public class SectionEntry {

    public int codigoCompra;
    public LocalDateTime data;
    public ArrayList<Produto> produtos;
    public Produto valor;

    public SectionEntry(int codigoCompra, LocalDateTime data, ArrayList<Produto> produtos) {
        this.codigoCompra = codigoCompra;
        this.data = data;
        this.produtos = new ArrayList<>(produtos);
    }

}
