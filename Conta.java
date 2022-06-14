//Aluno: Thiago Falasca Duarte
//Curso: Engenharia de Software IF64D
//Ra: 2350670

public class Conta {

    private String usuario;
    private String senha;
    private float saldo;
    private Cliente cliente;
    private final BDInvest gerInvest;

    public BDInvest getGerInvest() {
        return gerInvest;
    }

    public Conta(String usuario, String senha) {
        this.gerInvest = new BDInvest();
        this.usuario = usuario;
        this.senha = senha;
    }

    public Conta(String usuario, String senha, String nome, int cpf, int idade) {
        this.gerInvest = new BDInvest();
        this.usuario = usuario;
        this.senha = senha;
        cliente = new Cliente(nome, cpf, idade);
    }

    public boolean logar(String usuario, String senha) {
        boolean validado = false;
        if (usuario.equals(this.usuario) && senha.equals(this.senha)) {
            validado = true;
        }
        return validado;
    }

    public void deposita(float valor) throws NegativoException {
        if (valor <= 0) {
            throw new NegativoException();
        }
        this.saldo += valor;
    }

    public void saca(float valor) throws SaldoInsuficienteException, NegativoException {
        if (valor <= 0) {
            throw new NegativoException();
        }
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException();
        }
        this.saldo -= valor;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
