public class Fisica extends Pessoa {
    private long cpf;
    private String nomeCompleto;
    public Fisica(String endereco,long cpf, String nomeCompleto) {
        super(endereco);
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
}
