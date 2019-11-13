/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.FormaPagamento;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ronaldo
 */
public class FormaPagamentoDAO {

    ConexaoBancoDados conecta = new ConexaoBancoDados();
    FormaPagamento objForma = new FormaPagamento();

    public FormaPagamento incluirFormaPagamento(FormaPagamento objForma) {
        conecta.abrirConexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("INSERT INTO FORMA_PAGAMENTO (DataForma,StatusForma,DescricaoForma,CreditCar,Visa,Master,Outros,Deposito,Dinheiro,Cheque,Boleto,DebitoC,PagtoCartao,PagtoDeposito,PagtoBoleto,PagtoDebito,UsuarioInsert,DataInsert,HorarioInsert) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
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
            pst.setInt(13, objForma.getFormaPagtoCartao());
            pst.setInt(14, objForma.getFormaPagtoDeposito());
            pst.setInt(15, objForma.getFormaPagtoBoleto());
            pst.setInt(16, objForma.getFormaPagtoDebito());
            pst.setString(17, objForma.getUsuarioInsert());
            pst.setString(18, objForma.getDataInsert());
            pst.setString(19, objForma.getHorarioInsert());
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
            PreparedStatement pst = conecta.con.prepareStatement("UPDATE FORMA_PAGAMENTO SET DataForma=?,StatusForma=?,DescricaoForma=?,CreditCar=?,Visa=?,Master=?,Outros=?,Deposito=?,Dinheiro=?,Cheque=?,Boleto=?,DebitoC=?,PagtoCartao=?,PagtoDeposito=?,PagtoBoleto=?,PagtoDebito=?,UsuarioUp=?,DataUp=?,HorarioUp=? WHERE IdForma='" + objForma.getIdForma() + "'");
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
            pst.setInt(13, objForma.getFormaPagtoCartao());
            pst.setInt(14, objForma.getFormaPagtoDeposito());
            pst.setInt(15, objForma.getFormaPagtoBoleto());
            pst.setInt(16, objForma.getFormaPagtoDebito());
            pst.setString(17, objForma.getUsuarioUp());
            pst.setString(18, objForma.getDataUp());
            pst.setString(19, objForma.getHorarioUp());
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
            PreparedStatement pst = conecta.con.prepareStatement("DELETE FROM FORMA_PAGAMENTO WHERE IdForma='" + objForma.getIdForma() + "'");
            pst.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi possível EXCLUIR os Dados\nERRO: " + ex);
        }
        conecta.desconecta();
        return objForma;
    }
}
