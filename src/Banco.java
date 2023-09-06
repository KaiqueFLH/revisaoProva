import java.util.ArrayList;

public class Banco {

    // Criação dos Atributos do banco.
    private String nome;
    private String endereco;
    private int agencia;
    private ArrayList<Conta> contas;
    private double juros;
    private double taxaDeServico;

    // Criação do Construtor do Banco.
    public Banco(String nome, String endereco, int agencia, double juros, double taxaDeServico) {
        this.nome = nome;
        this.endereco = endereco;
        this.agencia = agencia;
        this.contas = new ArrayList<>();
        this.juros = juros;
        this.taxaDeServico = taxaDeServico;
    }
//================================================================================================================================================================
// Getters e Setters.
    public String getNome() {
        return nome;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

//================================================================================================================================================================

    public void cadastrarConta(){
        Conta kaique = new Corrente(1,1335,0,"k",new Fisica("Condominio",624797363,"Kaique Fernandes"),10000);
        Conta ana = new Poupanca(2,3000,1,"a", new Pessoa("Centro"));
        Conta otavio = new Credito(3,0,0,"o",new Pessoa("Rua são januário"),19, 100000);
        this.contas.add(kaique);
        this.contas.add(ana);
        this.contas.add(otavio);
    }


}
