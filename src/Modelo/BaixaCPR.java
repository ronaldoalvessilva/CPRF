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

    private int idBaixa;
    private int idForma;
    private String FormaPagamento;
    private int idBanco;
    private String Agencia;
    private String ContaCorrente;
    private int idMov;
    private int idCentro;
    private int idConta;
    private int idForn;
    private String descricaoForma;
    private String descricaoBanco;
    private String descricaoCentro;
    private String descricaoContas;
    private String descricaoFornecedor;
    private String descricaoempresa;
    private Date dataOperacao;
    private String operacaoBaixa;
    private Date dataEmissaoBaixa;
    private String documentoBaixa;
    private Date dataVencimentoOperacao;
    private Float valorPRBaixa;
    private Float valorOperacao;
    private Float jurosDias;
    private Float valorJurosDias;
    private Float valorSaldo;
    private int diasAtraso;
    private String tipoOperacao;

    public BaixaCPR() {
    }

    public BaixaCPR(int idBaixa, int idForma, String FormaPagamento, int idBanco, String Agencia, String ContaCorrente, int idMov, int idCentro, int idConta, int idForn, String descricaoForma, String descricaoBanco, String descricaoCentro, String descricaoContas, String descricaoFornecedor, String descricaoempresa, Date dataOperacao, String operacaoBaixa, Date dataEmissaoBaixa, String documentoBaixa, Date dataVencimentoOperacao, Float valorPRBaixa, Float valorOperacao, Float jurosDias, Float valorJurosDias, Float valorSaldo, int diasAtraso, String tipoOperacao) {
        this.idBaixa = idBaixa;
        this.idForma = idForma;
        this.FormaPagamento = FormaPagamento;
        this.idBanco = idBanco;
        this.Agencia = Agencia;
        this.ContaCorrente = ContaCorrente;
        this.idMov = idMov;
        this.idCentro = idCentro;
        this.idConta = idConta;
        this.idForn = idForn;
        this.descricaoForma = descricaoForma;
        this.descricaoBanco = descricaoBanco;
        this.descricaoCentro = descricaoCentro;
        this.descricaoContas = descricaoContas;
        this.descricaoFornecedor = descricaoFornecedor;
        this.descricaoempresa = descricaoempresa;
        this.dataOperacao = dataOperacao;
        this.operacaoBaixa = operacaoBaixa;
        this.dataEmissaoBaixa = dataEmissaoBaixa;
        this.documentoBaixa = documentoBaixa;
        this.dataVencimentoOperacao = dataVencimentoOperacao;
        this.valorPRBaixa = valorPRBaixa;
        this.valorOperacao = valorOperacao;
        this.jurosDias = jurosDias;
        this.valorJurosDias = valorJurosDias;
        this.valorSaldo = valorSaldo;
        this.diasAtraso = diasAtraso;
        this.tipoOperacao = tipoOperacao;
    }

    /**
     * @return the idBaixa
     */
    public int getIdBaixa() {
        return idBaixa;
    }

    /**
     * @param idBaixa the idBaixa to set
     */
    public void setIdBaixa(int idBaixa) {
        this.idBaixa = idBaixa;
    }

    /**
     * @return the idForma
     */
    public int getIdForma() {
        return idForma;
    }

    /**
     * @param idForma the idForma to set
     */
    public void setIdForma(int idForma) {
        this.idForma = idForma;
    }

    /**
     * @return the FormaPagamento
     */
    public String getFormaPagamento() {
        return FormaPagamento;
    }

    /**
     * @param FormaPagamento the FormaPagamento to set
     */
    public void setFormaPagamento(String FormaPagamento) {
        this.FormaPagamento = FormaPagamento;
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
     * @return the Agencia
     */
    public String getAgencia() {
        return Agencia;
    }

    /**
     * @param Agencia the Agencia to set
     */
    public void setAgencia(String Agencia) {
        this.Agencia = Agencia;
    }

    /**
     * @return the ContaCorrente
     */
    public String getContaCorrente() {
        return ContaCorrente;
    }

    /**
     * @param ContaCorrente the ContaCorrente to set
     */
    public void setContaCorrente(String ContaCorrente) {
        this.ContaCorrente = ContaCorrente;
    }

    /**
     * @return the idMov
     */
    public int getIdMov() {
        return idMov;
    }

    /**
     * @param idMov the idMov to set
     */
    public void setIdMov(int idMov) {
        this.idMov = idMov;
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
     * @return the idConta
     */
    public int getIdConta() {
        return idConta;
    }

    /**
     * @param idConta the idConta to set
     */
    public void setIdConta(int idConta) {
        this.idConta = idConta;
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
     * @return the descricaoForma
     */
    public String getDescricaoForma() {
        return descricaoForma;
    }

    /**
     * @param descricaoForma the descricaoForma to set
     */
    public void setDescricaoForma(String descricaoForma) {
        this.descricaoForma = descricaoForma;
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
     * @return the descricaoContas
     */
    public String getDescricaoContas() {
        return descricaoContas;
    }

    /**
     * @param descricaoContas the descricaoContas to set
     */
    public void setDescricaoContas(String descricaoContas) {
        this.descricaoContas = descricaoContas;
    }

    /**
     * @return the descricaoFornecedor
     */
    public String getDescricaoFornecedor() {
        return descricaoFornecedor;
    }

    /**
     * @param descricaoFornecedor the descricaoFornecedor to set
     */
    public void setDescricaoFornecedor(String descricaoFornecedor) {
        this.descricaoFornecedor = descricaoFornecedor;
    }

    /**
     * @return the descricaoempresa
     */
    public String getDescricaoempresa() {
        return descricaoempresa;
    }

    /**
     * @param descricaoempresa the descricaoempresa to set
     */
    public void setDescricaoempresa(String descricaoempresa) {
        this.descricaoempresa = descricaoempresa;
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
    public String getDocumentoBaixa() {
        return documentoBaixa;
    }

    /**
     * @param documentoBaixa the documentoBaixa to set
     */
    public void setDocumentoBaixa(String documentoBaixa) {
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
     * @return the valorSaldo
     */
    public Float getValorSaldo() {
        return valorSaldo;
    }

    /**
     * @param valorSaldo the valorSaldo to set
     */
    public void setValorSaldo(Float valorSaldo) {
        this.valorSaldo = valorSaldo;
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

    /**
     * @return the tipoOperacao
     */
    public String getTipoOperacao() {
        return tipoOperacao;
    }

    /**
     * @param tipoOperacao the tipoOperacao to set
     */
    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }
}
