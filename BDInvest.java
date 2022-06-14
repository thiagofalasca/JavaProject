//Aluno: Thiago Falasca Duarte
//Curso: Engenharia de Software IF64D
//Ra: 2350670

import java.util.List;
import java.util.ArrayList;

public class BDInvest {

    private final List<Investimento> bdInvest = new ArrayList<>();

    public List<Investimento> getbdInvest() {
        return bdInvest;
    }

    public Investimento cadInvest(Investimento invest) {

        if (consInvestNome(invest) == null) {
            bdInvest.add(invest);
            return invest;
        } else {
            return null;
        }

    }

    public Investimento consInvestNome(Investimento invest) {
        for (int i = 0; i < bdInvest.size(); i++) {
            if (invest.getNome().equals(bdInvest.get(i).getNome())) {
                return bdInvest.get(i);
            }
        }
        return null;
    }

    public Investimento removeInvestNome(Investimento invest) {
        invest = consInvestNome(invest);
        if (invest != null) {
            bdInvest.remove(invest);
            return null;
        } else {
            return invest;
        }
    }

    public Investimento atualizaInvestNome(Investimento invest) {
        for (int i = 0; i < bdInvest.size(); i++) {
            if (invest.getNome().equals(bdInvest.get(i).getNome())) {
                bdInvest.set(i, invest);
                return bdInvest.get(i);
            }
        }
        return null;
    }
}
