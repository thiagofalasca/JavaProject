//Aluno: Thiago Falasca Duarte
//Curso: Engenharia de Software IF64D
//Ra: 2350670

import javax.swing.JOptionPane;

public class CadFixa extends javax.swing.JFrame {

    private BDInvest gerInvest;
    private Investimento invest;
    private static CadFixa cadFixaUnico;

    private CadFixa() {
        initComponents();
    }

    public static CadFixa getCadFixa() {
        if (cadFixaUnico == null) {
            cadFixaUnico = new CadFixa();
        }
        return cadFixaUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        lblInstFin = new javax.swing.JLabel();
        cxInstFin = new javax.swing.JTextField();
        lblNomeInvest = new javax.swing.JLabel();
        cxNomeInvest = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        cxValor = new javax.swing.JTextField();
        lblPapel = new javax.swing.JLabel();
        cxPapel = new javax.swing.JTextField();
        lblTpImp = new javax.swing.JLabel();
        lblTaxaAno = new javax.swing.JLabel();
        cxTaxaAno = new javax.swing.JTextField();
        btSair = new javax.swing.JButton();
        btCad = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        cbImposto = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Renda Fixa");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Investimento Renda Fixa");

        lblInstFin.setText("Instituição Financeira ");

        lblNomeInvest.setText("Nome do Investimento");

        lblValor.setText("Valor Aplicado");

        lblPapel.setText("Digite o Papel");

        lblTpImp.setText("Tipo de Imposto");

        lblTaxaAno.setText("Taxa Anual");

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btCad.setText("Cadastrar");
        btCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        cbImposto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Isento", "Regressivo" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCad, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                    .addComponent(lblPapel)
                    .addComponent(lblInstFin)
                    .addComponent(lblNomeInvest)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblTpImp)
                        .addComponent(cbImposto, 0, 140, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cxInstFin, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cxNomeInvest, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblValor)
                                .addComponent(cxValor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTaxaAno)
                                .addComponent(cxTaxaAno, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
                        .addComponent(cxPapel, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNomeInvest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxNomeInvest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                        .addComponent(lblTaxaAno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxTaxaAno, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTpImp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbImposto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCad)
                    .addComponent(btExcluir)
                    .addComponent(btSair))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
        limpar();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadActionPerformed
        cadastrar();
        MenuByteInvest.listarTab();
    }//GEN-LAST:event_btCadActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluir();
        limpar();
        MenuByteInvest.listarTab();
    }//GEN-LAST:event_btExcluirActionPerformed

    public void excluir() {
        gerInvest = MenuByteInvest.getConta().getGerInvest();
        if (!cxNomeInvest.getText().trim().isEmpty()) {
            invest = new Fixa(cxNomeInvest.getText());
            invest = gerInvest.consInvestNome(invest);
            if (invest != null) {
                if (JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o investimento?", "Excluir investimento", JOptionPane.YES_NO_CANCEL_OPTION) == 0) {
                    gerInvest.removeInvestNome(invest);
                    JOptionPane.showMessageDialog(null, "Investimento excluido com sucesso!", "Investimento excluido", 1);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Não existe investimento com este nome!", "Erro na exclusão", 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha o nome do investimento que deseja excluir", "Erro", 0);
        }
        limpar();
    }

    public void cadastrar() {
        try {
            gerInvest = MenuByteInvest.getConta().getGerInvest();
            if (!(cxInstFin.getText().trim().isEmpty() || cxNomeInvest.getText().trim().isEmpty() || cxPapel.getText().trim().isEmpty() || cxValor.getText().trim().isEmpty() || cxTaxaAno.getText().trim().isEmpty())) {
                invest = new Fixa(cxInstFin.getText(), cxNomeInvest.getText(), Float.parseFloat(cxValor.getText()),
                        cxPapel.getText(), String.valueOf(cbImposto.getSelectedItem()), Double.parseDouble(cxTaxaAno.getText()));
                invest = gerInvest.cadInvest(invest);
                if (invest != null) {
                    JOptionPane.showMessageDialog(null, "Investimento cadastrado com sucesso!", "Investimento cadastrado", 1);
                } else {
                    JOptionPane.showMessageDialog(null, "Já existe um investimento com esse nome!", "Erro no cadastro", 0);
                }
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Erro no cadastro", 0);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "O valor aplicado e a taxa anual devem ser numeros reais!", "Erro", 0);
        }
    }

    public void limpar() {
        cxInstFin.setText("");
        cxNomeInvest.setText("");
        cxValor.setText("");
        cxPapel.setText("");
        cxTaxaAno.setText("");
        cbImposto.setSelectedItem("Isento");
        cxNomeInvest.requestFocus();
    }

    public void sair() {
        if (JOptionPane.showConfirmDialog(null, "Deseja sair do cadastro?", "Saida", JOptionPane.YES_NO_CANCEL_OPTION) == 0) {
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
            java.util.logging.Logger.getLogger(CadFixa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadFixa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadFixa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadFixa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadFixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCad;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbImposto;
    private javax.swing.JTextField cxInstFin;
    private javax.swing.JTextField cxNomeInvest;
    private javax.swing.JTextField cxPapel;
    private javax.swing.JTextField cxTaxaAno;
    private javax.swing.JTextField cxValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblInstFin;
    private javax.swing.JLabel lblNomeInvest;
    private javax.swing.JLabel lblPapel;
    private javax.swing.JLabel lblTaxaAno;
    private javax.swing.JLabel lblTpImp;
    private javax.swing.JLabel lblValor;
    // End of variables declaration//GEN-END:variables
}
