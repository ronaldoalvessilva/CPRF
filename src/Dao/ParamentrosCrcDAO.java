/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.ParametrosCrc;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ronaldo
 */
public class ParamentrosCrcDAO {

    ConexaoBancoDados conecta = new ConexaoBancoDados();
    ParametrosCrc objParCrc = new ParametrosCrc();

    public ParametrosCrc alterarParametrosCrc(ParametrosCrc objParCrc) {

        conecta.abrirConexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("UPDATE PARAMETROSCRC SET TipoServidor=?,TipoBancoDados=? WHERE IdPar='" + objParCrc.getIdPar() + "'");
            pst.setString(1, objParCrc.getTipoServidor());
            pst.setString(2, objParCrc.getTipoBanco());
            pst.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi possivel ALTERAR os Dados.\nERRO: " + ex);
        }
        conecta.desconecta();
        return objParCrc;
    }
}
