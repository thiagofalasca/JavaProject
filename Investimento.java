//Aluno: Thiago Falasca Duarte
//Curso: Engenharia de Software IF64D
//Ra: 2350670

import java.util.List;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public abstract class Investimento {

    private String instituicao;
    private String nome;
    private float valorAplicado;

    public Investimento(String instituicao, String nome, float valorAplicado) {
        this.instituicao = instituicao;
        this.nome = nome;
        this.valorAplicado = valorAplicado;
    }

    public Investimento(String nome) {
        this.nome = nome;
    }

    public abstract void calcRent(float tempo);

    public abstract List<String> consultarInvest();

    public String arredonda(double num) {
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);
        return df.format(num);
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorAplicado() {
        return valorAplicado;
    }

    public void setValorAplicado(float valorAplicado) {
        this.valorAplicado = valorAplicado;
    }
}
