package casa;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("nome", 20); // Altere "Seu nome" e a idade

        for(int i = 0; i < 3; i++){
            p1.fazAniversario();
            System.out.println("Nome: " + p1.getNome() + ", Idade: " + p1.getIdade());
        }
    }
}
