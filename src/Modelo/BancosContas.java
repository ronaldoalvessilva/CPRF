/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author ronal
 */
public class BancosContas {

    private int idBanco;
    private String statusBanco;
    private Date dataBanco;
    private String descricaoBanco;
    private String agencia;
    private String contaCorrente;
    private String operacao;
    private String endereco;
    private String cidade;
    private String estado;
    private String usuarioInsert;
    private String usuarioUp;
    private String dataInsert;
    private String dataUp;
    private String horarioInsert;
    private String horarioUp;

    public BancosContas() {
    }

    public BancosContas(int idBanco, String statusBanco, Date dataBanco, String descricaoBanco, String agencia, String contaCorrente, String operacao, String endereco, String cidade, String estado, String usuarioInsert, String usuarioUp, String dataInsert, String dataUp, String horarioInsert, String horarioUp) {
        this.idBanco = idBanco;
        this.statusBanco = statusBanco;
        this.dataBanco = dataBanco;
        this.descricaoBanco = descricaoBanco;
        this.agencia = agencia;
        this.contaCorrente = contaCorrente;
        this.operacao = operacao;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.usuarioInsert = usuarioInsert;
        this.usuarioUp = usuarioUp;
        this.dataInsert = dataInsert;
        this.dataUp = dataUp;
        this.horarioInsert = horarioInsert;
        this.horarioUp = horarioUp;
    }

    /**
     * @return the idBanco
     */
    public int getIdBanco() {
        return idBanco;
    }

    /**
     * @param idBanco the idBanco to set
     */
    public void setIdBanco(int idBanco) {
        this.idBanco = idBanco;
    }

    /**
     * @return the statusBanco
     */
    public String getStatusBanco() {
        return statusBanco;
    }

    /**
     * @param statusBanco the statusBanco to set
     */
    public void setStatusBanco(String statusBanco) {
        this.statusBanco = statusBanco;
    }

    /**
     * @return the dataBanco
     */
    public Date getDataBanco() {
        return dataBanco;
    }

    /**
     * @param dataBanco the dataBanco to set
     */
    public void setDataBanco(Date dataBanco) {
        this.dataBanco = dataBanco;
    }

    /**
     * @return the descricaoBanco
     */
    public String getDescricaoBanco() {
        return descricaoBanco;
    }

    /**
     * @param descricaoBanco the descricaoBanco to set
     */
    public void setDescricaoBanco(String descricaoBanco) {
        this.descricaoBanco = descricaoBanco;
    }

    /**
     * @return the agencia
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the contaCorrente
     */
    public String getContaCorrente() {
        return contaCorrente;
    }

    /**
     * @param contaCorrente the contaCorrente to set
     */
    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    /**
     * @return the operacao
     */
    public String getOperacao() {
        return operacao;
    }

    /**
     * @param operacao the operacao to set
     */
    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the usuarioInsert
     */
    public String getUsuarioInsert() {
        return usuarioInsert;
    }

    /**
     * @param usuarioInsert the usuarioInsert to set
     */
    public void setUsuarioInsert(String usuarioInsert) {
        this.usuarioInsert = usuarioInsert;
    }

    /**
     * @return the usuarioUp
     */
    public String getUsuarioUp() {
        return usuarioUp;
    }

    /**
     * @param usuarioUp the usuarioUp to set
     */
    public void setUsuarioUp(String usuarioUp) {
        this.usuarioUp = usuarioUp;
    }

    /**
     * @return the dataInsert
     */
    public String getDataInsert() {
        return dataInsert;
    }

    /**
     * @param dataInsert the dataInsert to set
     */
    public void setDataInsert(String dataInsert) {
        this.dataInsert = dataInsert;
    }

    /**
     * @return the dataUp
     */
    public String getDataUp() {
        return dataUp;
    }

    /**
     * @param dataUp the dataUp to set
     */
    public void setDataUp(String dataUp) {
        this.dataUp = dataUp;
    }

    /**
     * @return the horarioInsert
     */
    public String getHorarioInsert() {
        return horarioInsert;
    }

    /**
     * @param horarioInsert the horarioInsert to set
     */
    public void setHorarioInsert(String horarioInsert) {
        this.horarioInsert = horarioInsert;
    }

    /**
     * @return the horarioUp
     */
    public String getHorarioUp() {
        return horarioUp;
    }

    /**
     * @param horarioUp the horarioUp to set
     */
    public void setHorarioUp(String horarioUp) {
        this.horarioUp = horarioUp;
    }

    @Override
    public String toString() {
        return getDescricaoBanco(); //To change body of generated methods, choose Tools | Templates.
    }
}
