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

    public void menu(){

    }//aplicar override nas especificas.

    public void pagamento(){

    }
    public void credito(){

    }

    public double saldo(){
        return saldo;
    }

}
