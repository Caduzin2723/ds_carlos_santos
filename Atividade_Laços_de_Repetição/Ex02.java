package Atividade_Laços_de_Repetição;
//@author Carlos Santos
import java.util.Scanner;

public class Ex02 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite o 1° número: ");
    float n1 = teclado.nextFloat();

    System.out.println("\nDigite o 2° número: ");
    float n2 = teclado.nextFloat();

    while (n2 == 0){
        System.out.println("\nValor Inválido!\n");
        System.out.println("Digite o 2° número: ");
        n2 = teclado.nextFloat();
    }
    float resultado = n1 / n2;

    System.out.printf("O resultado da divisão é %.2f", resultado);

    teclado.close();
    }

} 
