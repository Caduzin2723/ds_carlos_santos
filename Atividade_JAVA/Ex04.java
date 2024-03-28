package Atividade_JAVA;
//@author Carlos Santos
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        System.out.println("Diga um valor inteiro: ");
        int numero = teclado.nextInt();

        //Input das informações necessárias

        numero = numero - 1; //Fórmula para descobri o antecessor

        System.out.println("\nO antecessor do seu número é o " + numero);

        teclado.close();
    }

}
