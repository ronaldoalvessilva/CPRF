/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Clientes;
import Modelo.Fornecedor;
import Modelo.MovimentoCPR;
import static Visao.TelaMovimentacaoContasPR.jCodigo;
import static Visao.TelaMovimentoBancario.pCODIGO_BANCO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ronal
 */
public class ListarFornecedorPesquisaDAO_CP {

     ConexaoBancoDados conecta = new ConexaoBancoDados();
    Fornecedor forn = new Fornecedor();

    public List<Fornecedor> read() throws Exception {
        conecta.abrirConexao();
        List<Fornecedor> listaFornecedorPesq = new ArrayList<Fornecedor>();
        try {
            conecta.executaSQL("SELECT* FROM BANCOS_CONTAS "
                    + "INNER JOIN FORNECEDORES_AC "
                    + "ON BANCOS_CONTAS.IdForn=FORNECEDORES_AC.IdForn "
                    + "WHERE IdBanco='" + pCODIGO_BANCO + "'");
            while (conecta.rs.next()) {
                Fornecedor pListaFornecedor = new Fornecedor();
                pListaFornecedor.setIdForn(conecta.rs.getInt("IdForn"));
                pListaFornecedor.setRazaoSocial(conecta.rs.getString("RazaoSocial"));
                pListaFornecedor.setIdBanco(conecta.rs.getInt("IdBanco"));
                pListaFornecedor.setAgencia(conecta.rs.getString("Agencia"));
                pListaFornecedor.setContaCorrente(conecta.rs.getString("ContaCorrente"));
                listaFornecedorPesq.add(pListaFornecedor);
            }
            return listaFornecedorPesq;
        } catch (SQLException ex) {
            Logger.getLogger(listarClienteMovBancoPesquisa.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conecta.desconecta();
        }
        return null;
    }
}
