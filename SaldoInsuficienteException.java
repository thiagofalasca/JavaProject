//Aluno: Thiago Falasca Duarte
//Curso: Engenharia de Software IF64D
//Ra: 2350670

import javax.swing.JOptionPane;

public class SaldoInsuficienteException extends Exception {

    public void reparaSaldo(Conta conta) {
        try {
            JOptionPane.showMessageDialog(null, "O saldo é insuficiente", "Saldo insuficiente", 0);
            String valor = JOptionPane.showInputDialog(null, "Digite o quando deseja sacar", "Saque", JOptionPane.QUESTION_MESSAGE);
            if (valor != null) {
                conta.saca(Float.parseFloat(valor));
            }
        } catch (SaldoInsuficienteException ex) {
            ex.reparaSaldo(conta);
        } catch (NegativoException ex) {
            ex.reparaSaque(conta);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "O valor deve ser um numero real!", "Valor inválido", 0);
        }
    }
}
