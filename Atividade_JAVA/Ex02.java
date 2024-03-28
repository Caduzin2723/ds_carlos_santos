package Atividade_JAVA;
//@author Carlos Santos
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        System.out.println("Me diga o 1° valor: ");
        float a = teclado.nextFloat();

        System.out.println("Me diga o 2° valor: ");
        float b = teclado.nextFloat();

        //Input das informações necessárias

        System.out.printf("\nO valor de A:%.2f%nOvalor de B:%.2f%n", a, b);

        float c = 0;

        System.out.println("\n----------\nInvertendo os valores\n----------\n");

        c = b;
        b = a;
        a = c;

        // Código que inverte os valores utilizando  o auxiliar

        System.out.printf("O novo valor de A: %.2f%n O novo valor de B:%.2f", a, b);

        teclado.close();
        }

    }
