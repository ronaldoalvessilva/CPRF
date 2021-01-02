/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Clientes;
import static Visao.TelaMovimentoBancario.jComboBoxAgencia;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Socializa TI 02
 */
public class listarClienteMovBanco {

    ConexaoBancoDados conecta = new ConexaoBancoDados();
    Clientes forn = new Clientes();

    public List<Clientes> read() throws Exception {
        conecta.abrirConexao();
        List<Clientes> listaClientes = new ArrayList<Clientes>();
        try {
            conecta.executaSQL("SELECT IdBanco, "
                    + "IdForn, "
                    + "Agencia, "
                    + "ContaCorrente, "
                    + "RazaoSocial "
                    + "FROM BANCOS_CONTAS "
                    + "INNER JOIN CLIENTES "
                    + "ON BANCOS_CONTAS.IdForn=CLIENTES.IdClie");
            while (conecta.rs.next()) {
                Clientes pListaClientes = new Clientes();
                pListaClientes.setIdForn(conecta.rs.getInt("IdForn"));
                pListaClientes.setRazaoSocial(conecta.rs.getString("RazaoSocial"));
                pListaClientes.setIdBanco(conecta.rs.getInt("IdBanco"));
                pListaClientes.setAgencia(conecta.rs.getString("Agencia"));
                pListaClientes.setContaCorrente(conecta.rs.getString("ContaCorrente"));
                listaClientes.add(pListaClientes);
            }
            return listaClientes;
        } catch (SQLException ex) {
            Logger.getLogger(listarClienteMovBanco.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conecta.desconecta();
        }
        return null;
    }

    public List<Clientes> pAGENCIA_read() throws Exception {
        conecta.abrirConexao();
        List<Clientes> listaClientes = new ArrayList<Clientes>();
        try {
            conecta.executaSQL("SELECT * FROM BANCOS_CONTAS "
                    + "INNER JOIN CLIENTES "
                    + "ON BANCOS_CONTAS.IdForn=CLIENTES.IdClie "
                    + "WHERE Agencia='" + jComboBoxAgencia.getSelectedItem() + "'");
            while (conecta.rs.next()) {
                Clientes pListaFornecedor = new Clientes();
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
    
    public List<Clientes> pAGENCIA_CC_read() throws Exception {
        conecta.abrirConexao();
        List<Clientes> listaClientesCC = new ArrayList<Clientes>();
        try {
            conecta.executaSQL("SELECT * FROM BANCOS_CONTAS "
                    + "INNER JOIN CLIENTES "
                    + "ON BANCOS_CONTAS.IdForn=CLIENTES.IdClie "
                    + "WHERE Agencia='" + jComboBoxAgencia.getSelectedItem() + "'");
            while (conecta.rs.next()) {
                Clientes pListaCC = new Clientes();
                pListaCC.setRazaoSocial(conecta.rs.getString("RazaoSocial"));
                pListaCC.setContaCorrente(conecta.rs.getString("ContaCorrente"));
                listaClientesCC.add(pListaCC);
            }
            return listaClientesCC;
        } catch (SQLException ex) {
            Logger.getLogger(listaFornecedorMovBanco.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conecta.desconecta();
        }
        return null;
    }
}
