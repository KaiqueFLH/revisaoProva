public class Corrente extends Conta {

    double limite;

    public Corrente(int numero, double saldo, int qtdTransacoes, String senha, Pessoa titular, double limite) {
        super(numero, saldo, qtdTransacoes, senha, titular);
        this.limite = limite;
    }

    public void transferencia(){

    }

    public void saque(){

    }

}
