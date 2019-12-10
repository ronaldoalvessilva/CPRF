/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.BancosContas;
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
public class BancosContasBancariasDAO {

    ConexaoBancoDados conecta = new ConexaoBancoDados();
    BancosContas objBanco = new BancosContas();
    String pSTATUS_FAVORECIDO = "Ativo";

    public BancosContas incluirBancos(BancosContas objBanco) {
        conecta.abrirConexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("INSERT INTO BANCOS_CONTAS (StatusBanco,DataBanco,DescricaoBanco,Agencia,ContaCorrente,OperacaoBanco,IdForn,Endereco,Cidade,Estado,UsuarioInsert,DataInsert,HorarioInsert) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, objBanco.getStatusBanco());
            pst.setTimestamp(2, new java.sql.Timestamp(objBanco.getDataBanco().getTime()));
            pst.setString(3, objBanco.getDescricaoBanco());
            pst.setString(4, objBanco.getAgencia());
            pst.setString(5, objBanco.getContaCorrente());
            pst.setString(6, objBanco.getOperacao());
            pst.setInt(7, objBanco.getIdForn());
            pst.setString(8, objBanco.getEndereco());
            pst.setString(9, objBanco.getCidade());
            pst.setString(10, objBanco.getEstado());
            pst.setString(11, objBanco.getUsuarioInsert());
            pst.setString(12, objBanco.getDataInsert());
            pst.setString(13, objBanco.getHorarioInsert());
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
            PreparedStatement pst = conecta.con.prepareStatement("UPDATE BANCOS_CONTAS SET StatusBanco=?,DataBanco=?,DescricaoBanco=?,Agencia=?,ContaCorrente=?,OperacaoBanco=?,Favorecido=?,Endereco=?,Cidade=?,Estado=?,UsuarioUp=?,DataUp=?,HorarioUp=? WHERE IdBanco='" + objBanco.getIdBanco() + "'");
            pst.setString(1, objBanco.getStatusBanco());
            pst.setTimestamp(2, new java.sql.Timestamp(objBanco.getDataBanco().getTime()));
            pst.setString(3, objBanco.getDescricaoBanco());
            pst.setString(4, objBanco.getAgencia());
            pst.setString(5, objBanco.getContaCorrente());
            pst.setString(6, objBanco.getOperacao());
            pst.setString(7, objBanco.getFavorecido());
            pst.setString(8, objBanco.getEndereco());
            pst.setString(9, objBanco.getCidade());
            pst.setString(10, objBanco.getEstado());
            pst.setString(11, objBanco.getUsuarioUp());
            pst.setString(12, objBanco.getDataUp());
            pst.setString(13, objBanco.getHorarioUp());
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

    public List<BancosContas> read() throws Exception {
        conecta.abrirConexao();
        List<BancosContas> listaBancos = new ArrayList<BancosContas>();
        try {
            conecta.executaSQL("SELECT * FROM BANCOS_CONTAS "
                    + "WHERE StatusBanco='" + pSTATUS_FAVORECIDO + "'");
            while (conecta.rs.next()) {
                BancosContas pDigiBanco = new BancosContas();
                pDigiBanco.setIdBanco(conecta.rs.getInt("IdBanco"));
                pDigiBanco.setAgencia(conecta.rs.getString("Agencia"));
                pDigiBanco.setDescricaoBanco(conecta.rs.getString("DescricaoBanco"));
                pDigiBanco.setContaCorrente(conecta.rs.getString("ContaCorrente"));
                pDigiBanco.setFavorecido(conecta.rs.getString("Favorecido"));
                listaBancos.add(pDigiBanco);
            }
            return listaBancos;
        } catch (SQLException ex) {
            Logger.getLogger(BancosContasBancariasDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conecta.desconecta();
        }
        return null;
    }
}
