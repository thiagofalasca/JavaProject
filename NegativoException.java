//Aluno: Thiago Falasca Duarte
//Curso: Engenharia de Software IF64D
//Ra: 2350670

import javax.swing.JOptionPane;

public class NegativoException extends Exception {

    public void reparaSaque(Conta conta) {
        try {
            JOptionPane.showMessageDialog(null, "Não é possível sacar um valor menor ou igual a zero!", "Saque inválido", 0);
            String valor = JOptionPane.showInputDialog(null, "Digite o quando deseja sacar", "Saque", JOptionPane.QUESTION_MESSAGE);
            if (valor != null) {
                conta.saca(Float.parseFloat(valor));
            }
        } catch (NegativoException ex) {
            ex.reparaSaque(conta);
        } catch (SaldoInsuficienteException ex) {
            ex.reparaSaldo(conta);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "O valor deve ser um numero real!", "Valor inválido", 0);
        }
    }

    public void reparaDeposito(Conta conta) {
        try {
            JOptionPane.showMessageDialog(null, "Não é possível depositar um valor menor ou igual a zero!", "Depósito inválido", 0);
            String valor = JOptionPane.showInputDialog(null, "Digite o quando deseja depositar", "Deposito", JOptionPane.QUESTION_MESSAGE);
            if (valor != null) {
                conta.deposita(Float.parseFloat(valor));
            }
        } catch (NegativoException ex) {
            ex.reparaDeposito(conta);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "O valor deve ser um numero real!", "Valor inválido", 0);
        }
    }
}
