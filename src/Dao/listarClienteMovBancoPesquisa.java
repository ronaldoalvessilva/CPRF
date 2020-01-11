/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Clientes;
import static Visao.TelaMovimentoBancario.pCODIGO_BANCO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Socializa TI 02
 */
public class listarClienteMovBancoPesquisa {

    ConexaoBancoDados conecta = new ConexaoBancoDados();
    Clientes forn = new Clientes();

    public List<Clientes> read() throws Exception {
        conecta.abrirConexao();
        List<Clientes> listaClientesPesq = new ArrayList<Clientes>();
        try {
            conecta.executaSQL("SELECT* FROM BANCOS_CONTAS "
                    + "INNER JOIN CLIENTES "
                    + "ON BANCOS_CONTAS.IdForn=CLIENTES.IdClie "
                    + "WHERE IdBanco='" + pCODIGO_BANCO + "'");
            while (conecta.rs.next()) {
                Clientes pListaClientes = new Clientes();
                pListaClientes.setIdForn(conecta.rs.getInt("IdForn"));
                pListaClientes.setRazaoSocial(conecta.rs.getString("RazaoSocial"));
                pListaClientes.setIdBanco(conecta.rs.getInt("IdBanco"));
                pListaClientes.setAgencia(conecta.rs.getString("Agencia"));
                pListaClientes.setContaCorrente(conecta.rs.getString("ContaCorrente"));
                listaClientesPesq.add(pListaClientes);
            }
            return listaClientesPesq;
        } catch (SQLException ex) {
            Logger.getLogger(listarClienteMovBancoPesquisa.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conecta.desconecta();
        }
        return null;
    }
}
