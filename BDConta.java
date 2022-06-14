//Aluno: Thiago Falasca Duarte
//Curso: Engenharia de Software IF64D
//Ra: 2350670

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BDConta {

    private final List<Conta> bdConta = new ArrayList<>();

    public List<Conta> getBdConta() {
        return bdConta;
    }

    public Conta cadConta(Conta conta) {

        if (consContaUsuario(conta) == null) {
            bdConta.add(conta);
            return conta;
        } else {
            return null;
        }
    }

    public Conta consContaUsuario(Conta conta) {
        for (int i = 0; i < bdConta.size(); i++) {
            if (conta.getUsuario().equals(bdConta.get(i).getUsuario())) {
                return bdConta.get(i);
            }
        }
        return null;
    }

    public Conta removeContaUsuario(Conta conta) {
        conta = consContaUsuario(conta);
        if (conta != null) {
            bdConta.remove(conta);
            return null;
        } else {
            return conta;
        }
    }

    public String alterarContaUsuario(Conta conta) {
        for (int i = 0; i < bdConta.size(); i++) {
            if (conta.getUsuario().equals(bdConta.get(i).getUsuario())) {
                String senha = JOptionPane.showInputDialog(null, "Informe a nova senha", "Autalização", JOptionPane.QUESTION_MESSAGE);
                if (senha != null) {
                    conta.setSenha(senha);
                    bdConta.set(i, conta);
                    JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!", "Senha alterada", 1);
                    return senha;
                }
            }
        }
        return "";
    }
}
