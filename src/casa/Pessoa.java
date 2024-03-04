package casa;

public class Pessoa {
    private String nome;
    private double idade;

    public Pessoa(String nome, double idade){
        this.nome = nome;
        this.idade = idade;
    }
    public void fazAniversario() {
        idade++;
    }

    public String getNome() {
        return nome;
    }

    public double getIdade() {
        return idade;
    }

}

