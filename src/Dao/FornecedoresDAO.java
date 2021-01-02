/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

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
public class FornecedoresDAO {

    ConexaoBancoDados conecta = new ConexaoBancoDados();
    Fornecedor objForn = new Fornecedor();

    String pSTATUS_FORNECEDOR = "Ativo";

    public Fornecedor incluirFornecedor(Fornecedor objForn) {
        conecta.abrirConexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("INSERT INTO FORNECEDORES_AC (ClassFor,StatusFor,RazaoSocial,Cnpj,InsEstadual,Telefone,Telefone1,Celular,Email,Fax,Endereco,Compl,Cep,Cidade,Estado,EnderecoCob,ComplCob,CepCob,CidadeCob,EstadoCob,Modulo,UsuarioInsert,DataInsert,HorarioInsert) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, objForn.getClassFor());
            pst.setString(2, objForn.getStatusFor());
            pst.setString(3, objForn.getRazaoSocial());
            pst.setString(4, objForn.getCnpj());
            pst.setString(5, objForn.getInsEstadual());
            pst.setString(6, objForn.getTelefone());
            pst.setString(7, objForn.getTelefone1());
            pst.setString(8, objForn.getCelular());
            pst.setString(9, objForn.getEmail());
            pst.setString(10, objForn.getFax());
            pst.setString(11, objForn.getEndereco());
            pst.setString(12, objForn.getCompl());
            pst.setString(13, objForn.getCep());
            pst.setString(14, objForn.getCidade());
            pst.setString(15, objForn.getEstado());
            pst.setString(16, objForn.getEnderecoCob());
            pst.setString(17, objForn.getComplCob());
            pst.setString(18, objForn.getCepCob());
            pst.setString(19, objForn.getCidadeCob());
            pst.setString(20, objForn.getEstadoCob());
            pst.setString(21, objForn.getModulo());
            pst.setString(22, objForn.getUsuarioInsert());
            pst.setString(23, objForn.getDataInsert());
            pst.setString(24, objForn.getHorarioInsert());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi possivel INSERIR os Dados\n\nERRO" + ex);
        }
        conecta.desconecta();
        return objForn;
    }

    public Fornecedor alterarFornecedor(Fornecedor objForn) {
        conecta.abrirConexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("UPDATE FORNECEDORES_AC SET ClassFor=?,StatusFor=?,RazaoSocial=?,Cnpj=?,InsEstadual=?,Telefone=?,Telefone1=?,Celular=?,Email=?,Fax=?,Endereco=?,Compl=?,Cep=?,Cidade=?,Estado=?,EnderecoCob=?,ComplCob=?,CepCob=?,CidadeCob=?,EstadoCob=?,Modulo=?,UsuarioUp=?,DataUp=?,HorarioUp=? WHERE IdForn='" + objForn.getIdForn() + "'");
            pst.setString(1, objForn.getClassFor());
            pst.setString(2, objForn.getStatusFor());
            pst.setString(3, objForn.getRazaoSocial());
            pst.setString(4, objForn.getCnpj());
            pst.setString(5, objForn.getInsEstadual());
            pst.setString(6, objForn.getTelefone());
            pst.setString(7, objForn.getTelefone1());
            pst.setString(8, objForn.getCelular());
            pst.setString(9, objForn.getEmail());
            pst.setString(10, objForn.getFax());
            pst.setString(11, objForn.getEndereco());
            pst.setString(12, objForn.getCompl());
            pst.setString(13, objForn.getCep());
            pst.setString(14, objForn.getCidade());
            pst.setString(15, objForn.getEstado());
            pst.setString(16, objForn.getEnderecoCob());
            pst.setString(17, objForn.getComplCob());
            pst.setString(18, objForn.getCepCob());
            pst.setString(19, objForn.getCidadeCob());
            pst.setString(20, objForn.getEstadoCob());
            pst.setString(21, objForn.getModulo());
            pst.setString(22, objForn.getUsuarioUp());
            pst.setString(23, objForn.getDataUp());
            pst.setString(24, objForn.getHorarioUp());
            pst.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi possivel ALTERAR os Dados\n\nERRO" + ex);
        }
        conecta.desconecta();
        return objForn;
    }

    public Fornecedor excluirFornecedor(Fornecedor objForn) {
        conecta.abrirConexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("DELETE FROM FORNECEDORES_AC WHERE IdForn='" + objForn.getIdForn() + "'");
            pst.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi possivel EXCLUIR os Dados\n\nERRO" + ex);
        }
        conecta.desconecta();
        return objForn;
    }

    public List<Fornecedor> read() throws Exception {
        conecta.abrirConexao();
        List<Fornecedor> listaFornecedores = new ArrayList<Fornecedor>();
        try {
            conecta.executaSQL("SELECT * FROM FORNECEDORES_AC "
                    + "WHERE StatusFor='" + pSTATUS_FORNECEDOR + "' "
                    + "ORDER BY RazaoSocial");
            while (conecta.rs.next()) {
                Fornecedor pDigiForn = new Fornecedor();
                pDigiForn.setIdForn(conecta.rs.getInt("IdForn"));
                pDigiForn.setStatusFor(conecta.rs.getString("StatusFor"));
                pDigiForn.setRazaoSocial(conecta.rs.getString("RazaoSocial"));
                listaFornecedores.add(pDigiForn);
            }
            return listaFornecedores;
        } catch (SQLException ex) {
            Logger.getLogger(FornecedoresDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conecta.desconecta();
        }
        return null;
    }
}
