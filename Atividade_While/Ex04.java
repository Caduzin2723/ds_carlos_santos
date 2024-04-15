package Atividade_While;
//@author Carlos Santos
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite quantos alunos tem na sala: ");
    int alunos = teclado.nextInt();

    int indice = 0;
    float nota_sala = 0;
    while (indice < alunos) {
        indice++;
        System.out.println("Digite a nota do "+ indice + "° aluno: ");
        float nota_aluno = teclado.nextFloat();

        
        nota_sala = nota_sala + nota_aluno;
    }

    float media = nota_sala / alunos;
    System.out.println("\nA média da sala foi " + media);

    teclado.close();
    }

}
