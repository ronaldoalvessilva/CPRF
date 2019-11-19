/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.BancosContas;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ronal
 */
public class BancosContasBancariasDAO {

    ConexaoBancoDados conecta = new ConexaoBancoDados();
    BancosContas objBanco = new BancosContas();

    public BancosContas incluirBancos(BancosContas objBanco) {
        conecta.abrirConexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("INSERT INTO BANCOS_CONTAS (StatusBanco,DataBanco,DescricaoBanco,Agencia,ContaCorrente,Operacao,Endereco,Cidade,Estado,UsuarioInsert,DataInsert,HorarioInsert) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, objBanco.getStatusBanco());
            pst.setTimestamp(2, new java.sql.Timestamp(objBanco.getDataBanco().getTime()));
            pst.setString(3, objBanco.getDescricaoBanco());
            pst.setString(4, objBanco.getAgencia());
            pst.setString(5, objBanco.getContaCorrente());
            pst.setString(6, objBanco.getOperacao());
            pst.setString(7, objBanco.getEndereco());
            pst.setString(8, objBanco.getCidade());
            pst.setString(9, objBanco.getEstado());
            pst.setString(10, objBanco.getUsuarioInsert());
            pst.setString(11, objBanco.getDataInsert());
            pst.setString(12, objBanco.getHorarioInsert());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi possível INSERIR os Dados\nERRO: " + ex);
        }
        conecta.desconecta();
        return objBanco;
    }

    public BancosContas alterarBancos(BancosContas objBanco) {
        conecta.abrirConexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("UPDATE BANCOS_CONTAS SET StatusBanco=?,DataBanco=?,DescricaoBanco=?,Agencia=?,ContaCorrente=?,Operacao=?,Endereco=?,Cidade=?,Estado=?,UsuarioUp=?,DataUp=?,HorarioUp=? WHERE IdBanco='" + objBanco.getIdBanco() + "'");
            pst.setString(1, objBanco.getStatusBanco());
            pst.setTimestamp(2, new java.sql.Timestamp(objBanco.getDataBanco().getTime()));
            pst.setString(3, objBanco.getDescricaoBanco());
            pst.setString(4, objBanco.getAgencia());
            pst.setString(5, objBanco.getContaCorrente());
            pst.setString(6, objBanco.getOperacao());
            pst.setString(7, objBanco.getEndereco());
            pst.setString(8, objBanco.getCidade());
            pst.setString(9, objBanco.getEstado());
            pst.setString(10, objBanco.getUsuarioUp());
            pst.setString(11, objBanco.getDataUp());
            pst.setString(12, objBanco.getHorarioUp());
            pst.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi possível ALTERAR os Dados\nERRO: " + ex);
        }
        conecta.desconecta();
        return objBanco;
    }

    public BancosContas excluirBancos(BancosContas objBanco) {
        conecta.abrirConexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("DELETE FROM BANCOS_CONTAS WHERE IdBanco='" + objBanco.getIdBanco() + "'");            
            pst.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi possível EXCLUIR os Dados\nERRO: " + ex);
        }
        conecta.desconecta();
        return objBanco;
    }
}