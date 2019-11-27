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
public class BaixaCPR {

    private Date dataOperacao;
    private String operacaoBaixa;
    private Date dataEmissaoBaixa;
    private Date documentoBaixa;
    private Date dataVencimentoOperacao;
    private Float valorPRBaixa;
    private Float valorOperacao;
    private Float jurosDias;
    private Float valorJurosDias;
    private int diasAtraso;

    public BaixaCPR() {
    }

    public BaixaCPR(Date dataOperacao, String operacaoBaixa, Date dataEmissaoBaixa, Date documentoBaixa, Date dataVencimentoOperacao, Float valorPRBaixa, Float valorOperacao, Float jurosDias, Float valorJurosDias, int diasAtraso) {
        this.dataOperacao = dataOperacao;
        this.operacaoBaixa = operacaoBaixa;
        this.dataEmissaoBaixa = dataEmissaoBaixa;
        this.documentoBaixa = documentoBaixa;
        this.dataVencimentoOperacao = dataVencimentoOperacao;
        this.valorPRBaixa = valorPRBaixa;
        this.valorOperacao = valorOperacao;
        this.jurosDias = jurosDias;
        this.valorJurosDias = valorJurosDias;
        this.diasAtraso = diasAtraso;
    }

    /**
     * @return the dataOperacao
     */
    public Date getDataOperacao() {
        return dataOperacao;
    }

    /**
     * @param dataOperacao the dataOperacao to set
     */
    public void setDataOperacao(Date dataOperacao) {
        this.dataOperacao = dataOperacao;
    }

    /**
     * @return the operacaoBaixa
     */
    public String getOperacaoBaixa() {
        return operacaoBaixa;
    }

    /**
     * @param operacaoBaixa the operacaoBaixa to set
     */
    public void setOperacaoBaixa(String operacaoBaixa) {
        this.operacaoBaixa = operacaoBaixa;
    }

    /**
     * @return the dataEmissaoBaixa
     */
    public Date getDataEmissaoBaixa() {
        return dataEmissaoBaixa;
    }

    /**
     * @param dataEmissaoBaixa the dataEmissaoBaixa to set
     */
    public void setDataEmissaoBaixa(Date dataEmissaoBaixa) {
        this.dataEmissaoBaixa = dataEmissaoBaixa;
    }

    /**
     * @return the documentoBaixa
     */
    public Date getDocumentoBaixa() {
        return documentoBaixa;
    }

    /**
     * @param documentoBaixa the documentoBaixa to set
     */
    public void setDocumentoBaixa(Date documentoBaixa) {
        this.documentoBaixa = documentoBaixa;
    }

    /**
     * @return the dataVencimentoOperacao
     */
    public Date getDataVencimentoOperacao() {
        return dataVencimentoOperacao;
    }

    /**
     * @param dataVencimentoOperacao the dataVencimentoOperacao to set
     */
    public void setDataVencimentoOperacao(Date dataVencimentoOperacao) {
        this.dataVencimentoOperacao = dataVencimentoOperacao;
    }

    /**
     * @return the valorPRBaixa
     */
    public Float getValorPRBaixa() {
        return valorPRBaixa;
    }

    /**
     * @param valorPRBaixa the valorPRBaixa to set
     */
    public void setValorPRBaixa(Float valorPRBaixa) {
        this.valorPRBaixa = valorPRBaixa;
    }

    /**
     * @return the valorOperacao
     */
    public Float getValorOperacao() {
        return valorOperacao;
    }

    /**
     * @param valorOperacao the valorOperacao to set
     */
    public void setValorOperacao(Float valorOperacao) {
        this.valorOperacao = valorOperacao;
    }

    /**
     * @return the jurosDias
     */
    public Float getJurosDias() {
        return jurosDias;
    }

    /**
     * @param jurosDias the jurosDias to set
     */
    public void setJurosDias(Float jurosDias) {
        this.jurosDias = jurosDias;
    }

    /**
     * @return the valorJurosDias
     */
    public Float getValorJurosDias() {
        return valorJurosDias;
    }

    /**
     * @param valorJurosDias the valorJurosDias to set
     */
    public void setValorJurosDias(Float valorJurosDias) {
        this.valorJurosDias = valorJurosDias;
    }

    /**
     * @return the diasAtraso
     */
    public int getDiasAtraso() {
        return diasAtraso;
    }

    /**
     * @param diasAtraso the diasAtraso to set
     */
    public void setDiasAtraso(int diasAtraso) {
        this.diasAtraso = diasAtraso;
    }
}
