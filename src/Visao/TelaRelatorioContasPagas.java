/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Dao.ConexaoBancoDados;
import static Visao.TelaLoginSenhaCPRF.nameUser;
import static Visao.TelaPrincipal.tipoServidor;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ronal
 */
public class TelaRelatorioContasPagas extends javax.swing.JInternalFrame {

    ConexaoBancoDados conecta = new ConexaoBancoDados();

    int count = 0;
    int flag = 0;
    int acao = 0;
    String dataInicial, dataFinal, dataVenc;
    String pOPERACAO_PAGAR_CONSULTA = "Pagar";
    String pOPERACAO_RECEBER_CONSULTA = "Receber";
    String pOPERACAO_CONTAS_PR = "";
    String pCONTA_BAIXADA = "Sim";

    /**
     * Creates new form TelaRelatorioContasPagar
     */
    public TelaRelatorioContasPagas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxContas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jDataPesqInicial = new com.toedter.calendar.JDateChooser();
        jDataPesqFinal = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jBtSair = new javax.swing.JButton();
        jBtPesquisarContaData = new javax.swing.JButton();

        setClosable(true);
        setTitle("...::: Relatório de Contas Recebidas :::...");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("SELECIONE TIPO CONTA");

        jComboBoxContas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxContas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONTAS PAGAS" }));
        jComboBoxContas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("DATA INICIAL");

        jDataPesqInicial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jDataPesqFinal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("DATA FINAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jDataPesqInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDataPesqFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(jComboBoxContas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jDataPesqInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDataPesqFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxContas, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBtSair.setForeground(new java.awt.Color(204, 0, 0));
        jBtSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/shutdown-icone-6920-16.png"))); // NOI18N
        jBtSair.setText("Sair");
        jBtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtSairActionPerformed(evt);
            }
        });

        jBtPesquisarContaData.setForeground(new java.awt.Color(0, 102, 0));
        jBtPesquisarContaData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/accept_1.png"))); // NOI18N
        jBtPesquisarContaData.setText("Confirmar");
        jBtPesquisarContaData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtPesquisarContaDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jBtPesquisarContaData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBtPesquisarContaData, jBtSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtSair)
                    .addComponent(jBtPesquisarContaData))
                .addGap(3, 3, 3))
        );

        setBounds(360, 60, 428, 182);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtPesquisarContaDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtPesquisarContaDataActionPerformed
        // TODO add your handling code here:
        flag = 1;
        if (tipoServidor == null || tipoServidor.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "É necessário definir o parâmtero para o sistema operacional utilizado no servidor, (UBUNTU-LINUX ou WINDOWS SERVER).");
        } else if (tipoServidor.equals("Servidor Linux (Ubuntu)/MS-SQL Server")) {
            if (jComboBoxContas.getSelectedItem().equals("CONTAS RECEBIDAS")) {
                if (jDataPesqInicial.getDate() == null) {
                    JOptionPane.showMessageDialog(rootPane, "Informe a data inicial para pesquisa.");
                    jDataPesqInicial.requestFocus();
                } else if (jDataPesqFinal.getDate() == null) {
                    JOptionPane.showMessageDialog(rootPane, "Informe a data final para pesquisa.");
                    jDataPesqFinal.requestFocus();
                } else if (jDataPesqInicial.getDate().after(jDataPesqFinal.getDate())) {
                    JOptionPane.showMessageDialog(rootPane, "Data Inicial não pode ser maior que data final");
                } else {
                    SimpleDateFormat formatoAmerica = new SimpleDateFormat("yyyy/MM/dd");
                    dataInicial = formatoAmerica.format(jDataPesqInicial.getDate().getTime());
                    dataFinal = formatoAmerica.format(jDataPesqFinal.getDate().getTime());
                    try {
                        conecta.abrirConexao();
                        String path = "reports/RelatorioContasRecebidas.jasper";
                        conecta.executaSQL("SELECT * FROM MOVIMENTO_CONTAS_PAGAR_RECEBER "
                                + "INNER JOIN CLIENTES "
                                + "ON MOVIMENTO_CONTAS_PAGAR_RECEBER.IdForn=CLIENTES.IdClie "
                                + "INNER JOIN BANCOS_CONTAS "
                                + "ON MOVIMENTO_CONTAS_PAGAR_RECEBER.IdBanco=BANCOS_CONTAS.IdBanco "
                                + "INNER JOIN CENTRO_CUSTO "
                                + "ON MOVIMENTO_CONTAS_PAGAR_RECEBER.IdCentro=CENTRO_CUSTO.IdCentro "
                                + "INNER JOIN TIPO_CONTA "
                                + "ON MOVIMENTO_CONTAS_PAGAR_RECEBER.IdConta=TIPO_CONTA.IdConta "
                                + "INNER JOIN TIPO_PAGAMENTO "
                                + "ON MOVIMENTO_CONTAS_PAGAR_RECEBER.IdForma=TIPO_PAGAMENTO.IdForma "
                                + "WHERE MOVIMENTO_CONTAS_PAGAR_RECEBER.DataEmissao BETWEEN'" + dataInicial + "' "
                                + "AND '" + dataFinal + "' "
                                + "AND MOVIMENTO_CONTAS_PAGAR_RECEBER.ContaBaixada='" + pCONTA_BAIXADA + "' "
                                + "AND Operacao='" + pOPERACAO_RECEBER_CONSULTA + "'");
                        HashMap parametros = new HashMap();
                        parametros.put("pDATA_INICIAL", dataInicial);
                        parametros.put("pDATA_FINAL", dataFinal);
                        parametros.put("pTIPO_CONTA", pOPERACAO_RECEBER_CONSULTA);
                        parametros.put("pCONTA_BAIXADA", pCONTA_BAIXADA);
                        parametros.put("pUSUARIO", nameUser);
                        JRResultSetDataSource relatResul = new JRResultSetDataSource(conecta.rs); // Passa o resulSet Preenchido para o relatorio                                   
                        JasperPrint jpPrint = JasperFillManager.fillReport(path, parametros, relatResul); // indica o caminmhodo relatório
                        JasperViewer jv = new JasperViewer(jpPrint, false); // Cria instancia para impressao          
                        jv.setExtendedState(JasperViewer.MAXIMIZED_BOTH); // Maximizar o relatório
                        jv.setTitle("Relatório de Contas Recebidas");
                        jv.setVisible(true); // Chama o relatorio para ser visualizado                                    
                        jv.toFront(); // Traz o relatorio para frente da aplicação    
                        conecta.desconecta();
                    } catch (JRException e) {
                        JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o Relatório \n\nERRO :" + e);
                    }
                }
            } else if (jComboBoxContas.getSelectedItem().equals("CONTAS PAGAS")) {
                if (jDataPesqInicial.getDate() == null) {
                    JOptionPane.showMessageDialog(rootPane, "Informe a data inicial para pesquisa.");
                    jDataPesqInicial.requestFocus();
                } else if (jDataPesqFinal.getDate() == null) {
                    JOptionPane.showMessageDialog(rootPane, "Informe a data final para pesquisa.");
                    jDataPesqFinal.requestFocus();
                } else if (jDataPesqInicial.getDate().after(jDataPesqFinal.getDate())) {
                    JOptionPane.showMessageDialog(rootPane, "Data Inicial não pode ser maior que data final");
                } else {
                    SimpleDateFormat formatoAmerica = new SimpleDateFormat("yyyy/MM/dd");
                    dataInicial = formatoAmerica.format(jDataPesqInicial.getDate().getTime());
                    dataFinal = formatoAmerica.format(jDataPesqFinal.getDate().getTime());
                    try {
                        conecta.abrirConexao();
                        String path = "reports/RelatorioContasPagas.jasper";
                        conecta.executaSQL("SELECT * FROM MOVIMENTO_CONTAS_PAGAR_RECEBER "
                                + "INNER JOIN FORNECEDORES_AC "
                                + "ON MOVIMENTO_CONTAS_PAGAR_RECEBER.IdForn=FORNECEDORES_AC.IdForn "
                                + "INNER JOIN BANCOS_CONTAS "
                                + "ON MOVIMENTO_CONTAS_PAGAR_RECEBER.IdBanco=BANCOS_CONTAS.IdBanco "
                                + "INNER JOIN CENTRO_CUSTO "
                                + "ON MOVIMENTO_CONTAS_PAGAR_RECEBER.IdCentro=CENTRO_CUSTO.IdCentro "
                                + "INNER JOIN TIPO_CONTA "
                                + "ON MOVIMENTO_CONTAS_PAGAR_RECEBER.IdConta=TIPO_CONTA.IdConta "
                                + "INNER JOIN TIPO_PAGAMENTO "
                                + "ON MOVIMENTO_CONTAS_PAGAR_RECEBER.IdForma=TIPO_PAGAMENTO.IdForma "
                                + "WHERE MOVIMENTO_CONTAS_PAGAR_RECEBER.DataEmissao BETWEEN'" + dataInicial + "' "
                                + "AND '" + dataFinal + "' "
                                + "AND MOVIMENTO_CONTAS_PAGAR_RECEBER.ContaBaixada='" + pCONTA_BAIXADA + "' "
                                + "AND Operacao='" + pOPERACAO_PAGAR_CONSULTA + "'");
                        HashMap parametros = new HashMap();
                        parametros.put("pDATA_INICIAL", dataInicial);
                        parametros.put("pDATA_FINAL", dataFinal);
                        parametros.put("pTIPO_CONTA", pOPERACAO_RECEBER_CONSULTA);
                        parametros.put("pCONTA_BAIXADA", pCONTA_BAIXADA);
                        parametros.put("pUSUARIO", nameUser);
                        JRResultSetDataSource relatResul = new JRResultSetDataSource(conecta.rs); // Passa o resulSet Preenchido para o relatorio                                   
                        JasperPrint jpPrint = JasperFillManager.fillReport(path, parametros, relatResul); // indica o caminmhodo relatório
                        JasperViewer jv = new JasperViewer(jpPrint, false); // Cria instancia para impressao          
                        jv.setExtendedState(JasperViewer.MAXIMIZED_BOTH); // Maximizar o relatório
                        jv.setTitle("Relatório de Contas Recebidas");
                        jv.setVisible(true); // Chama o relatorio para ser visualizado                                    
                        jv.toFront(); // Traz o relatorio para frente da aplicação    
                        conecta.desconecta();
                    } catch (JRException e) {
                        JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o Relatório \n\nERRO :" + e);
                    }
                }
            }
        } else if (tipoServidor.equals("Servidor Windows/MS-SQL Server")) {
            if (jComboBoxContas.getSelectedItem().equals("CONTAS RECEBIDAS")) {
                if (jDataPesqInicial.getDate() == null) {
                    JOptionPane.showMessageDialog(rootPane, "Informe a data inicial para pesquisa.");
                    jDataPesqInicial.requestFocus();
                } else if (jDataPesqFinal.getDate() == null) {
                    JOptionPane.showMessageDialog(rootPane, "Informe a data final para pesquisa.");
                    jDataPesqFinal.requestFocus();
                } else if (jDataPesqInicial.getDate().after(jDataPesqFinal.getDate())) {
                    JOptionPane.showMessageDialog(rootPane, "Data Inicial não pode ser maior que data final");
                } else {
                    SimpleDateFormat formatoAmerica = new SimpleDateFormat("dd/MM/yyyy");
                    dataInicial = formatoAmerica.format(jDataPesqInicial.getDate().getTime());
                    dataFinal = formatoAmerica.format(jDataPesqFinal.getDate().getTime());
                    try {
                        conecta.abrirConexao();
                        String path = "reports/RelatorioContasRecebidas.jasper";
                        conecta.executaSQL("SELECT * FROM MOVIMENTO_CONTAS_PAGAR_RECEBER "
                                + "INNER JOIN CLIENTES "
                                + "ON MOVIMENTO_CONTAS_PAGAR_RECEBER.IdForn=CLIENTES.IdClie "
                                + "INNER JOIN BANCOS_CONTAS "
                                + "ON MOVIMENTO_CONTAS_PAGAR_RECEBER.IdBanco=BANCOS_CONTAS.IdBanco "
                                + "INNER JOIN CENTRO_CUSTO "
                                + "ON MOVIMENTO_CONTAS_PAGAR_RECEBER.IdCentro=CENTRO_CUSTO.IdCentro "
                                + "INNER JOIN TIPO_CONTA "
                                + "ON MOVIMENTO_CONTAS_PAGAR_RECEBER.IdConta=TIPO_CONTA.IdConta "
                                + "INNER JOIN TIPO_PAGAMENTO "
                                + "ON MOVIMENTO_CONTAS_PAGAR_RECEBER.IdForma=TIPO_PAGAMENTO.IdForma "
                                + "WHERE MOVIMENTO_CONTAS_PAGAR_RECEBER.DataEmissao BETWEEN'" + dataInicial + "' "
                                + "AND '" + dataFinal + "' "
                                + "AND MOVIMENTO_CONTAS_PAGAR_RECEBER.ContaBaixada='" + pCONTA_BAIXADA + "' "
                                + "AND Operacao='" + pOPERACAO_RECEBER_CONSULTA + "'");
                        HashMap parametros = new HashMap();
                        parametros.put("pDATA_INICIAL", dataInicial);
                        parametros.put("pDATA_FINAL", dataFinal);
                        parametros.put("pTIPO_CONTA", pOPERACAO_RECEBER_CONSULTA);
                        parametros.put("pCONTA_BAIXADA", pCONTA_BAIXADA);
                        parametros.put("pUSUARIO", nameUser);
                        JRResultSetDataSource relatResul = new JRResultSetDataSource(conecta.rs); // Passa o resulSet Preenchido para o relatorio                                   
                        JasperPrint jpPrint = JasperFillManager.fillReport(path, parametros, relatResul); // indica o caminmhodo relatório
                        JasperViewer jv = new JasperViewer(jpPrint, false); // Cria instancia para impressao          
                        jv.setExtendedState(JasperViewer.MAXIMIZED_BOTH); // Maximizar o relatório
                        jv.setTitle("Relatório de Contas Recebidas");
                        jv.setVisible(true); // Chama o relatorio para ser visualizado                                    
                        jv.toFront(); // Traz o relatorio para frente da aplicação    
                        conecta.desconecta();
                    } catch (JRException e) {
                        JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o Relatório \n\nERRO :" + e);
                    }
                }
            } else if (jComboBoxContas.getSelectedItem().equals("CONTAS PAGAS")) {
                if (jDataPesqInicial.getDate() == null) {
                    JOptionPane.showMessageDialog(rootPane, "Informe a data inicial para pesquisa.");
                    jDataPesqInicial.requestFocus();
                } else if (jDataPesqFinal.getDate() == null) {
                    JOptionPane.showMessageDialog(rootPane, "Informe a data final para pesquisa.");
                    jDataPesqFinal.requestFocus();
                } else if (jDataPesqInicial.getDate().after(jDataPesqFinal.getDate())) {
                    JOptionPane.showMessageDialog(rootPane, "Data Inicial não pode ser maior que data final");
                } else {
                    SimpleDateFormat formatoAmerica = new SimpleDateFormat("dd/MM/yyyy");
                    dataInicial = formatoAmerica.format(jDataPesqInicial.getDate().getTime());
                    dataFinal = formatoAmerica.format(jDataPesqFinal.getDate().getTime());
                    try {
                        conecta.abrirConexao();
                        String path = "reports/RelatorioContasPagas.jasper";
                        conecta.executaSQL("SELECT * FROM MOVIMENTO_CONTAS_PAGAR_RECEBER "
                                + "INNER JOIN FORNECEDORES_AC "
                                + "ON MOVIMENTO_CONTAS_PAGAR_RECEBER.IdForn=FORNECEDORES_AC.IdForn "
                                + "INNER JOIN BANCOS_CONTAS "
                                + "ON MOVIMENTO_CONTAS_PAGAR_RECEBER.IdBanco=BANCOS_CONTAS.IdBanco "
                                + "INNER JOIN CENTRO_CUSTO "
                                + "ON MOVIMENTO_CONTAS_PAGAR_RECEBER.IdCentro=CENTRO_CUSTO.IdCentro "
                                + "INNER JOIN TIPO_CONTA "
                                + "ON MOVIMENTO_CONTAS_PAGAR_RECEBER.IdConta=TIPO_CONTA.IdConta "
                                + "INNER JOIN TIPO_PAGAMENTO "
                                + "ON MOVIMENTO_CONTAS_PAGAR_RECEBER.IdForma=TIPO_PAGAMENTO.IdForma "
                                + "WHERE MOVIMENTO_CONTAS_PAGAR_RECEBER.DataEmissao BETWEEN'" + dataInicial + "' "
                                + "AND '" + dataFinal + "' "
                                + "AND MOVIMENTO_CONTAS_PAGAR_RECEBER.ContaBaixada='" + pCONTA_BAIXADA + "' "
                                + "AND Operacao='" + pOPERACAO_PAGAR_CONSULTA + "'");
                        HashMap parametros = new HashMap();
                        parametros.put("pDATA_INICIAL", dataInicial);
                        parametros.put("pDATA_FINAL", dataFinal);
                        parametros.put("pTIPO_CONTA", pOPERACAO_RECEBER_CONSULTA);
                        parametros.put("pCONTA_BAIXADA", pCONTA_BAIXADA);
                        parametros.put("pUSUARIO", nameUser);
                        JRResultSetDataSource relatResul = new JRResultSetDataSource(conecta.rs); // Passa o resulSet Preenchido para o relatorio                                   
                        JasperPrint jpPrint = JasperFillManager.fillReport(path, parametros, relatResul); // indica o caminmhodo relatório
                        JasperViewer jv = new JasperViewer(jpPrint, false); // Cria instancia para impressao          
                        jv.setExtendedState(JasperViewer.MAXIMIZED_BOTH); // Maximizar o relatório
                        jv.setTitle("Relatório de Contas Recebidas");
                        jv.setVisible(true); // Chama o relatorio para ser visualizado                                    
                        jv.toFront(); // Traz o relatorio para frente da aplicação    
                        conecta.desconecta();
                    } catch (JRException e) {
                        JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o Relatório \n\nERRO :" + e);
                    }
                }
            }
        }
    }//GEN-LAST:event_jBtPesquisarContaDataActionPerformed

    private void jBtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBtSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtPesquisarContaData;
    private javax.swing.JButton jBtSair;
    public static javax.swing.JComboBox<String> jComboBoxContas;
    private com.toedter.calendar.JDateChooser jDataPesqFinal;
    private com.toedter.calendar.JDateChooser jDataPesqInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
