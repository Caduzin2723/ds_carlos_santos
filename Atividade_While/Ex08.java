package Atividade_While;
//@author Carlos Santos
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número inteiro entre 1 e 20: ");
        int lado = teclado.nextInt();
        teclado.close();

        System.out.println();

        while (lado < 1 || lado > 20) {
            System.out.println("Valor inválido");
            return;
        }

        for (int i = 0; i < lado; i++) { // Primeira linha
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < lado - 2; i++) { // Meio
            System.out.print("*");
            for (int j = 0; j < lado - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
        for (int i = 0; i < lado; i++) { // Última linha
            System.out.print("*");
        }
        System.out.println();

    }

}
