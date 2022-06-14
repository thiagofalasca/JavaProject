//Aluno: Thiago Falasca Duarte
//Curso: Engenharia de Software IF64D
//Ra: 2350670

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ConsultaVar extends javax.swing.JFrame {

    private Investimento invest;
    private List<String> dados = new ArrayList<>();
    private static ConsultaVar consVarUnico;

    private ConsultaVar() {
        initComponents();
    }

    public static ConsultaVar getConsVar() {
        if (consVarUnico == null) {
            consVarUnico = new ConsultaVar();
        }
        return consVarUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVariavel = new javax.swing.JLabel();
        lblNomeInvest = new javax.swing.JLabel();
        cxNomeInvest = new javax.swing.JTextField();
        lblInstFin = new javax.swing.JLabel();
        cxInstFin = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        cxCodigo = new javax.swing.JTextField();
        lblQuant = new javax.swing.JLabel();
        cxQuant = new javax.swing.JTextField();
        lblCotacao = new javax.swing.JLabel();
        cxCotacao = new javax.swing.JTextField();
        lblValorAplicado = new javax.swing.JLabel();
        cxValorAplicado = new javax.swing.JTextField();
        lblRent = new javax.swing.JLabel();
        cxRent = new javax.swing.JTextField();
        lblValorFinal = new javax.swing.JLabel();
        cxValorFinal = new javax.swing.JTextField();
        lblRentReal = new javax.swing.JLabel();
        cxRentReal = new javax.swing.JTextField();
        lblValorReal = new javax.swing.JLabel();
        cxValorReal = new javax.swing.JTextField();
        btConsultar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta Renda Variável");

        lblVariavel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblVariavel.setText("Dados do Investimento");

        lblNomeInvest.setText("Nome do Investimento");

        lblInstFin.setText("Instituição Financeira");

        lblCodigo.setText("Código do Ativo");

        lblQuant.setText("Quantidade");

        lblCotacao.setText("Cotação da Compra");

        lblValorAplicado.setText("Valor Aplicado");

        lblRent.setText("Rentabilidade");

        lblValorFinal.setText("Valor Final");

        lblRentReal.setText("Rentabilidade Real");

        lblValorReal.setText("Valor Final Real");

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

        jLabel12.setText("*Preencha o nome para realizar a consulta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cxNomeInvest)
                            .addComponent(cxInstFin)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblCodigo)
                                        .addComponent(lblCotacao)
                                        .addComponent(cxCotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblRent)
                                        .addComponent(cxRent, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblValorFinal)
                                        .addComponent(cxValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btConsultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblQuant)
                                        .addComponent(lblValorAplicado)
                                        .addComponent(cxValorAplicado, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                        .addComponent(lblRentReal)
                                        .addComponent(cxRentReal)
                                        .addComponent(lblValorReal)
                                        .addComponent(cxValorReal)
                                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cxQuant)))
                                .addComponent(lblNomeInvest)
                                .addComponent(lblInstFin)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addComponent(jLabel12)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(lblVariavel)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblVariavel)
                .addGap(18, 18, 18)
                .addComponent(lblNomeInvest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxNomeInvest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInstFin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxInstFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(lblQuant))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCotacao)
                    .addComponent(lblValorAplicado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxCotacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxValorAplicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRent)
                    .addComponent(lblRentReal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxRent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxRentReal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorFinal)
                    .addComponent(lblValorReal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxValorReal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConsultar)
                    .addComponent(btSair))
                .addContainerGap(32, Short.MAX_VALUE))
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
                invest = new Variavel(cxNomeInvest.getText());
                invest = MenuByteInvest.getConta().getGerInvest().consInvestNome(invest);
                if (invest != null) {
                    dados = invest.consultarInvest();
                    cxNomeInvest.setText(invest.getNome());
                    cxInstFin.setText(invest.getInstituicao());
                    cxValorAplicado.setText(Float.toString(invest.getValorAplicado()));
                    cxCodigo.setText(dados.get(0));
                    cxQuant.setText(dados.get(1));
                    cxCotacao.setText(dados.get(2));
                    cxRent.setText(dados.get(3) + "%");
                    cxValorFinal.setText(dados.get(4));
                    cxRentReal.setText(dados.get(5) + "%");
                    cxValorReal.setText(dados.get(6));
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
        cxNomeInvest.setText("");
        cxInstFin.setText("");
        cxCotacao.setText("");
        cxQuant.setText("");
        cxCodigo.setText("");
        cxValorAplicado.setText("");
        cxRent.setText("");
        cxRentReal.setText("");
        cxValorFinal.setText("");
        cxValorReal.setText("");
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
            java.util.logging.Logger.getLogger(ConsultaVar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaVar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaVar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaVar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaVar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxCodigo;
    private javax.swing.JTextField cxCotacao;
    private javax.swing.JTextField cxInstFin;
    private javax.swing.JTextField cxNomeInvest;
    private javax.swing.JTextField cxQuant;
    private javax.swing.JTextField cxRent;
    private javax.swing.JTextField cxRentReal;
    private javax.swing.JTextField cxValorAplicado;
    private javax.swing.JTextField cxValorFinal;
    private javax.swing.JTextField cxValorReal;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCotacao;
    private javax.swing.JLabel lblInstFin;
    private javax.swing.JLabel lblNomeInvest;
    private javax.swing.JLabel lblQuant;
    private javax.swing.JLabel lblRent;
    private javax.swing.JLabel lblRentReal;
    private javax.swing.JLabel lblValorAplicado;
    private javax.swing.JLabel lblValorFinal;
    private javax.swing.JLabel lblValorReal;
    private javax.swing.JLabel lblVariavel;
    // End of variables declaration//GEN-END:variables
}
