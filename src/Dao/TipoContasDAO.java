/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.TipoConta;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ronal
 */
public class TipoContasDAO {

    ConexaoBancoDados conecta = new ConexaoBancoDados();
    TipoConta objTipoConta = new TipoConta();

    public TipoConta incluirTipoConta(TipoConta objTipoConta) {
        conecta.abrirConexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("INSERT INTO TIPO_CONTA (StatusConta,DataConta,TipoConta,DescricaoConta,Observacao,UsuarioInsert,DataInsert,HorarioInsert) VALUES(?,?,?,?,?,?,?,?)");
            pst.setString(1, objTipoConta.getStatusConta());
            pst.setTimestamp(2, new java.sql.Timestamp(objTipoConta.getDataConta().getTime()));
            pst.setString(3, objTipoConta.getTipoConta());
            pst.setString(4, objTipoConta.getDescricaoConta());
            pst.setString(5, objTipoConta.getObservacao());
            pst.setString(6, objTipoConta.getUsuarioInsert());
            pst.setString(7, objTipoConta.getDataInsert());
            pst.setString(8, objTipoConta.getHorarioInsert());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi possível INSERIR os Dados.\nERRO: " + ex);
        }
        conecta.desconecta();
        return objTipoConta;
    }

    public TipoConta alterarTipoConta(TipoConta objTipoConta) {
        conecta.abrirConexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("UPDATE TIPO_CONTA SET StatusConta=?,DataConta=?,TipoConta=?,DescricaoConta=?,Observacao=?,UsuarioUp=?,DataUp=?,HorarioUp=? WHERE IdConta='" + objTipoConta.getIdConta() + "'");
            pst.setString(1, objTipoConta.getStatusConta());
            pst.setTimestamp(2, new java.sql.Timestamp(objTipoConta.getDataConta().getTime()));
            pst.setString(3, objTipoConta.getTipoConta());
            pst.setString(4, objTipoConta.getDescricaoConta());
            pst.setString(5, objTipoConta.getObservacao());
            pst.setString(6, objTipoConta.getUsuarioUp());
            pst.setString(7, objTipoConta.getDataUp());
            pst.setString(8, objTipoConta.getHorarioUp());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi possível ALTERAR os Dados.\nERRO: " + ex);
        }
        conecta.desconecta();
        return objTipoConta;
    }

    public TipoConta excluirTipoConta(TipoConta objTipoConta) {
        conecta.abrirConexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("DELETE FROM TIPO_CONTA WHERE IdConta='" + objTipoConta.getIdConta() + "'");
            pst.setString(1, objTipoConta.getStatusConta());
            pst.setTimestamp(2, new java.sql.Timestamp(objTipoConta.getDataConta().getTime()));
            pst.setString(3, objTipoConta.getTipoConta());
            pst.setString(4, objTipoConta.getDescricaoConta());
            pst.setString(5, objTipoConta.getObservacao());
            pst.setString(6, objTipoConta.getUsuarioUp());
            pst.setString(7, objTipoConta.getDataUp());
            pst.setString(8, objTipoConta.getHorarioUp());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi possível EXCLUIR os Dados.\nERRO: " + ex);
        }
        conecta.desconecta();
        return objTipoConta;
    }
}
