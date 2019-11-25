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
public class MovimentoCPR {

    private int idMov;
    private int idForma;
    private String FormaPagamento;
    private int idBanco;
    private String Agencia;
    private String ContaCorrente;
    private int idCentro;
    private int idConta;
    private int idForn;
    private String descricaoForma;
    private String descricaoBanco;
    private String descricaoCentro;
    private String descricaoContas;
    private String descricaoFornecedor;
    private String descricaoempresa;
    private String operacao;
    private Date dataEmissao;
    private Date dataVenc;
    private String documento;
    private Float valorDoc;
    private String historico;
    private String usuarioInsert;
    private String usuarioUp;
    private String dataInsert;
    private String dataUp;
    private String horarioInsert;
    private String horarioUp;
    private int idEmpresa;

    public MovimentoCPR() {
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
     * @return the dataEmissao
     */
    public Date getDataEmissao() {
        return dataEmissao;
    }

    /**
     * @param dataEmissao the dataEmissao to set
     */
    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    /**
     * @return the dataVenc
     */
    public Date getDataVenc() {
        return dataVenc;
    }

    /**
     * @param dataVenc the dataVenc to set
     */
    public void setDataVenc(Date dataVenc) {
        this.dataVenc = dataVenc;
    }

    /**
     * @return the documento
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * @return the valorDoc
     */
    public Float getValorDoc() {
        return valorDoc;
    }

    /**
     * @param valorDoc the valorDoc to set
     */
    public void setValorDoc(Float valorDoc) {
        this.valorDoc = valorDoc;
    }

    /**
     * @return the historico
     */
    public String getHistorico() {
        return historico;
    }

    /**
     * @param historico the historico to set
     */
    public void setHistorico(String historico) {
        this.historico = historico;
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

    /**
     * @return the idEmpresa
     */
    public int getIdEmpresa() {
        return idEmpresa;
    }

    /**
     * @param idEmpresa the idEmpresa to set
     */
    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
}
