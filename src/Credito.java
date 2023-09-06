public class Credito extends Conta {
    private int diaFatura;
    private double limite;
    public Credito(int numero, double saldo, int qtdTransacoes, String senha, Pessoa titular, int diaFatura, double limite) {
        super(numero, saldo, qtdTransacoes, senha, titular);
        this.diaFatura = diaFatura;
        this.limite = limite;
    }


}
