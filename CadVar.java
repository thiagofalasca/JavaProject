//Aluno: Thiago Falasca Duarte
//Curso: Engenharia de Software IF64D
//Ra: 2350670

import javax.swing.JOptionPane;

public class CadVar extends javax.swing.JFrame {

    private BDInvest gerInvest;
    private Investimento invest;
    private static CadVar cadVarUnico;

    private CadVar() {
        initComponents();
    }

    public static CadVar getCadVar() {
        if (cadVarUnico == null) {
            cadVarUnico = new CadVar();
        }
        return cadVarUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVariavel = new javax.swing.JLabel();
        lblNomeInvest = new javax.swing.JLabel();
        cxNomeInvest = new javax.swing.JTextField();
        lblInstFin = new javax.swing.JLabel();
        cxInstFin = new javax.swing.JTextField();
        cxCodigo = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        lblCotacao = new javax.swing.JLabel();
        cxCotacao = new javax.swing.JTextField();
        lblQuant = new javax.swing.JLabel();
        cxQuant = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Renda Variável");

        lblVariavel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblVariavel.setText("Investimento Renda Variável");

        lblNomeInvest.setText("Nome do Investimento");

        lblInstFin.setText("Instituição Financeira");

        lblCodigo.setText("Código do Ativo");

        lblCotacao.setText("Cotação");

        lblQuant.setText("Quantidade");

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
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeInvest)
                            .addComponent(lblInstFin)
                            .addComponent(lblCodigo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblCotacao)
                                    .addComponent(cxCotacao, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(lblQuant)
                                        .addGap(105, 105, 105))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(cxQuant)
                                        .addGap(25, 25, 25))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cxInstFin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                                .addComponent(cxNomeInvest, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cxCodigo, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lblVariavel)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
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
                .addComponent(lblCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCotacao)
                    .addComponent(lblQuant))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxCotacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btSair)
                    .addComponent(btExcluir))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
        limpar();
    }//GEN-LAST:event_btSairActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluir();
        limpar();
        MenuByteInvest.listarTab();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadastrar();
        MenuByteInvest.listarTab();
    }//GEN-LAST:event_btCadastrarActionPerformed

    public void cadastrar() {
        try {
            gerInvest = MenuByteInvest.getConta().getGerInvest();
            if (!(cxInstFin.getText().trim().equals("") || cxNomeInvest.getText().trim().equals("") || cxCotacao.getText().trim().equals("") || cxCodigo.getText().trim().equals("") || cxQuant.getText().trim().equals(""))) {
                invest = new Variavel(cxInstFin.getText(), cxNomeInvest.getText(), cxCodigo.getText(), Integer.parseInt(cxQuant.getText()), Float.parseFloat(cxCotacao.getText()));
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
            JOptionPane.showMessageDialog(null, "A cotação deve ser um float, e a quantidade um inteiro!", "Erro", 0);
        }
    }

    public void excluir() {
        gerInvest = MenuByteInvest.getConta().getGerInvest();
        if (!cxNomeInvest.getText().trim().equals("")) {
            invest = new Variavel(cxNomeInvest.getText());
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

    public void limpar() {
        cxInstFin.setText("");
        cxNomeInvest.setText("");
        cxCodigo.setText("");
        cxCotacao.setText("");
        cxQuant.setText("");
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
            java.util.logging.Logger.getLogger(CadVar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadVar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadVar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadVar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadVar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxCodigo;
    private javax.swing.JTextField cxCotacao;
    private javax.swing.JTextField cxInstFin;
    private javax.swing.JTextField cxNomeInvest;
    private javax.swing.JTextField cxQuant;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCotacao;
    private javax.swing.JLabel lblInstFin;
    private javax.swing.JLabel lblNomeInvest;
    private javax.swing.JLabel lblQuant;
    private javax.swing.JLabel lblVariavel;
    // End of variables declaration//GEN-END:variables
}
