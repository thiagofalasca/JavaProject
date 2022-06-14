//Aluno: Thiago Falasca Duarte
//Curso: Engenharia de Software IF64D
//Ra: 2350670

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public final class Fixa extends Investimento implements Tributavel {

    private String papel;
    private String tipoImposto;
    private Double taxaAnual;
    private final List<String> dados = new ArrayList<>();

    public Fixa(String instituicao, String nome, float valorAplicado,
            String papel, String tipoImposto, Double taxaAnual) {
        super(instituicao, nome, valorAplicado);
        this.papel = papel;
        this.tipoImposto = tipoImposto;
        this.taxaAnual = taxaAnual;
    }

    public Fixa(String nome) {
        super(nome);
    }

    //Sobrescrita
    @Override
    public List<String> consultarInvest() {
        float t = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite quantos meses o dinheiro ficou investido", "Consulta", JOptionPane.QUESTION_MESSAGE));
        dados.add(getPapel());
        dados.add(getTipoImposto());
        dados.add(getTaxaAnual().toString());
        calcRent(t);
        return dados;
    }

    // Sobrescrita
    @Override
    public void calcRent(float tempo) {
        float c = getValorAplicado();
        double taxa = getTaxaAnual();
        double imposto = 1;
        double m = c * (Math.pow(1 + (taxa / 100), tempo / 12));
        if (getTipoImposto().equals("Regressivo")) {
            imposto = calculaImposto(tempo);
        }
        double tr = (((m - c) * imposto) / c);
        dados.add(arredonda(m));
        dados.add(arredonda(c + (c * tr)));
        dados.add(arredonda(tr * 100));
    }

    // Sobrescrita
    @Override
    public double calculaImposto(float tempo) {

        if (tempo <= 180) {
            return 0.775;
        } else if (180 < tempo || tempo <= 360) {
            return 0.8;
        } else if (360 < tempo || tempo <= 720) {
            return 0.825;
        } else {
            return 0.85;
        }
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public String getTipoImposto() {
        return tipoImposto;
    }

    public void setTipoImposto(String tipoImposto) {
        this.tipoImposto = tipoImposto;
    }

    public Double getTaxaAnual() {
        return taxaAnual;
    }

    public void setTaxaAnual(Double taxaAnual) {
        this.taxaAnual = taxaAnual;
    }
}
