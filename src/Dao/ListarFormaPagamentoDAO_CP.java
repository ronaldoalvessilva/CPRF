/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.FormaPagamento;
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
public class ListarFormaPagamentoDAO_CP {

    ConexaoBancoDados conecta = new ConexaoBancoDados();

    String pOPERACAO_PAGAR = "Pagar";

    public List<FormaPagamento> read() throws Exception {
        conecta.abrirConexao();
        List<FormaPagamento> listaFormaPagto = new ArrayList<FormaPagamento>();
        try {
            conecta.executaSQL("SELECT * FROM MOVIMENTO_CONTAS_PAGAR_RECEBER "
                    + "INNER JOIN TIPO_PAGAMENTO "
                    + "ON MOVIMENTO_CONTAS_PAGAR_RECEBER.IdForma=TIPO_PAGAMENTO.IdForma "
                    + "WHERE MOVIMENTO_CONTAS_PAGAR_RECEBER.IdMov='" + jCodigo.getText() + "' "
                    + "AND Operacao='" + pOPERACAO_PAGAR + "'");
            while (conecta.rs.next()) {
                FormaPagamento pDigiForma = new FormaPagamento();
                pDigiForma.setIdForma(conecta.rs.getInt("IdForma"));
                pDigiForma.setDescricaoForma(conecta.rs.getString("DescricaoForma"));
                listaFormaPagto.add(pDigiForma);
            }
            return listaFormaPagto;
        } catch (SQLException ex) {
            Logger.getLogger(FornecedoresDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conecta.desconecta();
        }
        return null;
    }
}
