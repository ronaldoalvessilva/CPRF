/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Fornecedor;
import Modelo.MovimentoCPR;
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
public class ListarFornecedorDAO_CP_CONSULTAS {

    ConexaoBancoDados conecta = new ConexaoBancoDados();
    MovimentoCPR objMov = new MovimentoCPR();

    String pOPERACAO_PAGAR = "Pagar";

    public List<Fornecedor> read() throws Exception {
        conecta.abrirConexao();
        List<Fornecedor> listaFornecedores = new ArrayList<Fornecedor>();
        try {
            conecta.executaSQL("SELECT * FROM MOVIMENTO_CONTAS_PAGAR_RECEBER "
                    + "INNER JOIN FORNECEDORES_AC "
                    + "ON MOVIMENTO_CONTAS_PAGAR_RECEBER.IdForn=FORNECEDORES_AC.IdForn "
                    + "WHERE MOVIMENTO_CONTAS_PAGAR_RECEBER.IdMov='" + idLanc + "' "
                    + "AND Operacao='" + pOPERACAO_PAGAR + "'");
            while (conecta.rs.next()) {
                Fornecedor pListaMovCP = new Fornecedor();
                pListaMovCP.setIdForn(conecta.rs.getInt("IdForn"));
                pListaMovCP.setRazaoSocial(conecta.rs.getString("RazaoSocial"));
                listaFornecedores.add(pListaMovCP);
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
