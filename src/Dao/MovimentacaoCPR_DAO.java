/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.MovimentoCPR;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ronal
 */
public class MovimentacaoCPR_DAO {

    ConexaoBancoDados conecta = new ConexaoBancoDados();
    MovimentoCPR objMov = new MovimentoCPR();

    public MovimentoCPR incluirMovimentoCPR(MovimentoCPR objMov) {
        conecta.abrirConexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("INSERT INTO MOVIMENTO_CONTAS_PAGAR_RECEBER (IdForma,IdBanco,IdCentro,IdConta,IdForn,Operacao,DataEmissao,DataVenc,Documento,ValorDoc,Historico,UsuarioInsert,DataInsert,HorarioInsert,ContaBaixada) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setInt(1, objMov.getIdForma());
            pst.setInt(2, objMov.getIdBanco());
            pst.setInt(3, objMov.getIdCentro());
            pst.setInt(4, objMov.getIdConta());
            pst.setInt(5, objMov.getIdForn());
            pst.setString(6, objMov.getOperacao());
            pst.setTimestamp(7, new java.sql.Timestamp(objMov.getDataEmissao().getTime()));
            pst.setTimestamp(8, new java.sql.Timestamp(objMov.getDataVenc().getTime()));
            pst.setString(9, objMov.getDocumento());
            pst.setDouble(10, objMov.getValorDoc());
            pst.setString(11, objMov.getHistorico());
            pst.setString(12, objMov.getUsuarioInsert());
            pst.setString(13, objMov.getDataInsert());
            pst.setString(14, objMov.getHorarioInsert());
            pst.setString(15, objMov.getContaBaixada());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi possível INSERIR os Dados.\nERRO: " + ex);
        }
        conecta.desconecta();
        return objMov;
    }

    public MovimentoCPR alterarMovimentoCPR(MovimentoCPR objMov) {
        conecta.abrirConexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("UPDATE MOVIMENTO_CONTAS_PAGAR_RECEBER SET IdForma=?,IdBanco=?,IdCentro=?,IdConta=?,IdForn=?,Operacao=?,DataEmissao=?,DataVenc=?,Documento=?,ValorDoc=?,Historico=?,UsuarioUp=?,DataUp=?,HorarioUp=? WHERE IdMov='" + objMov.getIdMov() + "'");
            pst.setInt(1, objMov.getIdForma());
            pst.setInt(2, objMov.getIdBanco());
            pst.setInt(3, objMov.getIdCentro());
            pst.setInt(4, objMov.getIdConta());
            pst.setInt(5, objMov.getIdForn());
            pst.setString(6, objMov.getOperacao());
            pst.setTimestamp(7, new java.sql.Timestamp(objMov.getDataEmissao().getTime()));
            pst.setTimestamp(8, new java.sql.Timestamp(objMov.getDataVenc().getTime()));
            pst.setString(9, objMov.getDocumento());
            pst.setDouble(10, objMov.getValorDoc());
            pst.setString(11, objMov.getHistorico());
            pst.setString(12, objMov.getUsuarioUp());
            pst.setString(13, objMov.getDataUp());
            pst.setString(14, objMov.getHorarioUp());
            pst.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi possível ALTERAR os Dados.\nERRO: " + ex);
        }
        conecta.desconecta();
        return objMov;
    }

    public MovimentoCPR excluirMovimentoCPR(MovimentoCPR objMov) {
        conecta.abrirConexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("DELETE FROM MOVIMENTO_CONTAS_PAGAR_RECEBER WHERE IdMov='" + objMov.getIdMov() + "'");
            pst.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi possível EXCLUIR os Dados.\nERRO: " + ex);
        }
        conecta.desconecta();
        return objMov;
    }

    public List<MovimentoCPR> read() throws Exception {
        conecta.abrirConexao();
        List<MovimentoCPR> listaCentro = new ArrayList<MovimentoCPR>();
        try {
            conecta.executaSQL("SELECT * FROM MOVIMENTO_CONTAS_PAGAR_RECEBER ");
            while (conecta.rs.next()) {
                MovimentoCPR pDigiMov = new MovimentoCPR();
                pDigiMov.setIdMov(conecta.rs.getInt("IdMov"));
                pDigiMov.setDescricaoCentro(conecta.rs.getString("DescricaoCentro"));
                listaCentro.add(pDigiMov);
            }
            return listaCentro;
        } catch (SQLException ex) {
            Logger.getLogger(MovimentacaoCPR_DAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conecta.desconecta();
        }
        return null;
    }
}
