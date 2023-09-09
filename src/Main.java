import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Banco bancoSantoAndre = new Banco("Santo André", "Divisa com o rio Nubank", 123, 0.03, 0.02);
    static Conta logado;

    public static void main(String[] args) {
        System.out.println("Bem Vindo ao Banco " + bancoSantoAndre.getNome() + "!");
        bancoSantoAndre.cadastrarConta();
        logado = login();
        System.out.println("Login realizado com sucesso!");
        manipulaMenuConta();
    }

    public static void manipulaMenuConta() {
        int indice;

        do {
            System.out.println(logado.menu());
            indice = sc.nextInt();

            if (logado instanceof Corrente) {
                switch (indice) {
                    case 1 -> manipulaPagamento();
                    case 2 -> manipulaCredito();
                    case 3 -> System.out.println("Seu saldo atual é de: " + logado.saldo());
                    case 4 -> manipulaSaque();
                    case 5 -> manipulaTransferencia();
                    case 6 -> System.exit(0);
                }
            } else if (logado instanceof Poupanca) {
                switch (indice) {
                    case 1 -> manipulaPagamento();
                    case 2 -> manipulaCredito();
                    case 3 -> System.out.println("Seu saldo atual é de: " + logado.saldo());
                    case 4 -> manipulaSaque();
                    case 5 -> System.exit(0);
                }
            } else {
                switch (indice) {
                    case 1 -> manipulaPagamentoCredito();//pagamento diferente no crédito, implementar lógica em casa. Falta pouca coisa.
                    case 2 -> System.out.println("O valor que virá na sua fatura do mês que vem é: " + logado.saldo());
                    case 3 -> logado.saldo();
                }
            }
        } while (true);
    }

    public static void manipulaPagamentoCredito() {
        System.out.println("Informe o dia da fatura:");
        int diaFatura = sc.nextInt();

        System.out.println("Informe o Valor do seu Pagamento:");
        double valor = sc.nextDouble();

        System.out.println(logado.pagamento(valor, diaFatura));
        simulaDiasPassando(diaFatura);
    }

    public static void simulaDiasPassando(int diaFatura) {
        int i=0;

        for(; i < diaFatura; i++) {
            System.out.println("Dia " + i);
        }
        if (i==diaFatura){
            logado.setSaldo(0);
            System.out.println("Sua fatura foi Paga, seu saldo devedor é de: " + logado.saldo());
        }

    }

    private static void manipulaPagamento() {
        System.out.println("Informe o Valor do seu Pagamento:");
        double valor = sc.nextDouble();

        System.out.println(logado.pagamento(valor));
        System.out.println("Seu Saldo atual: " + logado.saldo());
    }

    private static void manipulaCredito() {
        System.out.println("Informe o Valor que deseja adicionar a sua conta:");
        double valor = sc.nextDouble();

        System.out.println(logado.credito(valor));
        System.out.println("Seu Saldo Atual: " + logado.saldo());
    }

    private static void manipulaTransferencia() {


        for (Conta conta : bancoSantoAndre.getContas()) {
            System.out.println(conta + "\n");
        }

        Conta contaTransferencia = defineContaTransferencia();

        double valor = defineValor();

        if (logado instanceof Corrente) {
            ((Corrente) logado).transferencia(contaTransferencia, valor);
            System.out.println("Você Transferiu seu dinheiro!\nSeu saldo atual é:" + logado.saldo());
            System.out.println(contaTransferencia.saldo());
        }
    }

    public static double defineValor() {
        double valor;
        do {
            System.out.print("Qual o valor da operação? ");
            valor = sc.nextDouble();

            if (logado.saldo() < valor) {
                System.out.println("\nSeu saldo é Insuficiente.\n");
            }
        } while (logado.saldo() < valor);

        return valor;
    }

    public static Conta defineContaTransferencia() {
        System.out.println("Digite o número da conta que você deseja Transferir:");
        int numConta = sc.nextInt();
        return buscaUsuarioTransferencia(numConta);
    }

    public static Conta buscaUsuarioTransferencia(int numConta) {
        for (Conta conta : bancoSantoAndre.getContas()) {
            if (conta.getNumero() == (numConta)) {
                return conta;
            }
        }
        return null;
    }

    private static void manipulaSaque() {
        double valorSaque;
        do {
            System.out.println("Informe o valor que deseja Sacar:");
            valorSaque = sc.nextDouble();

        } while (logado.saldo() < valorSaque);

        if (logado instanceof Corrente) {
            System.out.println(((Corrente) logado).saque(valorSaque));
        } else if (logado instanceof Poupanca) {
            System.out.println(((Poupanca) logado).saque(valorSaque));
        }

    }

    public static Conta login() {
        String senha = "";
        do {
            System.out.println("====== Acesse sua Conta ======");
            System.out.println("Informe a sua Senha:");
            senha = sc.next();
        } while (buscaUsuario(senha) == null);

        return buscaUsuario(senha);
    }

    public static Conta buscaUsuario(String senha) {
        for (Conta conta : bancoSantoAndre.getContas()) {
            if (conta.getSenha().equals(senha)) {
                return conta;
            }
        }
        return null;
    }


}