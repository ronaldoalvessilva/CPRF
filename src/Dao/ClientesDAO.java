/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Clientes;
import Modelo.Fornecedor;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ClientesDAO {

    ConexaoBancoDados conecta = new ConexaoBancoDados();
    Clientes objClie = new Clientes();

    String pSTATUS_FORNECEDOR = "Ativo";

    public Clientes incluirCliente(Clientes objClie) {
        conecta.abrirConexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("INSERT INTO CLIENTES (ClassClie,StatusClie,RazaoSocial,Cnpj,InsEstadual,Telefone,Telefone1,Celular,Email,Fax,Endereco,Compl,Cep,Cidade,Estado,EnderecoCob,ComplCob,CepCob,CidadeCob,EstadoCob,Modulo,UsuarioInsert,DataInsert,HorarioInsert) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, objClie.getClassFor());
            pst.setString(2, objClie.getStatusFor());
            pst.setString(3, objClie.getRazaoSocial());
            pst.setString(4, objClie.getCnpj());
            pst.setString(5, objClie.getInsEstadual());
            pst.setString(6, objClie.getTelefone());
            pst.setString(7, objClie.getTelefone1());
            pst.setString(8, objClie.getCelular());
            pst.setString(9, objClie.getEmail());
            pst.setString(10, objClie.getFax());
            pst.setString(11, objClie.getEndereco());
            pst.setString(12, objClie.getCompl());
            pst.setString(13, objClie.getCep());
            pst.setString(14, objClie.getCidade());
            pst.setString(15, objClie.getEstado());
            pst.setString(16, objClie.getEnderecoCob());
            pst.setString(17, objClie.getComplCob());
            pst.setString(18, objClie.getCepCob());
            pst.setString(19, objClie.getCidadeCob());
            pst.setString(20, objClie.getEstadoCob());
            pst.setString(21, objClie.getModulo());
            pst.setString(22, objClie.getUsuarioInsert());
            pst.setString(23, objClie.getDataInsert());
            pst.setString(24, objClie.getHorarioInsert());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi possivel INSERIR os Dados\n\nERRO" + ex);
        }
        conecta.desconecta();
        return objClie;
    }

    public Clientes alterarCliente(Clientes objClie) {
        conecta.abrirConexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("UPDATE CLIENTES SET ClassClie=?,StatusClie=?,RazaoSocial=?,Cnpj=?,InsEstadual=?,Telefone=?,Telefone1=?,Celular=?,Email=?,Fax=?,Endereco=?,Compl=?,Cep=?,Cidade=?,Estado=?,EnderecoCob=?,ComplCob=?,CepCob=?,CidadeCob=?,EstadoCob=?,Modulo=?,UsuarioUp=?,DataUp=?,HorarioUp=? WHERE IdClie='" + objClie.getIdForn() + "'");
            pst.setString(1, objClie.getClassFor());
            pst.setString(2, objClie.getStatusFor());
            pst.setString(3, objClie.getRazaoSocial());
            pst.setString(4, objClie.getCnpj());
            pst.setString(5, objClie.getInsEstadual());
            pst.setString(6, objClie.getTelefone());
            pst.setString(7, objClie.getTelefone1());
            pst.setString(8, objClie.getCelular());
            pst.setString(9, objClie.getEmail());
            pst.setString(10, objClie.getFax());
            pst.setString(11, objClie.getEndereco());
            pst.setString(12, objClie.getCompl());
            pst.setString(13, objClie.getCep());
            pst.setString(14, objClie.getCidade());
            pst.setString(15, objClie.getEstado());
            pst.setString(16, objClie.getEnderecoCob());
            pst.setString(17, objClie.getComplCob());
            pst.setString(18, objClie.getCepCob());
            pst.setString(19, objClie.getCidadeCob());
            pst.setString(20, objClie.getEstadoCob());
            pst.setString(21, objClie.getModulo());
            pst.setString(22, objClie.getUsuarioUp());
            pst.setString(23, objClie.getDataUp());
            pst.setString(24, objClie.getHorarioUp());
            pst.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi possivel ALTERAR os Dados\n\nERRO" + ex);
        }
        conecta.desconecta();
        return objClie;
    }

    public Clientes excluirCliente(Clientes objClie) {
        conecta.abrirConexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("DELETE FROM CLIENTES WHERE IdClie='" + objClie.getIdForn() + "'");
            pst.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi possivel EXCLUIR os Dados\n\nERRO" + ex);
        }
        conecta.desconecta();
        return objClie;
    }

    public List<Clientes> read() throws Exception {
        conecta.abrirConexao();
        List<Clientes> listaClientes = new ArrayList<Clientes>();
        try {
            conecta.executaSQL("SELECT * FROM CLIENTES "
                    + "WHERE StatusClie='" + pSTATUS_FORNECEDOR + "'");
            while (conecta.rs.next()) {
                Clientes pDigiClie = new Clientes();
                pDigiClie.setIdForn(conecta.rs.getInt("IdClie"));
                pDigiClie.setRazaoSocial(conecta.rs.getString("RazaoSocial"));
                listaClientes.add(pDigiClie);
            }
            return listaClientes;
        } catch (SQLException ex) {
            Logger.getLogger(FornecedoresDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conecta.desconecta();
        }
        return null;
    }
}
