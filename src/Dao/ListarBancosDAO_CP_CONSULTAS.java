/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.BancosContas;
import static Visao.TelaConsultasPagasRecebidas.idLanc;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ronal
 */
public class ListarBancosDAO_CP_CONSULTAS {

    ConexaoBancoDados conecta = new ConexaoBancoDados();

    String pOPERACAO_PAGAR = "Pagar";

    public List<BancosContas> read() throws Exception {
        conecta.abrirConexao();
        List<BancosContas> listaBancos = new ArrayList<BancosContas>();
        try {
            conecta.executaSQL("SELECT * FROM MOVIMENTO_CONTAS_PAGAR_RECEBER "
                    + "INNER JOIN BANCOS_CONTAS "
                    + "ON MOVIMENTO_CONTAS_PAGAR_RECEBER.IdBanco=BANCOS_CONTAS.IdBanco "
                    + "WHERE MOVIMENTO_CONTAS_PAGAR_RECEBER.IdMov='" + idLanc + "' "
                    + "AND Operacao='" + pOPERACAO_PAGAR + "'");
            while (conecta.rs.next()) {
                BancosContas pDigiBanco = new BancosContas();
                pDigiBanco.setIdBanco(conecta.rs.getInt("IdBanco"));
                pDigiBanco.setAgencia(conecta.rs.getString("Agencia"));
                pDigiBanco.setDescricaoBanco(conecta.rs.getString("DescricaoBanco"));
                pDigiBanco.setContaCorrente(conecta.rs.getString("ContaCorrente"));
                listaBancos.add(pDigiBanco);
            }
            return listaBancos;
        } catch (SQLException ex) {
            Logger.getLogger(FornecedoresDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conecta.desconecta();
        }
        return null;
    }
}
