/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Clientes;
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
public class ListarClientesDAO_CONSULTAS {

    ConexaoBancoDados conecta = new ConexaoBancoDados();
    Clientes objClie = new Clientes();
    //
    String pOPERACAO_RECEBER = "Receber";

    public List<Clientes> read() throws Exception {
        conecta.abrirConexao();
        List<Clientes> listaFornecedores = new ArrayList<Clientes>();
        try {
            conecta.executaSQL("SELECT * FROM MOVIMENTO_CONTAS_PAGAR_RECEBER "
                    + "INNER JOIN CLIENTES "
                    + "ON MOVIMENTO_CONTAS_PAGAR_RECEBER.IdForn=CLIENTES.IdClie "
                    + "WHERE MOVIMENTO_CONTAS_PAGAR_RECEBER.IdMov='" + idLanc + "' "
                    + "AND Operacao='" + pOPERACAO_RECEBER + "'");
            while (conecta.rs.next()) {
                Clientes pListaClientesMovCR = new Clientes();
                pListaClientesMovCR.setIdForn(conecta.rs.getInt("IdClie"));
                pListaClientesMovCR.setRazaoSocial(conecta.rs.getString("RazaoSocial"));
                listaFornecedores.add(pListaClientesMovCR);
            }
            return listaFornecedores;
        } catch (SQLException ex) {
            Logger.getLogger(FornecedoresDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conecta.desconecta();
        }
        return null;
    }
}
