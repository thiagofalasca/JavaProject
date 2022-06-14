//Aluno: Thiago Falasca Duarte
//Curso: Engenharia de Software IF64D
//Ra: 2350670

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public final class ContaCorrente extends Investimento {

    private String nomeBanco;
    private String eRentavel;
    private int porcentCDI;
    private final List<String> dados = new ArrayList<>();

    public ContaCorrente(String instituicao, String nome, float valorAplicado, String nomeBanco, String eRentavel) {
        super(instituicao, nome, valorAplicado);
        this.nomeBanco = nomeBanco;
        this.eRentavel = eRentavel;
    }

    public ContaCorrente(String nome) {
        super(nome);
    }

    //Sobrescrita
    @Override
    public List<String> consultarInvest() {
        float t = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite quantos meses o dinheiro ficou investido", "Consulta", JOptionPane.QUESTION_MESSAGE));
        dados.add(getNomeBanco());
        if (eRentavel.equals("Sim")) {
            calcRent(t);
        }
        return dados;
    }

    //Sobrescrita
    @Override
    public void calcRent(float tempo) {
        float c = getValorAplicado();
        float cdi = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a taxa CDI atual", "Taxa CDI", JOptionPane.QUESTION_MESSAGE));
        double taxa = this.porcentCDI * cdi / 100;
        double m = c * (Math.pow(1 + (taxa / 100), tempo / 12));
        dados.add(arredonda(taxa));
        dados.add(arredonda(m));
    }

    public int getPorcentCDI() {
        return porcentCDI;
    }

    public void setPorcentCDI(int porcentCDI) throws CDIInvalidoException {
        this.porcentCDI = porcentCDI;
        if (eRentavel.equals("Sim") && porcentCDI <= 0) {
            throw new CDIInvalidoException();
        }
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String geteRentavel() {
        return eRentavel;
    }

    public void seteRentavel(String eRentavel) {
        this.eRentavel = eRentavel;
    }
}
