public class Conta {
    private int numero;
    private double saldo;
    private int qtdTransacoes;
    private String senha;
    private Pessoa titular;

    public Conta(int numero, double saldo, int qtdTransacoes, String senha, Pessoa titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.qtdTransacoes = qtdTransacoes;
        this.senha = senha;
        this.titular = titular;
    }

    public String menu() {
        return """
                [1] - Pagamento
                [2] - Adicionar saldo.
                [3] - Mostrar Saldo
                """;
    }//aplicar override nas especificas.

    public String pagamento(double valor) {
        if (this.saldo>=valor){
            this.saldo-=valor;
        }
        return "Pagamento realizado com Sucesso.";
    }

    public String credito(double valor) {
        this.saldo+= valor;
        return "Dinheiro adicionado com Sucesso.";
    }


// Getters e Setters.
//=============================================================================================================================================================


    public Pessoa getTitular() {
        return titular;
    }

    public double saldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

//=============================================================================================================================================================
    @Override
    public String toString() {
        return
                "numero=" + numero +
                ", saldo=" + saldo +
                ", qtdTransacoes=" + qtdTransacoes +
                ", senha='" + senha + '\'' +
                ", titular=" + titular;
    }
}
