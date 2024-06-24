package Avaliação_final;
//@author Carlos Santos
import Avaliação_Final.Pessoa;

public class AlterarDados {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Wagner");
        pessoa.setIdade(17);
        pessoa.setAltura(1.83);

        System.out.println("Dados alterados com sucesso!");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade() + " anos");
        System.out.println("Altura: " + pessoa.getAltura() + "m");
        System.out.println("Cor: " + pessoa.getCor());
    }

}
