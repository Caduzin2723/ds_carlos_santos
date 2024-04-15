package Atividade_While;
//@author Carlos Santos
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite um número inteiro: ");
    int n = teclado.nextInt();

    n = n - 1;
    int indice = 0;
    while (indice < n) {
        indice = indice + 2;
        int impar = indice - 1;
        int par = indice;

        System.out.println("\nPar: " + par + " // Ímpar: " + impar);
    }

    teclado.close();
    }

}
