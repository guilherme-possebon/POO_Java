/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import java.util.ArrayList;
import model.Palavra;
import util.ConexaoBD;

/**
 *
 * @author artur
 */
public class PalavraDAO {

    public void insert(Palavra p) {
        String sql = " insert into palavra ( ds_nome, ds_significado, nr_versao ) "
                + "values ( "
                + "'" + p.nome + "',"
                + "'" + p.significado + "',"
                + +p.versao
                + "  )";

        try {
            ConexaoBD.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void update(Palavra p) {
        String sql = " update palavra set ds_nome = '" + p.nome + "', "
                + " ds_significado = '" + p.significado + "', "
                + " nr_versao = " + p.versao
                + " where "
                + " nr_codigo = " + p.codigo;

        try {
            ConexaoBD.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void delete(Palavra p) {
        delete(p.codigo);
    }

    public void delete(int codigo) {
        String sql = " delete from palavra where nr_codigo = " + codigo;

        try {
            ConexaoBD.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Palavra consultarPalavraPorCodigo(int codigo) {
        Palavra p = null;

        String sql = "select * from palavra where nr_codigo = " + codigo;

        try {
            ResultSet rs = ConexaoBD.executeQuery(sql);

            while (rs.next()) {
                p = new Palavra();
                p.codigo = rs.getInt("nr_codigo");
                p.nome = rs.getString("ds_nome");
                p.significado = rs.getString("ds_significado");
                p.versao = rs.getInt("nr_versao");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return p;
    }

    public Palavra consultarPalavraExata(String nome) {
        Palavra p = null;

        String sql = "select * from palavra where ds_nome = '" + nome + "'";

        try {
            ResultSet rs = ConexaoBD.executeQuery(sql);

            while (rs.next()) {
                p = new Palavra();
                p.codigo = rs.getInt("nr_codigo");
                p.nome = rs.getString("ds_nome");
                p.significado = rs.getString("ds_significado");
                p.versao = rs.getInt("nr_versao");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return p;
    }

    public ArrayList<Palavra> consultarPalavra(String textoParaBuscar) {
        ArrayList<Palavra> palavras = new ArrayList();

        String sql = "select * from palavra "
                + " where "
                + " ds_nome like  '%" + textoParaBuscar + "%'"
                + " or "
                + " ds_significado like  '%" + textoParaBuscar + "%'";

        try {
            ResultSet rs = ConexaoBD.executeQuery(sql);

            while (rs.next()) {
                Palavra p = new Palavra();
                p.codigo = rs.getInt("nr_codigo");
                p.nome = rs.getString("ds_nome");
                p.significado = rs.getString("ds_significado");
                p.versao = rs.getInt("nr_versao");

                palavras.add(p);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return palavras;
    }

    public ArrayList<Palavra> getPalavras() {
        ArrayList<Palavra> palavras = new ArrayList();

        String sql = "select * from palavra order by ds_nome";

        try {
            ResultSet rs = ConexaoBD.executeQuery(sql);

            while (rs.next()) {
                Palavra p = new Palavra();
                p.codigo = rs.getInt("nr_codigo");
                p.nome = rs.getString("ds_nome");
                p.significado = rs.getString("ds_significado");
                p.versao = rs.getInt("nr_versao");

                palavras.add(p);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return palavras;
    }
}
