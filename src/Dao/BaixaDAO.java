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
            PreparedStatement pst = conecta.con.prepareStatement("INSERT INTO BAIXA_CONTAS_PAGAR_RECEBER (IdMov,DataBaixa,TipoConta,DiasAtraso,JurosDia,ValorJuros,ValorBaixa) VALUES(?,?,?,?,?,?,?)");
            pst.setInt(1, objBaixa.getIdMov());
            pst.setTimestamp(2, new java.sql.Timestamp(objBaixa.getDataOperacao().getTime()));
            pst.setString(3, objBaixa.getOperacaoBaixa());
            pst.setInt(4, objBaixa.getDiasAtraso());
            pst.setDouble(5, objBaixa.getJurosDias());
            pst.setDouble(6, objBaixa.getValorJurosDias());
            pst.setDouble(7, objBaixa.getValorOperacao());
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
}
