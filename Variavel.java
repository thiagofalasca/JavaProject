//Aluno: Thiago Falasca Duarte
//Curso: Engenharia de Software IF64D
//Ra: 2350670

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public final class Variavel extends Investimento {

    private String codigoAtivo;
    private int quantidade;
    private float cotacao;
    private final List<String> dados = new ArrayList<>();

    public Variavel(String instituicao, String nome,
            String codigoAtivo, int quantidade, float cotacao) {
        super(instituicao, nome, quantidade * cotacao);
        this.codigoAtivo = codigoAtivo;
        this.quantidade = quantidade;
        this.cotacao = cotacao;
    }

    public Variavel(String nome) {
        super(nome);
    }

    //Sobrescrita
    @Override
    public List<String> consultarInvest() {
        float t = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite quantos meses o dinheiro ficou investido!", "Consulta", JOptionPane.QUESTION_MESSAGE));
        dados.add(getCodigoAtivo());
        dados.add(Integer.toString(getQuantidade()));
        dados.add(Float.toString(getCotacao()));
        calcRent(t);
        return dados;
    }

    // Sobrescrita
    @Override
    public void calcRent(float tempo) {
        Double m = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a cotação atual do ativo!", "Cotação Atual", JOptionPane.QUESTION_MESSAGE)) * this.quantidade;
        float c = this.cotacao * this.quantidade;
        double taxa = ((m - c) / c) * 100;
        double tr = (((m - c) * 0.8) / c);
        dados.add(arredonda(taxa));
        dados.add(arredonda(m));
        dados.add(arredonda(tr * 100));
        dados.add(arredonda(c + (c * tr)));
    }

    public String getCodigoAtivo() {
        return codigoAtivo;
    }

    public void setCodigoAtivo(String codigoAtivo) {
        this.codigoAtivo = codigoAtivo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getCotacao() {
        return cotacao;
    }

    public void setCotacao(float cotacao) {
        this.cotacao = cotacao;
    }
}
