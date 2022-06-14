//Aluno: Thiago Falasca Duarte
//Curso: Engenharia de Software IF64D
//Ra: 2350670

import javax.swing.JOptionPane;

public class CadCorrente extends javax.swing.JFrame {

    private BDInvest gerInvest;
    private Investimento invest;
    private ContaCorrente investCorrente;
    private static CadCorrente cadCorrenteUnico;

    private CadCorrente() {
        initComponents();
    }

    public static CadCorrente getCadCorrente() {
        if (cadCorrenteUnico == null) {
            cadCorrenteUnico = new CadCorrente();
        }
        return cadCorrenteUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCC = new javax.swing.JLabel();
        lblNomeInvest = new javax.swing.JLabel();
        cxNomeInvest = new javax.swing.JTextField();
        lblInstFin = new javax.swing.JLabel();
        cxInstFin = new javax.swing.JTextField();
        lblNomeBanco = new javax.swing.JLabel();
        cxNomeBanco = new javax.swing.JTextField();
        lblRent = new javax.swing.JLabel();
        lblValorAplicado = new javax.swing.JLabel();
        cxValorAplicado = new javax.swing.JTextField();
        cbRent = new javax.swing.JComboBox<>();
        btCadastrar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Conta Corrente");

        lblCC.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCC.setText("Conta Corrente");

        lblNomeInvest.setText("Nome do Investimento");

        lblInstFin.setText("Instituição Financeira");

        lblNomeBanco.setText("Nome do Banco");

        lblRent.setText("É Rentável?");

        lblValorAplicado.setText("Valor Aplicado");

        cbRent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
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
                        .addGap(112, 112, 112)
                        .addComponent(lblCC))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cxInstFin)
                            .addComponent(cxNomeBanco)
                            .addComponent(lblNomeInvest)
                            .addComponent(lblInstFin)
                            .addComponent(lblNomeBanco)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblValorAplicado)
                                    .addComponent(cxValorAplicado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblRent)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE))
                                    .addComponent(cbRent, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cxNomeInvest))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblCC)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cxNomeBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblValorAplicado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxValorAplicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbRent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRent)
                        .addGap(28, 28, 28)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btExcluir)
                    .addComponent(btSair))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
        limpar();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadastrar();
        MenuByteInvest.listarTab();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluir();
        limpar();
        MenuByteInvest.listarTab();
    }//GEN-LAST:event_btExcluirActionPerformed

    public void excluir() {
        gerInvest = MenuByteInvest.getConta().getGerInvest();
        if (!cxNomeInvest.getText().trim().equals("")) {
            invest = new ContaCorrente(cxNomeInvest.getText());
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
            int CDI = 0;
            if (!(cxInstFin.getText().trim().equals("") || cxNomeInvest.getText().trim().equals("") || cxNomeBanco.getText().trim().equals("") || cxValorAplicado.getText().trim().equals(""))) {
                if (String.valueOf(cbRent.getSelectedItem()).equals("Sim")) {
                    CDI = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a procentagem do CDI que a conta rende!", "Porcentagem CDI", JOptionPane.QUESTION_MESSAGE));
                }
                invest = new ContaCorrente(cxInstFin.getText(), cxNomeInvest.getText(), Float.parseFloat(cxValorAplicado.getText()),
                        cxNomeBanco.getText(), String.valueOf(cbRent.getSelectedItem()));
                investCorrente = (ContaCorrente) invest;
                investCorrente.setPorcentCDI(CDI);
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
            JOptionPane.showMessageDialog(null, "A procentagem do CDI deve ser um numero inteiro positivo", "Porcentagem inválida", 0);
        } catch (CDIInvalidoException ex) {
            ex.reparaCDI(investCorrente);
        }
    }

    public void sair() {
        if (JOptionPane.showConfirmDialog(null, "Deseja sair do cadastro?", "Saida", JOptionPane.YES_NO_CANCEL_OPTION) == 0) {
            this.dispose();
        }
    }

    public void limpar() {
        cxNomeInvest.setText("");
        cxInstFin.setText("");
        cxNomeBanco.setText("");
        cxValorAplicado.setText("");
        cbRent.setSelectedItem("Sim");
        cxNomeInvest.requestFocus();
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
            java.util.logging.Logger.getLogger(CadCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadCorrente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox<String> cbRent;
    private javax.swing.JTextField cxInstFin;
    private javax.swing.JTextField cxNomeBanco;
    private javax.swing.JTextField cxNomeInvest;
    private javax.swing.JTextField cxValorAplicado;
    private javax.swing.JLabel lblCC;
    private javax.swing.JLabel lblInstFin;
    private javax.swing.JLabel lblNomeBanco;
    private javax.swing.JLabel lblNomeInvest;
    private javax.swing.JLabel lblRent;
    private javax.swing.JLabel lblValorAplicado;
    // End of variables declaration//GEN-END:variables
}
