/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author ronaldo
 */
public class FormaPagamento {

    private int IdForma;
    private Date DataForma;
    private String StatusForma;
    private String DescricaoForma;
    private int cartao;
    private int visa;
    private int master;
    private int outros;
    private int deposito;
    private int cheque;
    private int dinheiro;
    private int boleto;
    private int debitoConta;
    private int avista;
    private int formaPagtoCartao;
    private int formaPagtoDeposito;
    private int formaPagtoBoleto;
    private int formaPagtoDebito;
    private int formaPagtoVista;
    private String UsuarioInsert;
    private String UsuarioUp;
    private String DataInsert;
    private String DataUp;
    private String HorarioInsert;
    private String HorarioUp;

    public FormaPagamento() {
    }

    public FormaPagamento(int IdForma, Date DataForma, String StatusForma, String DescricaoForma, int cartao, int visa, int master, int outros, int deposito, int cheque, int dinheiro, int boleto, int debitoConta, int avista, int formaPagtoCartao, int formaPagtoDeposito, int formaPagtoBoleto, int formaPagtoDebito, int formaPagtoVista, String UsuarioInsert, String UsuarioUp, String DataInsert, String DataUp, String HorarioInsert, String HorarioUp) {
        this.IdForma = IdForma;
        this.DataForma = DataForma;
        this.StatusForma = StatusForma;
        this.DescricaoForma = DescricaoForma;
        this.cartao = cartao;
        this.visa = visa;
        this.master = master;
        this.outros = outros;
        this.deposito = deposito;
        this.cheque = cheque;
        this.dinheiro = dinheiro;
        this.boleto = boleto;
        this.debitoConta = debitoConta;
        this.avista = avista;
        this.formaPagtoCartao = formaPagtoCartao;
        this.formaPagtoDeposito = formaPagtoDeposito;
        this.formaPagtoBoleto = formaPagtoBoleto;
        this.formaPagtoDebito = formaPagtoDebito;
        this.formaPagtoVista = formaPagtoVista;
        this.UsuarioInsert = UsuarioInsert;
        this.UsuarioUp = UsuarioUp;
        this.DataInsert = DataInsert;
        this.DataUp = DataUp;
        this.HorarioInsert = HorarioInsert;
        this.HorarioUp = HorarioUp;
    }

    /**
     * @return the IdForma
     */
    public int getIdForma() {
        return IdForma;
    }

    /**
     * @param IdForma the IdForma to set
     */
    public void setIdForma(int IdForma) {
        this.IdForma = IdForma;
    }

    /**
     * @return the DataForma
     */
    public Date getDataForma() {
        return DataForma;
    }

    /**
     * @param DataForma the DataForma to set
     */
    public void setDataForma(Date DataForma) {
        this.DataForma = DataForma;
    }

    /**
     * @return the StatusForma
     */
    public String getStatusForma() {
        return StatusForma;
    }

    /**
     * @param StatusForma the StatusForma to set
     */
    public void setStatusForma(String StatusForma) {
        this.StatusForma = StatusForma;
    }

    /**
     * @return the DescricaoForma
     */
    public String getDescricaoForma() {
        return DescricaoForma;
    }

    /**
     * @param DescricaoForma the DescricaoForma to set
     */
    public void setDescricaoForma(String DescricaoForma) {
        this.DescricaoForma = DescricaoForma;
    }

    /**
     * @return the cartao
     */
    public int getCartao() {
        return cartao;
    }

    /**
     * @param cartao the cartao to set
     */
    public void setCartao(int cartao) {
        this.cartao = cartao;
    }

    /**
     * @return the visa
     */
    public int getVisa() {
        return visa;
    }

    /**
     * @param visa the visa to set
     */
    public void setVisa(int visa) {
        this.visa = visa;
    }

    /**
     * @return the master
     */
    public int getMaster() {
        return master;
    }

    /**
     * @param master the master to set
     */
    public void setMaster(int master) {
        this.master = master;
    }

    /**
     * @return the outros
     */
    public int getOutros() {
        return outros;
    }

    /**
     * @param outros the outros to set
     */
    public void setOutros(int outros) {
        this.outros = outros;
    }

    /**
     * @return the deposito
     */
    public int getDeposito() {
        return deposito;
    }

    /**
     * @param deposito the deposito to set
     */
    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    /**
     * @return the cheque
     */
    public int getCheque() {
        return cheque;
    }

    /**
     * @param cheque the cheque to set
     */
    public void setCheque(int cheque) {
        this.cheque = cheque;
    }

    /**
     * @return the dinheiro
     */
    public int getDinheiro() {
        return dinheiro;
    }

    /**
     * @param dinheiro the dinheiro to set
     */
    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    /**
     * @return the boleto
     */
    public int getBoleto() {
        return boleto;
    }

    /**
     * @param boleto the boleto to set
     */
    public void setBoleto(int boleto) {
        this.boleto = boleto;
    }

    /**
     * @return the debitoConta
     */
    public int getDebitoConta() {
        return debitoConta;
    }

    /**
     * @param debitoConta the debitoConta to set
     */
    public void setDebitoConta(int debitoConta) {
        this.debitoConta = debitoConta;
    }

    /**
     * @return the avista
     */
    public int getAvista() {
        return avista;
    }

    /**
     * @param avista the avista to set
     */
    public void setAvista(int avista) {
        this.avista = avista;
    }

    /**
     * @return the formaPagtoCartao
     */
    public int getFormaPagtoCartao() {
        return formaPagtoCartao;
    }

    /**
     * @param formaPagtoCartao the formaPagtoCartao to set
     */
    public void setFormaPagtoCartao(int formaPagtoCartao) {
        this.formaPagtoCartao = formaPagtoCartao;
    }

    /**
     * @return the formaPagtoDeposito
     */
    public int getFormaPagtoDeposito() {
        return formaPagtoDeposito;
    }

    /**
     * @param formaPagtoDeposito the formaPagtoDeposito to set
     */
    public void setFormaPagtoDeposito(int formaPagtoDeposito) {
        this.formaPagtoDeposito = formaPagtoDeposito;
    }

    /**
     * @return the formaPagtoBoleto
     */
    public int getFormaPagtoBoleto() {
        return formaPagtoBoleto;
    }

    /**
     * @param formaPagtoBoleto the formaPagtoBoleto to set
     */
    public void setFormaPagtoBoleto(int formaPagtoBoleto) {
        this.formaPagtoBoleto = formaPagtoBoleto;
    }

    /**
     * @return the formaPagtoDebito
     */
    public int getFormaPagtoDebito() {
        return formaPagtoDebito;
    }

    /**
     * @param formaPagtoDebito the formaPagtoDebito to set
     */
    public void setFormaPagtoDebito(int formaPagtoDebito) {
        this.formaPagtoDebito = formaPagtoDebito;
    }

    /**
     * @return the formaPagtoVista
     */
    public int getFormaPagtoVista() {
        return formaPagtoVista;
    }

    /**
     * @param formaPagtoVista the formaPagtoVista to set
     */
    public void setFormaPagtoVista(int formaPagtoVista) {
        this.formaPagtoVista = formaPagtoVista;
    }

    /**
     * @return the UsuarioInsert
     */
    public String getUsuarioInsert() {
        return UsuarioInsert;
    }

    /**
     * @param UsuarioInsert the UsuarioInsert to set
     */
    public void setUsuarioInsert(String UsuarioInsert) {
        this.UsuarioInsert = UsuarioInsert;
    }

    /**
     * @return the UsuarioUp
     */
    public String getUsuarioUp() {
        return UsuarioUp;
    }

    /**
     * @param UsuarioUp the UsuarioUp to set
     */
    public void setUsuarioUp(String UsuarioUp) {
        this.UsuarioUp = UsuarioUp;
    }

    /**
     * @return the DataInsert
     */
    public String getDataInsert() {
        return DataInsert;
    }

    /**
     * @param DataInsert the DataInsert to set
     */
    public void setDataInsert(String DataInsert) {
        this.DataInsert = DataInsert;
    }

    /**
     * @return the DataUp
     */
    public String getDataUp() {
        return DataUp;
    }

    /**
     * @param DataUp the DataUp to set
     */
    public void setDataUp(String DataUp) {
        this.DataUp = DataUp;
    }

    /**
     * @return the HorarioInsert
     */
    public String getHorarioInsert() {
        return HorarioInsert;
    }

    /**
     * @param HorarioInsert the HorarioInsert to set
     */
    public void setHorarioInsert(String HorarioInsert) {
        this.HorarioInsert = HorarioInsert;
    }

    /**
     * @return the HorarioUp
     */
    public String getHorarioUp() {
        return HorarioUp;
    }

    /**
     * @param HorarioUp the HorarioUp to set
     */
    public void setHorarioUp(String HorarioUp) {
        this.HorarioUp = HorarioUp;
    }

    @Override
    public String toString() {
        return getDescricaoForma(); //To change body of generated methods, choose Tools | Templates.
    }
}
