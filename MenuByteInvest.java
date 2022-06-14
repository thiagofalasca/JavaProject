//Aluno: Thiago Falasca Duarte
//Curso: Engenharia de Software IF64D
//Ra: 2350670

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuByteInvest extends javax.swing.JFrame {

    private static Conta conta;
    private static MenuByteInvest menuByteUnico;

    public static void setConta(Conta conta) {
        MenuByteInvest.conta = conta;
    }

    public static Conta getConta() {
        return conta;
    }

    public MenuByteInvest() {
        initComponents();
    }

    public static MenuByteInvest getMenuByte() {
        if (menuByteUnico == null) {
            menuByteUnico = new MenuByteInvest();
        }
        return menuByteUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSair = new javax.swing.JButton();
        lblCarteira = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInvest = new javax.swing.JTable();
        MenuBar = new javax.swing.JMenuBar();
        mnConta = new javax.swing.JMenu();
        mnItAltSenha = new javax.swing.JMenuItem();
        mnItDelConta = new javax.swing.JMenuItem();
        mnSaldo = new javax.swing.JMenu();
        mnItSacar = new javax.swing.JMenuItem();
        mnItDepositar = new javax.swing.JMenuItem();
        mnItConsultar = new javax.swing.JMenuItem();
        mnInvest = new javax.swing.JMenu();
        mnItFixa = new javax.swing.JMenuItem();
        mnItVar = new javax.swing.JMenuItem();
        mnItCC = new javax.swing.JMenuItem();
        mnConsulta = new javax.swing.JMenu();
        consFixa = new javax.swing.JMenuItem();
        consVar = new javax.swing.JMenuItem();
        consCC = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Carteira ByteInvest");

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        lblCarteira.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCarteira.setText("Carteira de Investimentos");

        tblInvest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome Investimento", "Instituição Financeira", "Valor Aplicado"
            }
        ));
        jScrollPane1.setViewportView(tblInvest);

        mnConta.setText("Conta");

        mnItAltSenha.setText("Alterar senha");
        mnItAltSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItAltSenhaActionPerformed(evt);
            }
        });
        mnConta.add(mnItAltSenha);

        mnItDelConta.setText("Apagar conta");
        mnItDelConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItDelContaActionPerformed(evt);
            }
        });
        mnConta.add(mnItDelConta);

        mnSaldo.setText("Saldo");

        mnItSacar.setText("Sacar");
        mnItSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItSacarActionPerformed(evt);
            }
        });
        mnSaldo.add(mnItSacar);

        mnItDepositar.setText("Depositar");
        mnItDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItDepositarActionPerformed(evt);
            }
        });
        mnSaldo.add(mnItDepositar);

        mnItConsultar.setText("Consultar");
        mnItConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItConsultarActionPerformed(evt);
            }
        });
        mnSaldo.add(mnItConsultar);

        mnConta.add(mnSaldo);

        MenuBar.add(mnConta);

        mnInvest.setText("Investimentos");

        mnItFixa.setText("Renda Fixa");
        mnItFixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItFixaActionPerformed(evt);
            }
        });
        mnInvest.add(mnItFixa);

        mnItVar.setText("Renda Variável");
        mnItVar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItVarActionPerformed(evt);
            }
        });
        mnInvest.add(mnItVar);

        mnItCC.setText("Conta Corrente");
        mnItCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItCCActionPerformed(evt);
            }
        });
        mnInvest.add(mnItCC);

        MenuBar.add(mnInvest);

        mnConsulta.setText("Consulta");

        consFixa.setText("Renda FIxa");
        consFixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consFixaActionPerformed(evt);
            }
        });
        mnConsulta.add(consFixa);

        consVar.setText("Renda Variavel");
        consVar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consVarActionPerformed(evt);
            }
        });
        mnConsulta.add(consVar);

        consCC.setText("Conta Corrente");
        consCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consCCActionPerformed(evt);
            }
        });
        mnConsulta.add(consCC);

        MenuBar.add(mnConsulta);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSair)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCarteira)
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(lblCarteira)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void mnItAltSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItAltSenhaActionPerformed
        alterar();
    }//GEN-LAST:event_mnItAltSenhaActionPerformed

    private void mnItDelContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItDelContaActionPerformed
        excluir();
    }//GEN-LAST:event_mnItDelContaActionPerformed

    private void mnItSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItSacarActionPerformed
        sacar();
    }//GEN-LAST:event_mnItSacarActionPerformed

    private void mnItDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItDepositarActionPerformed
        depositar();
    }//GEN-LAST:event_mnItDepositarActionPerformed

    private void mnItConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItConsultarActionPerformed
        consulta();
    }//GEN-LAST:event_mnItConsultarActionPerformed

    private void mnItFixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItFixaActionPerformed
        CadFixa.getCadFixa().setVisible(true);
    }//GEN-LAST:event_mnItFixaActionPerformed

    private void consFixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consFixaActionPerformed
        ConsultaFixa.getConsFixa().setVisible(true);
    }//GEN-LAST:event_consFixaActionPerformed

    private void mnItCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItCCActionPerformed
        CadCorrente.getCadCorrente().setVisible(true);
    }//GEN-LAST:event_mnItCCActionPerformed

    private void consCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consCCActionPerformed
        ConsultaCorrente.getConsCorrente().setVisible(true);
    }//GEN-LAST:event_consCCActionPerformed

    private void mnItVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItVarActionPerformed
        CadVar.getCadVar().setVisible(true);
    }//GEN-LAST:event_mnItVarActionPerformed

    private void consVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consVarActionPerformed
        ConsultaVar.getConsVar().setVisible(true);
    }//GEN-LAST:event_consVarActionPerformed

    public static void listarTab() {
        DefaultTableModel modelo = (DefaultTableModel) tblInvest.getModel();
        int posLin = 0;
        modelo.setRowCount(posLin);
        for (Investimento invest : conta.getGerInvest().getbdInvest()) {
            modelo.insertRow(posLin, new Object[]{invest.getNome(), invest.getInstituicao(), invest.getValorAplicado()});
            posLin++;
        }
    }

    public void consulta() {
        JOptionPane.showMessageDialog(null, "Saldo: " + conta.getSaldo(), "Saldo", 1);
    }

    public void depositar() {
        try {
            String valor = JOptionPane.showInputDialog(null, "Digite o valor que deseja depositar", "Depósito", JOptionPane.QUESTION_MESSAGE);
            if (valor != null) {
                conta.deposita(Float.parseFloat(valor));
                JOptionPane.showMessageDialog(null, "Depósito efetuado com sucesso!", "Depósito", 1);
            }
        } catch (NegativoException ex) {
            ex.reparaDeposito(conta);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "O valor deve ser um numero real", "Valor inválido", 0);
        }
    }

    public void sacar() {
        try {
            String valor = JOptionPane.showInputDialog(null, "Digite o quando deseja sacar", "Saque", JOptionPane.QUESTION_MESSAGE);
            if (valor != null) {
                conta.saca(Float.parseFloat(valor));
                JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso!", "Saque efetuado", 1);
            }
        } catch (SaldoInsuficienteException ex) {
            ex.reparaSaldo(conta);
        } catch (NegativoException ex) {
            ex.reparaSaque(conta);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "O valor deve ser um numero real!", "Valor inválido", 0);
        }
    }

    public void excluir() {
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente excluir a conta?", "Excluir conta", JOptionPane.YES_NO_CANCEL_OPTION) == 0) {
            if (conta.getSenha().equals(JOptionPane.showInputDialog(null, "Digite a senha da conta", "Senha", JOptionPane.QUESTION_MESSAGE))) {
                CadConta.getGerConta().removeContaUsuario(conta);
                JOptionPane.showMessageDialog(null, "Conta excluida com sucesso", "Conta excluida", 1);
                dispose();
                Principal.getPrincipal().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Senha incorreta", "Senha incorreta", 0);
            }
        }
    }

    public void alterar() {
        if (conta.getSenha().equals(JOptionPane.showInputDialog(null, "Digite a senha atual", "Senha Atual", JOptionPane.QUESTION_MESSAGE))) {
            String senhaNova = CadConta.getGerConta().alterarContaUsuario(conta);
            if (senhaNova.equals("")) {
                conta.setSenha(senhaNova);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Senha atual incorreta", "Senha errada", 0);
        }
    }

    public void sair() {
        if (JOptionPane.showConfirmDialog(null, "Deseja sair da conta?", "Saida", JOptionPane.YES_NO_CANCEL_OPTION) == 0) {
            this.dispose();
            CadCorrente.getCadCorrente().setVisible(false);
            ConsultaCorrente.getConsCorrente().setVisible(false);
            CadFixa.getCadFixa().setVisible(false);
            ConsultaFixa.getConsFixa().setVisible(false);
            CadVar.getCadVar().setVisible(false);
            ConsultaVar.getConsVar().setVisible(false);
            Principal.getPrincipal().setVisible(true);
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
            java.util.logging.Logger.getLogger(MenuByteInvest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuByteInvest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuByteInvest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuByteInvest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuByteInvest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JButton btSair;
    private javax.swing.JMenuItem consCC;
    private javax.swing.JMenuItem consFixa;
    private javax.swing.JMenuItem consVar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCarteira;
    private javax.swing.JMenu mnConsulta;
    private javax.swing.JMenu mnConta;
    private javax.swing.JMenu mnInvest;
    private javax.swing.JMenuItem mnItAltSenha;
    private javax.swing.JMenuItem mnItCC;
    private javax.swing.JMenuItem mnItConsultar;
    private javax.swing.JMenuItem mnItDelConta;
    private javax.swing.JMenuItem mnItDepositar;
    private javax.swing.JMenuItem mnItFixa;
    private javax.swing.JMenuItem mnItSacar;
    private javax.swing.JMenuItem mnItVar;
    private javax.swing.JMenu mnSaldo;
    private static javax.swing.JTable tblInvest;
    // End of variables declaration//GEN-END:variables
}
