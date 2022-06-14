//Aluno: Thiago Falasca Duarte
//Curso: Engenharia de Software IF64D
//Ra: 2350670

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ConsultaFixa extends javax.swing.JFrame {

    private Investimento invest;
    private List<String> dados = new ArrayList<>();
    private static ConsultaFixa consFixaUnico;

    private ConsultaFixa() {
        initComponents();
    }

    public static ConsultaFixa getConsFixa() {
        if (consFixaUnico == null) {
            consFixaUnico = new ConsultaFixa();
        }
        return consFixaUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblConsulta = new javax.swing.JLabel();
        lblInstFin = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblPapel = new javax.swing.JLabel();
        cxInstFin = new javax.swing.JTextField();
        cxNome = new javax.swing.JTextField();
        cxPapel = new javax.swing.JTextField();
        lblImposto = new javax.swing.JLabel();
        cxImposto = new javax.swing.JTextField();
        lblTaxaAnual = new javax.swing.JLabel();
        cxTaxaAno = new javax.swing.JTextField();
        lblValorAplicado = new javax.swing.JLabel();
        cxValorAplicado = new javax.swing.JTextField();
        lblValorFinal = new javax.swing.JLabel();
        cxValorFinal = new javax.swing.JTextField();
        lblValorReal = new javax.swing.JLabel();
        cxValorReal = new javax.swing.JTextField();
        lblTaxaReal = new javax.swing.JLabel();
        cxTaxaReal = new javax.swing.JTextField();
        btConsulta = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta Renda Fixa");

        lblConsulta.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblConsulta.setText("Dados do Investimento");

        lblInstFin.setText("Instituição Financeira");

        lblNome.setText("Nome do Investimento");

        lblPapel.setText("Papel");

        lblImposto.setText("Imposto");

        lblTaxaAnual.setText("Taxa Anual");

        lblValorAplicado.setText("Valor Aplicado");

        lblValorFinal.setText("Valor Final");

        lblValorReal.setText("Valor final real");

        lblTaxaReal.setText("Rentabilidade Real");

        btConsulta.setText("Consultar");
        btConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaActionPerformed(evt);
            }
        });

        lblInfo.setText("*Preencha o nome para realizar a consulta");

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
                        .addGap(85, 85, 85)
                        .addComponent(lblConsulta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblImposto, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cxImposto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                        .addComponent(lblTaxaAnual, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cxTaxaAno, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cxValorFinal, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(lblValorFinal))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblValorReal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cxValorAplicado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                            .addComponent(lblValorAplicado, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTaxaReal, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cxValorReal, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cxTaxaReal, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxInstFin, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblInstFin)
                                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNome)
                                    .addComponent(lblPapel)
                                    .addComponent(cxPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lblInfo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblConsulta)
                .addGap(23, 23, 23)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblInstFin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxInstFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPapel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxPapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblImposto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxImposto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblValorAplicado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxValorAplicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTaxaAnual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxTaxaAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTaxaReal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxTaxaReal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblValorFinal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblValorReal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxValorReal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(lblInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConsulta)
                    .addComponent(btSair))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaActionPerformed
        consultar();
    }//GEN-LAST:event_btConsultaActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
        limpar();
    }//GEN-LAST:event_btSairActionPerformed

    public void limpar() {
        cxInstFin.setText("");
        cxNome.setText("");
        cxPapel.setText("");
        cxImposto.setText("");
        cxTaxaAno.setText("");
        cxValorFinal.setText("");
        cxTaxaReal.setText("");
        cxValorReal.setText("");
        cxValorAplicado.setText("");
        cxNome.requestFocus();
    }

    public void sair() {
        if (JOptionPane.showConfirmDialog(null, "Deseja sair da consulta?", "Saida", JOptionPane.YES_NO_CANCEL_OPTION) == 0) {
            this.dispose();
        }
    }

    public void consultar() {
        try {
            if (!cxNome.getText().trim().isEmpty()) {
                invest = new Fixa(cxNome.getText());
                invest = MenuByteInvest.getConta().getGerInvest().consInvestNome(invest);
                if (invest != null) {
                    dados = invest.consultarInvest();
                    cxInstFin.setText(invest.getInstituicao());
                    cxNome.setText(invest.getNome());
                    cxPapel.setText(dados.get(0));
                    cxImposto.setText(dados.get(1));
                    cxTaxaAno.setText(dados.get(2) + "%");
                    cxValorFinal.setText(dados.get(3));
                    cxTaxaReal.setText(dados.get(5) + "%");
                    cxValorReal.setText(dados.get(4));
                    cxValorAplicado.setText(Float.toString(invest.getValorAplicado()));
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
            java.util.logging.Logger.getLogger(ConsultaFixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaFixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaFixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaFixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaFixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsulta;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxImposto;
    private javax.swing.JTextField cxInstFin;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxPapel;
    private javax.swing.JTextField cxTaxaAno;
    private javax.swing.JTextField cxTaxaReal;
    private javax.swing.JTextField cxValorAplicado;
    private javax.swing.JTextField cxValorFinal;
    private javax.swing.JTextField cxValorReal;
    private javax.swing.JLabel lblConsulta;
    private javax.swing.JLabel lblImposto;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblInstFin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPapel;
    private javax.swing.JLabel lblTaxaAnual;
    private javax.swing.JLabel lblTaxaReal;
    private javax.swing.JLabel lblValorAplicado;
    private javax.swing.JLabel lblValorFinal;
    private javax.swing.JLabel lblValorReal;
    // End of variables declaration//GEN-END:variables
}
