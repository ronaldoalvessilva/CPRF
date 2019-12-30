/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.MovimentoBancario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Socializa TI 02
 */
public class MovimentoBancarioDAO {

    ConexaoBancoDados conecta = new ConexaoBancoDados();
    MovimentoBancario objMovBanc = new MovimentoBancario();
    String pSTATUS_BANCO = "Ativo";

    public MovimentoBancario incluirMovimentoBancos(MovimentoBancario objMovBanc) {
        conecta.abrirConexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("INSERT INTO MOVIMENTO_BANCARIO (StatusRegistro,IdBanco,DataRegistro,TipoPessoa,Depositante,ValorDeposito,TipoDeposito,Observacao,UsuarioInsert,DataInsert,HorarioInsert) VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, objMovBanc.getStatusMov());
            pst.setInt(2, objMovBanc.getIdBanco());
            pst.setTimestamp(3, new java.sql.Timestamp(objMovBanc.getDataRegistro().getTime()));
            pst.setString(4, objMovBanc.getTipoPessoa());
            pst.setString(5, objMovBanc.getDepositante());
            pst.setDouble(6, objMovBanc.getValorDeposito());
            pst.setString(7, objMovBanc.getTipoDeposito());
            pst.setString(8, objMovBanc.getObservacao());
            pst.setString(9, objMovBanc.getUsuarioInsert());
            pst.setString(10, objMovBanc.getDataInsert());
            pst.setString(11, objMovBanc.getHorarioInsert());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi possível INSERIR os Dados\nERRO: " + ex);
        }
        conecta.desconecta();
        return objMovBanc;
    }
}
