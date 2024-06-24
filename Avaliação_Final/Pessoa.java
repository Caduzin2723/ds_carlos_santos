package Avaliação_final;
//@author Carlos Santos
public class Pessoa {
    private String nome = "João";
    private int idade = 16;
    private double altura = 1.79;
    private String cor = "Pardo";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCor() {
        return cor;
    }
}