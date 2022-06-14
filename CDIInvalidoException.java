//Aluno: Thiago Falasca Duarte
//Curso: Engenharia de Software IF64D
//Ra: 2350670

import javax.swing.JOptionPane;

public class CDIInvalidoException extends Exception {

    public void reparaCDI(ContaCorrente conta) {
        try {
            JOptionPane.showMessageDialog(null, "A porcentagem do CDI deve ser um numero inteiro maior do que zero!", "Porcentagem invalida", 0);
            int CDI = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a porcentagem do CDI!", "Porcentagem CDI", JOptionPane.QUESTION_MESSAGE));
            if (CDI <= 0) {
                conta.setPorcentCDI(CDI);
            }
        } catch (CDIInvalidoException ex) {
            ex.reparaCDI(conta);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "A porcentagem do CDI deve ser um numero inteiro positivo!", "Porcentagem invalida", 0);
        }
    }
}