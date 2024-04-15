package Atividade_While;
//@author Carlos Santos
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número inteiro entre 1 e 20: ");
        int lado = teclado.nextInt();

        System.out.println();

        while (lado < 1 || lado > 20) {
            System.out.println("Valor inválido");
            return;
        }
        for(int indice = 0; indice < lado; indice++){
            for(int indice2 = 0; indice2 < lado; indice2++){
                System.out.print("*");
            }
            System.out.println();
        }

    teclado.close();
    }

}
