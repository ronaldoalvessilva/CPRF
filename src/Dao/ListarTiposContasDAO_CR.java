/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.TipoConta;
import static Visao.TelaMovimentacaoContasPR.jCodigo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ronal
 */
public class ListarTiposContasDAO_CR {

    ConexaoBancoDados conecta = new ConexaoBancoDados();

    String pOPERACAO_RECEBER = "Receber";

    public List<TipoConta> read() throws Exception {
        conecta.abrirConexao();
        List<TipoConta> listaContas = new ArrayList<TipoConta>();
        try {
            conecta.executaSQL("SELECT * FROM MOVIMENTO_CONTAS_PAGAR_RECEBER "
                    + "INNER JOIN TIPO_CONTA "
                    + "ON MOVIMENTO_CONTAS_PAGAR_RECEBER.IdConta=TIPO_CONTA.IdConta "
                    + "WHERE MOVIMENTO_CONTAS_PAGAR_RECEBER.IdMov='" + jCodigo.getText() + "' "
                    + "AND Operacao='" + pOPERACAO_RECEBER + "'");
            while (conecta.rs.next()) {
                TipoConta pDigiContas = new TipoConta();
                pDigiContas.setIdConta(conecta.rs.getInt("IdConta"));
                pDigiContas.setDescricaoConta(conecta.rs.getString("DescricaoConta"));
                listaContas.add(pDigiContas);
            }
            return listaContas;
        } catch (SQLException ex) {
            Logger.getLogger(FornecedoresDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conecta.desconecta();
        }
        return null;
    }
}
