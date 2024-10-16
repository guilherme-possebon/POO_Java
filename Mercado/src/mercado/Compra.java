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
public class Compra {

    public int codigoCompra;
    public LocalDateTime data;
    public Usuario usuario;
    public ArrayList<Produto> produtos = new ArrayList<>();

}
