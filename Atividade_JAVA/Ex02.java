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

        System.out.println("\nO valor de A:" + a + "\nO valor de B:" + b);

        float c = 0;

        System.out.println("\n----------\nInvertendo os valores\n----------\n");

        c = b;
        b = a;
        a = c;

        // Código que inverte os valores utilizando  o auxiliar

        System.out.println("O novo valor de A:" + a + "\nO novo valor de B:" + b);

        teclado.close();
        }

    }
