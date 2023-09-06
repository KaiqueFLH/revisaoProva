public class Corrente extends Conta {

    double limite;

    public Corrente(int numero, double saldo, int qtdTransacoes, String senha, Fisica titular, double limite) {
        super(numero, saldo, qtdTransacoes, senha, titular);
        this.limite = limite;
    }

    @Override
    public String menu(){

        return super.menu()+ """
                [4] - Saque.
                [5] - Transferir dinheiro.
                [6] - Sair da conta.
                """ ;
    }

    public void transferencia(Conta contaReceber,double valor){
        this.setSaldo(this.saldo()-valor);
        contaReceber.setSaldo(contaReceber.saldo()+valor);
    }



    public String saque(double valor){
        if (saldo()>=valor){
            setSaldo(saldo()-valor);
        }
        return "Saque realizado com Sucesso."+"Seu saldo Atual na conta é : "+saldo();
    }

    @Override
    public String toString() {
        return "Corrente{" +
                "limite=" + limite +", "+
                super.toString()+
                "}";
    }
}
