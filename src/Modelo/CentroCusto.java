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
public class CentroCusto {

    private int idCentro;
    private String statusCentro;
    private Date dataCentro;
    private String descricaoCentro;
    private String observacao;
    private String usuarioInsert;
    private String usuarioUp;
    private String dataInsert;
    private String dataUp;
    private String horarioInsert;
    private String horarioUp;

    public CentroCusto() {
    }

    public CentroCusto(int idCentro, String statusCentro, Date dataCentro, String descricaoCentro, String observacao, String usuarioInsert, String usuarioUp, String dataInsert, String dataUp, String horarioInsert, String horarioUp) {
        this.idCentro = idCentro;
        this.statusCentro = statusCentro;
        this.dataCentro = dataCentro;
        this.descricaoCentro = descricaoCentro;
        this.observacao = observacao;
        this.usuarioInsert = usuarioInsert;
        this.usuarioUp = usuarioUp;
        this.dataInsert = dataInsert;
        this.dataUp = dataUp;
        this.horarioInsert = horarioInsert;
        this.horarioUp = horarioUp;
    }

    /**
     * @return the idCentro
     */
    public int getIdCentro() {
        return idCentro;
    }

    /**
     * @param idCentro the idCentro to set
     */
    public void setIdCentro(int idCentro) {
        this.idCentro = idCentro;
    }

    /**
     * @return the statusCentro
     */
    public String getStatusCentro() {
        return statusCentro;
    }

    /**
     * @param statusCentro the statusCentro to set
     */
    public void setStatusCentro(String statusCentro) {
        this.statusCentro = statusCentro;
    }

    /**
     * @return the dataCentro
     */
    public Date getDataCentro() {
        return dataCentro;
    }

    /**
     * @param dataCentro the dataCentro to set
     */
    public void setDataCentro(Date dataCentro) {
        this.dataCentro = dataCentro;
    }

    /**
     * @return the descricaoCentro
     */
    public String getDescricaoCentro() {
        return descricaoCentro;
    }

    /**
     * @param descricaoCentro the descricaoCentro to set
     */
    public void setDescricaoCentro(String descricaoCentro) {
        this.descricaoCentro = descricaoCentro;
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
        return getDescricaoCentro(); //To change body of generated methods, choose Tools | Templates.
    }    
}
