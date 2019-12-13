/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Socializa TI 02
 */
public class MovimentoBancario {

    private int idMovBanco;
    private String statusMov;
    private Date dataRegistro;
    private String agencia;
    private int idBanco;
    private int idForn;
    private String contaCorrente;
    private String favorecido;
    private String depositante;
    private Float valorDeposito;
    private String tipoDeposito;
    private String observacao;
    private String usuarioInsert;
    private String dataInsert;
    private String horarioInsert;

    public MovimentoBancario() {
    }

    public MovimentoBancario(int idMovBanco, String statusMov, Date dataRegistro, String agencia, int idBanco, int idForn, String contaCorrente, String favorecido, String depositante, Float valorDeposito, String tipoDeposito, String observacao, String usuarioInsert, String dataInsert, String horarioInsert) {
        this.idMovBanco = idMovBanco;
        this.statusMov = statusMov;
        this.dataRegistro = dataRegistro;
        this.agencia = agencia;
        this.idBanco = idBanco;
        this.idForn = idForn;
        this.contaCorrente = contaCorrente;
        this.favorecido = favorecido;
        this.depositante = depositante;
        this.valorDeposito = valorDeposito;
        this.tipoDeposito = tipoDeposito;
        this.observacao = observacao;
        this.usuarioInsert = usuarioInsert;
        this.dataInsert = dataInsert;
        this.horarioInsert = horarioInsert;
    }

    /**
     * @return the idMovBanco
     */
    public int getIdMovBanco() {
        return idMovBanco;
    }

    /**
     * @param idMovBanco the idMovBanco to set
     */
    public void setIdMovBanco(int idMovBanco) {
        this.idMovBanco = idMovBanco;
    }

    /**
     * @return the statusMov
     */
    public String getStatusMov() {
        return statusMov;
    }

    /**
     * @param statusMov the statusMov to set
     */
    public void setStatusMov(String statusMov) {
        this.statusMov = statusMov;
    }

    /**
     * @return the dataRegistro
     */
    public Date getDataRegistro() {
        return dataRegistro;
    }

    /**
     * @param dataRegistro the dataRegistro to set
     */
    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
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
     * @return the idForn
     */
    public int getIdForn() {
        return idForn;
    }

    /**
     * @param idForn the idForn to set
     */
    public void setIdForn(int idForn) {
        this.idForn = idForn;
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
     * @return the favorecido
     */
    public String getFavorecido() {
        return favorecido;
    }

    /**
     * @param favorecido the favorecido to set
     */
    public void setFavorecido(String favorecido) {
        this.favorecido = favorecido;
    }

    /**
     * @return the depositante
     */
    public String getDepositante() {
        return depositante;
    }

    /**
     * @param depositante the depositante to set
     */
    public void setDepositante(String depositante) {
        this.depositante = depositante;
    }

    /**
     * @return the valorDeposito
     */
    public Float getValorDeposito() {
        return valorDeposito;
    }

    /**
     * @param valorDeposito the valorDeposito to set
     */
    public void setValorDeposito(Float valorDeposito) {
        this.valorDeposito = valorDeposito;
    }

    /**
     * @return the tipoDeposito
     */
    public String getTipoDeposito() {
        return tipoDeposito;
    }

    /**
     * @param tipoDeposito the tipoDeposito to set
     */
    public void setTipoDeposito(String tipoDeposito) {
        this.tipoDeposito = tipoDeposito;
    }

    /**
     * @return the observacao
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * @param observacao the observacao to set
     */
    public void setObservacao(String observacao) {
        this.observacao = observacao;
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
}
