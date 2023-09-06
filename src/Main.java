import java.util.ArrayList;

public class Main {
    static Banco bancoSantoAndre = new Banco("Santo André","Divisa com o rio Nubank", 123,0.03,0.02);

    public static void main(String[] args) {
        System.out.println("Bem Vindo ao Banco "+bancoSantoAndre.getNome()+"!");
    }


}