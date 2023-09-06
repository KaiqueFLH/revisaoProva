public class Pessoa {
    private String endereco;

    public Pessoa(String endereco) {
        this.endereco = endereco;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "endereco='" + endereco + '\'' +
                '}';
    }
}
