/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.BaixaCPR;
import Modelo.Cargos;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ronal
 */
public class BaixaDAO {

    ConexaoBancoDados conecta = new ConexaoBancoDados();
    BaixaCPR objBaixa = new BaixaCPR();

    public BaixaCPR incluirBaixaCPR(BaixaCPR objBaixa) {

        conecta.abrirConexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("INSERT INTO BAIXA_CONTAS_PAGAR_RECEBER (IdMov,IdForn,DataBaixa,TipoConta,DiasAtraso,JurosDia,ValorJuros,ValorBaixa) VALUES(?,?,?,?,?,?,?,?)");
            pst.setInt(1, objBaixa.getIdMov());
            pst.setInt(2, objBaixa.getIdForn());
            pst.setTimestamp(3, new java.sql.Timestamp(objBaixa.getDataOperacao().getTime()));
            pst.setString(4, objBaixa.getOperacaoBaixa());
            pst.setInt(5, objBaixa.getDiasAtraso());
            pst.setDouble(6, objBaixa.getJurosDias());
            pst.setDouble(7, objBaixa.getValorJurosDias());
            pst.setDouble(8, objBaixa.getValorOperacao());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi possivel INSERIR os Dados.\n\nERRO: " + ex);
        }
        conecta.desconecta();
        return objBaixa;
    }

    public BaixaCPR incluirSaldoCPR(BaixaCPR objBaixa) {

        conecta.abrirConexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("INSERT INTO SALDO_BANCARIO (DataSaldo,Doc,IdBanco,IdBaixa,IdFavorecido,TipoOperacao,ValorMov,SaldoAtual) VALUES(?,?,?,?,?,?,?,?)");
            pst.setTimestamp(1, new java.sql.Timestamp(objBaixa.getDataOperacao().getTime()));
            pst.setString(2, objBaixa.getDocumentoBaixa());
            pst.setInt(3, objBaixa.getIdBanco());
            pst.setInt(4, objBaixa.getIdBaixa());
            pst.setInt(5, objBaixa.getIdForn());
            pst.setString(6, objBaixa.getTipoOperacao());
            pst.setDouble(7, objBaixa.getValorOperacao());
            pst.setDouble(8, objBaixa.getValorSaldo());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi possivel INSERIR os Dados.\n\nERRO: " + ex);
        }
        conecta.desconecta();
        return objBaixa;
    }

    public BaixaCPR atualizarMovimentoCPR(BaixaCPR objBaixa) {

        conecta.abrirConexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("UPDATE MOVIMENTO_CONTAS_PAGAR_RECEBER SET ContaBaixada=? WHERE IdMov='" + objBaixa.getIdMov() + "'");
            pst.setString(1, objBaixa.getContaBaixada());
            pst.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi possivel ALTERAR MOVIMENTAÇÃO DE CONTAS.\n\nERRO: " + ex);
        }
        conecta.desconecta();
        return objBaixa;
    }
}
