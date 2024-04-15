package Atividade_Laços_de_Repetição;
//@author Carlos Santos
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    float A = 80000;
    float B = 200000;
    int anos = 0;

    while (A < B) {
        A += A * 0.03; // Aumento de 3% na população de A
        B += B * 0.015; // Aumento de 1.5% na população de B
        anos++;
    }

    System.out.println("Após " + anos + " anos, a população do país A ultrapassará ou igualará a população do país B.");
}
}