/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.FormaPagamento;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ronaldo
 */
public class FormaPagamentoDAO {

    ConexaoBancoDados conecta = new ConexaoBancoDados();
    FormaPagamento objForma = new FormaPagamento();
    //
    String pSTATUS_FORMA = "Ativo";

    public FormaPagamento incluirFormaPagamento(FormaPagamento objForma) {
        conecta.abrirConexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("INSERT INTO TIPO_PAGAMENTO (DataForma,StatusForma,DescricaoForma,CreditCar,Visa,MasterC,Outros,Deposito,Dinheiro,Cheque,Boleto,DebitoC,Avista,PagtoCartao,PagtoDeposito,PagtoBoleto,PagtoDebito,UsuarioInsert,DataInsert,HorarioInsert) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setTimestamp(1, new java.sql.Timestamp(objForma.getDataForma().getTime()));
            pst.setString(2, objForma.getStatusForma());
            pst.setString(3, objForma.getDescricaoForma());
            pst.setInt(4, objForma.getCartao());
            pst.setInt(5, objForma.getVisa());
            pst.setInt(6, objForma.getMaster());
            pst.setInt(7, objForma.getOutros());
            pst.setInt(8, objForma.getDeposito());
            pst.setInt(9, objForma.getDinheiro());
            pst.setInt(10, objForma.getCheque());
            pst.setInt(11, objForma.getBoleto());
            pst.setInt(12, objForma.getDebitoConta());
            pst.setInt(13, objForma.getAvista());
            pst.setInt(14, objForma.getFormaPagtoCartao());
            pst.setInt(15, objForma.getFormaPagtoDeposito());
            pst.setInt(16, objForma.getFormaPagtoBoleto());
            pst.setInt(17, objForma.getFormaPagtoDebito());
            pst.setString(18, objForma.getUsuarioInsert());
            pst.setString(19, objForma.getDataInsert());
            pst.setString(20, objForma.getHorarioInsert());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi possível INSERIR os Dados\nERRO: " + ex);
        }
        conecta.desconecta();
        return objForma;
    }

    public FormaPagamento alterarFormaPagamento(FormaPagamento objForma) {
        conecta.abrirConexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("UPDATE TIPO_PAGAMENTO SET DataForma=?,StatusForma=?,DescricaoForma=?,CreditCar=?,Visa=?,MasterC=?,Outros=?,Deposito=?,Dinheiro=?,Cheque=?,Boleto=?,DebitoC=?,Avista=?,PagtoCartao=?,PagtoDeposito=?,PagtoBoleto=?,PagtoDebito=?,UsuarioUp=?,DataUp=?,HorarioUp=? WHERE IdForma='" + objForma.getIdForma() + "'");
            pst.setTimestamp(1, new java.sql.Timestamp(objForma.getDataForma().getTime()));
            pst.setString(2, objForma.getStatusForma());
            pst.setString(3, objForma.getDescricaoForma());
            pst.setInt(4, objForma.getCartao());
            pst.setInt(5, objForma.getVisa());
            pst.setInt(6, objForma.getMaster());
            pst.setInt(7, objForma.getOutros());
            pst.setInt(8, objForma.getDeposito());
            pst.setInt(9, objForma.getDinheiro());
            pst.setInt(10, objForma.getCheque());
            pst.setInt(11, objForma.getBoleto());
            pst.setInt(12, objForma.getDebitoConta());
            pst.setInt(13, objForma.getAvista());
            pst.setInt(14, objForma.getFormaPagtoCartao());
            pst.setInt(15, objForma.getFormaPagtoDeposito());
            pst.setInt(16, objForma.getFormaPagtoBoleto());
            pst.setInt(17, objForma.getFormaPagtoDebito());
            pst.setString(18, objForma.getUsuarioUp());
            pst.setString(19, objForma.getDataUp());
            pst.setString(20, objForma.getHorarioUp());
            pst.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi possível ALTERAR os Dados\nERRO: " + ex);
        }
        conecta.desconecta();
        return objForma;
    }

    public FormaPagamento excluirFormaPagamento(FormaPagamento objForma) {
        conecta.abrirConexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("DELETE FROM TIPO_PAGAMENTO WHERE IdForma='" + objForma.getIdForma() + "'");
            pst.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi possível EXCLUIR os Dados\nERRO: " + ex);
        }
        conecta.desconecta();
        return objForma;
    }

    public List<FormaPagamento> read() throws Exception {
        conecta.abrirConexao();
        List<FormaPagamento> listaForma = new ArrayList<FormaPagamento>();
        try {
            conecta.executaSQL("SELECT * FROM TIPO_PAGAMENTO "
                    + "WHERE StatusForma='" + pSTATUS_FORMA + "' "
                    + "ORDER BY DescricaoForma");
            while (conecta.rs.next()) {
                FormaPagamento pDigiForma = new FormaPagamento();
                pDigiForma.setIdForma(conecta.rs.getInt("IdForma"));
                pDigiForma.setDescricaoForma(conecta.rs.getString("DescricaoForma"));
                listaForma.add(pDigiForma);
            }
            return listaForma;
        } catch (SQLException ex) {
            Logger.getLogger(FormaPagamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conecta.desconecta();
        }
        return null;
    }
}
