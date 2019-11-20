/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.CentroCusto;
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
public class CentroCustoDAO {

    ConexaoBancoDados conecta = new ConexaoBancoDados();
    CentroCusto objCentro = new CentroCusto();
    //
    String pSTATUS_CENTRO = "Ativo";

    public CentroCusto incluirCentroCusto(CentroCusto objCentro) {
        conecta.abrirConexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("INSERT INTO CENTRO_CUSTO (StatusCentro,DataCentro,DescricaoCentro,Observacao,UsuarioInsert,DataInsert,HorarioInsert) VALUES(?,?,?,?,?,?,?)");
            pst.setString(1, objCentro.getStatusCentro());
            pst.setTimestamp(2, new java.sql.Timestamp(objCentro.getDataCentro().getTime()));
            pst.setString(3, objCentro.getDescricaoCentro());
            pst.setString(4, objCentro.getObservacao());
            pst.setString(5, objCentro.getUsuarioInsert());
            pst.setString(6, objCentro.getDataInsert());
            pst.setString(7, objCentro.getHorarioInsert());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi possível INSERIR os Dados.\nERRO: " + ex);
        }
        conecta.desconecta();
        return objCentro;
    }

    public CentroCusto alterarCentroCusto(CentroCusto objCentro) {
        conecta.abrirConexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("UPDATE CENTRO_CUSTO SET StatusCentro=?,DataCentro=?,DescricaoCentro=?,Observacao=?,UsuarioUp=?,DataUp=?,HorarioUp=? WHERE IdCentro='" + objCentro.getIdCentro() + "'");
            pst.setString(1, objCentro.getStatusCentro());
            pst.setTimestamp(2, new java.sql.Timestamp(objCentro.getDataCentro().getTime()));
            pst.setString(3, objCentro.getDescricaoCentro());
            pst.setString(4, objCentro.getObservacao());
            pst.setString(5, objCentro.getUsuarioUp());
            pst.setString(6, objCentro.getDataUp());
            pst.setString(7, objCentro.getHorarioUp());
            pst.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi possível ALTERAR os Dados.\nERRO: " + ex);
        }
        conecta.desconecta();
        return objCentro;
    }

    public CentroCusto excluirCentroCusto(CentroCusto objCentro) {
        conecta.abrirConexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("DELETE FROM CENTRO_CUSTO WHERE IdCentro='" + objCentro.getIdCentro() + "'");
            pst.setString(1, objCentro.getStatusCentro());
            pst.setTimestamp(2, new java.sql.Timestamp(objCentro.getDataCentro().getTime()));
            pst.setString(3, objCentro.getDescricaoCentro());
            pst.setString(4, objCentro.getObservacao());
            pst.setString(5, objCentro.getUsuarioUp());
            pst.setString(6, objCentro.getDataUp());
            pst.setString(7, objCentro.getHorarioUp());
            pst.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi possível EXCLUIR os Dados.\nERRO: " + ex);
        }
        conecta.desconecta();
        return objCentro;
    }

    public List<CentroCusto> read() throws Exception {
        conecta.abrirConexao();
        List<CentroCusto> listaCentro = new ArrayList<CentroCusto>();
        try {
            conecta.executaSQL("SELECT * FROM CENTRO_CUSTO "
                    + "WHERE StatusCentro='" + pSTATUS_CENTRO + "'");
            while (conecta.rs.next()) {
                CentroCusto pDigiCentro = new CentroCusto();
                pDigiCentro.setIdCentro(conecta.rs.getInt("IdCentro"));
                pDigiCentro.setDescricaoCentro(conecta.rs.getString("DescricaoCentro"));
                listaCentro.add(pDigiCentro);
            }
            return listaCentro;
        } catch (SQLException ex) {
            Logger.getLogger(CentroCustoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conecta.desconecta();
        }
        return null;
    }
}
