//Aluno: Thiago Falasca Duarte
//Curso: Engenharia de Software IF64D
//Ra: 2350670

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ConsultaCorrente extends javax.swing.JFrame {

    private Investimento invest;
    private List<String> dados = new ArrayList<>();
    private static ConsultaCorrente consCorrenteUnico;

    private ConsultaCorrente() {
        initComponents();
    }

    public static ConsultaCorrente getConsCorrente() {
        if (consCorrenteUnico == null) {
            consCorrenteUnico = new ConsultaCorrente();
        }
        return consCorrenteUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblConsulta = new javax.swing.JLabel();
        lblNomeInvest = new javax.swing.JLabel();
        cxNomeInvest = new javax.swing.JTextField();
        lblInstFin = new javax.swing.JLabel();
        cxInstFin = new javax.swing.JTextField();
        lblNomeBanco = new javax.swing.JLabel();
        cxNomeBanco = new javax.swing.JTextField();
        lblValorAplicado = new javax.swing.JLabel();
        cxValorAplicado = new javax.swing.JTextField();
        lblValorFinal = new javax.swing.JLabel();
        cxValorFinal = new javax.swing.JTextField();
        lblRent = new javax.swing.JLabel();
        cxRent = new javax.swing.JTextField();
        lblInfo = new javax.swing.JLabel();
        btConsultar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta Conta Corrente");

        lblConsulta.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblConsulta.setText("Dados do Investimento");

        lblNomeInvest.setText("Nome do Investimento");

        lblInstFin.setText("Instituição Financeira");

        lblNomeBanco.setText("Nome do Banco");

        lblValorAplicado.setText("Valor Aplicado");

        lblValorFinal.setText("Valor Final");

        lblRent.setText("Rentabilidade");

        lblInfo.setText("*Preencha o nome para realizar a consulta");

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeBanco)
                            .addComponent(lblNomeInvest)
                            .addComponent(lblInstFin)
                            .addComponent(lblValorFinal)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cxNomeBanco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                                .addComponent(cxInstFin, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cxNomeInvest, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cxValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cxValorAplicado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblValorAplicado)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxRent, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRent)
                                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblInfo)
                                .addGap(45, 45, 45))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(lblConsulta)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblConsulta)
                .addGap(18, 18, 18)
                .addComponent(lblNomeInvest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxNomeInvest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInstFin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxInstFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNomeBanco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxNomeBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorAplicado)
                    .addComponent(lblRent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxValorAplicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxRent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblValorFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btConsultar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
        limpar();
    }//GEN-LAST:event_btSairActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_btConsultarActionPerformed

    public void consultar() {
        try {
            if (!cxNomeInvest.getText().trim().equals("")) {
                invest = new ContaCorrente(cxNomeInvest.getText());
                invest = MenuByteInvest.getConta().getGerInvest().consInvestNome(invest);
                if (invest != null) {
                    dados = invest.consultarInvest();
                    cxNomeInvest.setText(invest.getNome());
                    cxInstFin.setText(invest.getInstituicao());
                    cxValorAplicado.setText(Float.toString(invest.getValorAplicado()));
                    cxNomeBanco.setText(dados.get(0));
                    cxRent.setText(dados.get(1) + "%");
                    cxValorFinal.setText(dados.get(2));
                    dados.clear();
                    JOptionPane.showMessageDialog(null, "Consulta finalizada!", "Consulta", 1);
                } else {
                    JOptionPane.showMessageDialog(null, "Não existe investimento com esse nome", "Nome inexistente", 0);
                    limpar();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Preencha o nome do investimento que deseja consultar", "Erro", 0);
                limpar();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "O tempo deve ser um numero inteiro!", "Erro", 0);
        }
    }

    public void limpar() {
        cxInstFin.setText("");
        cxNomeInvest.setText("");
        cxNomeBanco.setText("");
        cxValorFinal.setText("");
        cxRent.setText("");
        cxValorAplicado.setText("");
        cxNomeInvest.requestFocus();
    }

    public void sair() {
        if (JOptionPane.showConfirmDialog(null, "Deseja sair da consulta?", "Saida", JOptionPane.YES_NO_CANCEL_OPTION) == 0) {
            this.dispose();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaCorrente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxInstFin;
    private javax.swing.JTextField cxNomeBanco;
    private javax.swing.JTextField cxNomeInvest;
    private javax.swing.JTextField cxRent;
    private javax.swing.JTextField cxValorAplicado;
    private javax.swing.JTextField cxValorFinal;
    private javax.swing.JLabel lblConsulta;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblInstFin;
    private javax.swing.JLabel lblNomeBanco;
    private javax.swing.JLabel lblNomeInvest;
    private javax.swing.JLabel lblRent;
    private javax.swing.JLabel lblValorAplicado;
    private javax.swing.JLabel lblValorFinal;
    // End of variables declaration//GEN-END:variables
}
