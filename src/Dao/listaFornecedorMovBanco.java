/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Fornecedor;
import static Visao.TelaMovimentoBancario.pTIPO_favorecido;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Socializa TI 02
 */
public class listaFornecedorMovBanco {

    ConexaoBancoDados conecta = new ConexaoBancoDados();
    Fornecedor forn = new Fornecedor();

    public List<Fornecedor> read() throws Exception {
        conecta.abrirConexao();
        List<Fornecedor> listaFornecedores = new ArrayList<Fornecedor>();
        try {
            conecta.executaSQL("SELECT * FROM BANCOS_CONTAS "
                    + "INNER JOIN FORNECEDORES_AC "
                    + "ON BANCOS_CONTAS.IdForn=FORNECEDORES_AC.IdForn "
                    + "WHERE TipoFavorecido='" + pTIPO_favorecido + "'");
            while (conecta.rs.next()) {
                Fornecedor pListaFornecedor = new Fornecedor();
                pListaFornecedor.setIdForn(conecta.rs.getInt("IdForn"));
                pListaFornecedor.setRazaoSocial(conecta.rs.getString("RazaoSocial"));
                pListaFornecedor.setIdBanco(conecta.rs.getInt("IdBanco"));
                pListaFornecedor.setAgencia(conecta.rs.getString("Agencia"));
                pListaFornecedor.setContaCorrente(conecta.rs.getString("ContaCorrente"));
                listaFornecedores.add(pListaFornecedor);
            }
            return listaFornecedores;
        } catch (SQLException ex) {
            Logger.getLogger(listaFornecedorMovBanco.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conecta.desconecta();
        }
        return null;
    }

    public List<Fornecedor> pAGENDIA_read() throws Exception {
        conecta.abrirConexao();
        List<Fornecedor> listaClientes = new ArrayList<Fornecedor>();
        try {
            conecta.executaSQL("SELECT * FROM BANCOS_CONTAS "
                    + "INNER JOIN FORNECEDORES_AC "
                    + "ON BANCOS_CONTAS.IdForn=FORNECEDORES_AC.IdForn "
                    + "WHERE TipoFavorecido='" + pTIPO_favorecido + "'");
            while (conecta.rs.next()) {
                Fornecedor pListaFornecedor = new Fornecedor();
                pListaFornecedor.setIdForn(conecta.rs.getInt("IdForn"));
                pListaFornecedor.setRazaoSocial(conecta.rs.getString("RazaoSocial"));
                pListaFornecedor.setIdBanco(conecta.rs.getInt("IdBanco"));
                pListaFornecedor.setAgencia(conecta.rs.getString("Agencia"));
                pListaFornecedor.setContaCorrente(conecta.rs.getString("ContaCorrente"));
                listaClientes.add(pListaFornecedor);
            }
            return listaClientes;
        } catch (SQLException ex) {
            Logger.getLogger(listaFornecedorMovBanco.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conecta.desconecta();
        }
        return null;
    }
}
