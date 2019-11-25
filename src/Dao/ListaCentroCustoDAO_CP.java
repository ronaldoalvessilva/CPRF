/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.CentroCusto;
import Modelo.MovimentoCPR;
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
public class ListaCentroCustoDAO_CP {

    ConexaoBancoDados conecta = new ConexaoBancoDados();
    MovimentoCPR objMov = new MovimentoCPR();

    String pOPERACAO_PAGAR = "Pagar";

    public List<CentroCusto> read() throws Exception {
        conecta.abrirConexao();
        List<CentroCusto> listaCentro = new ArrayList<CentroCusto>();
        try {
            conecta.executaSQL("SELECT * FROM MOVIMENTO_CONTAS_PAGAR_RECEBER "
                    + "INNER JOIN CENTRO_CUSTO "
                    + "ON MOVIMENTO_CONTAS_PAGAR_RECEBER.IdCentro=CENTRO_CUSTO.IdCentro "
                    + "WHERE MOVIMENTO_CONTAS_PAGAR_RECEBER.IdMov='" + jCodigo.getText() + "' "
                    + "AND Operacao='" + pOPERACAO_PAGAR + "'");
            while (conecta.rs.next()) {
                CentroCusto pDigiCentro = new CentroCusto();
                pDigiCentro.setIdCentro(conecta.rs.getInt("IdCentro"));
                pDigiCentro.setDescricaoCentro(conecta.rs.getString("DescricaoCentro"));
                listaCentro.add(pDigiCentro);
            }
            return listaCentro;
        } catch (SQLException ex) {
            Logger.getLogger(FornecedoresDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conecta.desconecta();
        }
        return null;
    }
}
