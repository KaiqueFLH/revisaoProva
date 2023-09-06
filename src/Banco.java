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

//================================================================================================================================================================

    public void cadastrarConta(){
        
    }


}
