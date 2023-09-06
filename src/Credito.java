public class Credito extends Conta {
    private int diaFatura;
    private double limite;
    public Credito(int numero, double saldo, int qtdTransacoes, String senha, Pessoa titular, int diaFatura, double limite) {
        super(numero, saldo, qtdTransacoes, senha, titular);
        this.diaFatura = diaFatura;
        this.limite = limite;
    }

    @Override
    public String menu(){

        return """
                [1] - Pagar no Crédito.
                [2] - Mostrar Saldo Devedor.
                [3] - Sair da Conta.
                """ ;
    }



    @Override
    public String toString() {
        return "Credito{" +
                "diaFatura=" + diaFatura +
                ", limite=" + limite +
                ", "+ super.toString()+
                '}';
    }
}
