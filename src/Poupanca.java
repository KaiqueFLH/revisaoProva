public class Poupanca extends Conta {

    public Poupanca(int numero, double saldo, int qtdTransacoes, String senha, Pessoa titular) {
        super(numero, saldo, qtdTransacoes, senha, titular);
    }

    public String saque(double valor){
        if (saldo()>=valor){
            setSaldo(saldo()-valor);
        }
        return "Saque realizado com Sucesso."+"Seu saldo Atual na conta é : "+saldo();
    }

    @Override
    public String menu(){

        return super.menu()+ """
                [4] - Saque.
                [5] - Sair da conta.
                """ ;
    }

    @Override
    public String toString() {
        return "Poupança{"+super.toString()+"}";
    }
}
