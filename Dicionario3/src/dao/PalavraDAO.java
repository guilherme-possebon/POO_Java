/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Palavra;
import util.ConexaoDB;

/**
 *
 * @author gposs
 */
public class PalavraDAO {

    public void insert(Palavra palavra) throws SQLException {
        String sql = "insert into palavra (ds_nome, ds_significado, nr_versao) " + "values ( "
                + "'" + palavra.nome + "',"
                + "'" + palavra.significado + "',"
                + palavra.versao
                + ")";

        ConexaoDB.executeUpdate(sql);
    }

    public void delete(Palavra palavra) throws SQLException {
        delete(palavra.codigo);

    }

    public void delete(int codigo) throws SQLException {
        String sql = "delete from palavras where nr_codigo = " + codigo;
        ConexaoDB.executeUpdate(sql);
    }

    public void update(Palavra palavra) throws SQLException {
        String sql = "update palavra set ds_nome = '" + palavra.nome + "', "
                + " ds_significado = '" + palavra.significado + "',"
                + " nr_versao = " + palavra.versao;
        ConexaoDB.executeUpdate(sql);
    }

    public Palavra consultarPalavraPorCodigo(int codigo) {
        Palavra p = null;

        String sql = "select * from palavra where nr_codigo = " + codigo;

        try {
            ResultSet rs = ConexaoDB.executeQuery(sql);

            if (rs.next()) {
                p = new Palavra();
                p.codigo = rs.getInt("nr_codigo");
                p.nome = rs.getString("ds_nome");
                p.significado = rs.getString("ds_significado");
                p.versao = rs.getInt("nr_versao");

            }
        } catch (Exception e) {
        }

        return p;
    }

    public Palavra consultarPalavraExata(String nome) {
        Palavra p = null;

        String sql = "select * from palavra where nr_codigo = " + nome;

        try {
            ResultSet rs = ConexaoDB.executeQuery(sql);

            if (rs.next()) {
                p = new Palavra();
                p.codigo = rs.getInt("nr_codigo");
                p.nome = rs.getString("ds_nome");
                p.significado = rs.getString("ds_significado");
                p.versao = rs.getInt("nr_versao");

            }
        } catch (Exception e) {
        }

        return p;
    }

    public ArrayList<Palavra> consultarPalavra(String textoParaBuscar) {

        ArrayList<Palavra> palavras = new ArrayList<>();

        String sql = "select * from palavra where nr_codigo like '%" + textoParaBuscar + "%'" + " or " + " significado like '%" + textoParaBuscar + "%'";

        try {
            ResultSet rs = ConexaoDB.executeQuery(sql);

            while (rs.next()) {

                Palavra p = new Palavra();
                p.codigo = rs.getInt("nr_codigo");
                p.nome = rs.getString("ds_nome");
                p.significado = rs.getString("ds_significado");
                p.versao = rs.getInt("nr_versao");

                palavras.add(p);

            }
        } catch (Exception e) {
        }

        return palavras;
    }

    public ArrayList<Palavra> getPalavras() {

        ArrayList<Palavra> palavras = new ArrayList<>();

        String sql = "select * from palavra";

        try {
            ResultSet rs = ConexaoDB.executeQuery(sql);

            while (rs.next()) {

                Palavra p = new Palavra();
                p.codigo = rs.getInt("nr_codigo");
                p.nome = rs.getString("ds_nome");
                p.significado = rs.getString("ds_significado");
                p.versao = rs.getInt("nr_versao");

                palavras.add(p);

            }
        } catch (Exception e) {
        }

        return palavras;
    }
}
